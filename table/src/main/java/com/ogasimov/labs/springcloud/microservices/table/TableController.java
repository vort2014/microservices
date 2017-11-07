package com.ogasimov.labs.springcloud.microservices.table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TableController {
    @Autowired
    private TableService tableService;

    @GetMapping("/tables")
    public List<Integer> getTables() {
        return tableService.getTableIds();
    }

    @GetMapping("/tables/free")
    public List<Integer> getFreeTables() {
        return tableService.getFreeTableIds();
    }

    @PutMapping("/table/{id}/free")
    public void freeTable(@PathVariable Integer id) {
        tableService.updateTable(id, true);
    }

    @PutMapping("/table/{id}/occupy")
    public void occupyTable(@PathVariable Integer id) {
        tableService.updateTable(id, false);
    }
}
