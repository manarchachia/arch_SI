package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.autoloc.domain.Maintenance;
import tn.esprit.autoloc.service.IMaintenanceService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/Maintenance")
public class MaintenanceController {

    private final IMaintenanceService imaintenance;

    @PostMapping("/AddMaintenance")
    public Maintenance AddMaintenance(@RequestBody Maintenance x) {
        return imaintenance.addMaintenance(x);
    }

    @GetMapping("/GetMaintenance")
    public List<Maintenance> getMaintenance() {
        return imaintenance.retrieveAllMaintenances();
    }

    @DeleteMapping("/DeleteMaintenance/{id}")
    public void DeleteMaintenance(@PathVariable Long id) {
        imaintenance.removeMaintenance(id);
    }

    @PostMapping("/addAllMaintenance")
    public List<Maintenance> addAllMaintenance(@RequestBody List<Maintenance> listeMaintenance) {
        return imaintenance.addMaintenances(listeMaintenance);
    }
}
