//package org.mdt.aioceaneye.util;
//
//import org.mdt.aioceaneye.model.Users;
//import org.mdt.aioceaneye.repository.UsersRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.event.ApplicationReadyEvent;
//import org.springframework.context.event.EventListener;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Component
//public class PasswordEncoderUtil {
//
//    @Autowired
//    private UsersRepo usersRepo;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @EventListener(ApplicationReadyEvent.class)
//    public void encodeExistingPasswords() {
//        List<Users> users = usersRepo.findAll();
//        for (Users user : users) {
//            if (!user.getPassword().startsWith("$2a$")) {
//                user.setPassword(passwordEncoder.encode(user.getPassword()));
//                usersRepo.save(user);
//            }
//        }
//    }
//}
