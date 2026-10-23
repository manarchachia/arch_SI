package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.service.IEquipementService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/Equipement")
public class EquipementController {

    private final IEquipementService iequipement;

    @PostMapping("/AddEquipement")
    public Equipement AddEquipement(@RequestBody Equipement x) {
        return iequipement.addEquipement(x);
    }

    @GetMapping("/GetEquipement")
    public List<Equipement> getEquipement() {
        return iequipement.retrieveAllEquipements();
    }

    @DeleteMapping("/DeleteEquipement/{id}")
    public void DeleteEquipement(@PathVariable Long id) {
        iequipement.removeEquipement(id);
    }

    @PostMapping("/addAllEquipement")
    public List<Equipement> addAllEquipement(@RequestBody List<Equipement> listeEquipement) {
        return iequipement.addEquipements(listeEquipement);
    }
}
