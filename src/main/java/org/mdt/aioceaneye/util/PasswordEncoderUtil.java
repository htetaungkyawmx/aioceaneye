package org.mdt.aioceaneye.util;

import org.mdt.aioceaneye.model.User;
import org.mdt.aioceaneye.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PasswordEncoderUtil {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @EventListener(ApplicationReadyEvent.class)
    public void encodeExistingPasswords() {
        List<User> users = userRepo.findAll();
        for (User user : users) {
            if (!user.getUserPassword().startsWith("$2a$")) {
                // Correct setter usage
                user.setUserPassword(passwordEncoder.encode(user.getUserPassword()));
                userRepo.save(user);
            }
        }
    }
}
