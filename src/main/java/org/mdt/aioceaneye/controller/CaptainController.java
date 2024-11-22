package org.mdt.aioceaneye.controller;

import org.mdt.aioceaneye.dto.CaptainDto;
import org.mdt.aioceaneye.model.Captain;
import org.mdt.aioceaneye.service.CaptainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("org/captain")
public class CaptainController {

    @Autowired
    private CaptainService captainService;

    @PostMapping("/create")
    public ResponseEntity<Captain> create(@RequestBody CaptainDto captainDto) {
        Captain createCaptain = captainService.save(captainDto);
        return new ResponseEntity<>(createCaptain, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Captain>> getAll() {
        List<Captain> captains = captainService.findAll();
        return new ResponseEntity<>(captains, HttpStatus.OK);
    }

}
