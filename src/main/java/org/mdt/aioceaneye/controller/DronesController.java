//package org.mdt.aioceaneye.controller;
//
//import org.mdt.aioceaneye.dto.DronesDTO;
//import org.mdt.aioceaneye.model.Drones;
//import org.mdt.aioceaneye.service.DronesService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/drones")
//public class DronesController {
//
//    private final DronesService droneService;
//
//    @Autowired
//    public DronesController(DronesService droneService) {
//        this.droneService = droneService;
//    }
//
//    @PostMapping
//    public ResponseEntity<String> createDrone(@RequestBody DronesDTO dronesDTO) {
//        droneService.save(dronesDTO);
//        return ResponseEntity.ok("Drone created Successfully!");
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Drones> getDroneById(@PathVariable int id) {
//        return droneService.findById(id)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).body(null));
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Drones> updateDrone(@PathVariable int id, @RequestBody DronesDTO droneDto) {
//        return droneService.update(id, droneDto)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteDrone(@PathVariable int id) {
//        if (droneService.findById(id).isPresent()) {
//            droneService.delete(id);
//            return ResponseEntity.noContent().build();
//        }
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//    }
//}
