package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.service.IVehiculeService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/Vehicule")
public class VehiculeController {

    private final IVehiculeService ivehicule;

    @PostMapping("/AddVehicule")
    public Vehicule AddVehicule(@RequestBody Vehicule x) {
        return ivehicule.addVehicule(x);
    }

    @GetMapping("/GetVehicule")
    public List<Vehicule> getVehicule() {
        return ivehicule.retrieveAllVehicules();
    }

    @DeleteMapping("/DeleteVehicule/{id}")
    public void DeleteVehicule(@PathVariable Long id) {
        ivehicule.removeVehicule(id);
    }

    @PostMapping("/addAllVehicule")
    public List<Vehicule> addAllVehicule(@RequestBody List<Vehicule> listeVehicule) {
        return ivehicule.addVehicules(listeVehicule);
    }
}
