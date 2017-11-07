package com.ogasimov.labs.springcloud.microservices.guest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GuestController {

    @Autowired
    private DinnerService dinnerService;

    @PostMapping("/dinner")
    public Integer startDinner(@RequestBody List<Integer> menuItems) {
        return dinnerService.startDinner(menuItems);
    }

    @DeleteMapping("/dinner/{tableId}")
    public void finishDinner(@PathVariable Integer tableId) {
        dinnerService.finishDinner(tableId);
    }
}
