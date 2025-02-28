package org.mdt.aioceaneye;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mdt.aioceaneye.dto.drone.DroneRegisterForm;
import org.mdt.aioceaneye.service.DroneModelInfoService;
import org.mdt.aioceaneye.service.DroneService;
import org.mdt.aioceaneye.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DroneRegisterTest {

    @Autowired
    private DroneService droneService;

    @Autowired
    private MaterialService materialService;

    @Autowired
    private DroneModelInfoService droneModelInfoService;

    @Test
    public void testRegisterDrone(){
        var form = new DroneRegisterForm("image", "DM1001", "MDT1001");
        droneService.registerDrone(form);
    }

    @Test
    public void findModelByModelName(){
        var model = droneModelInfoService.getDroneModelInfoByModelNo("DM1004");
        Assertions.assertNotNull(model);
    }
}
