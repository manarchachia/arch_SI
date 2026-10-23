package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.service.IAgenceService;

import java.util.List;

@RestController
@RequestMapping("/agences")
@RequiredArgsConstructor
public class AgenceController {

    private final IAgenceService agenceService;

    @GetMapping("/getAgences")
    public List<Agence> getAll() {
        return agenceService.retrieveAllAgences();
    }

    @PostMapping("/AddAgence")
    public Agence add(@RequestBody Agence a) {
        return agenceService.addAgence(a);
    }

    @PutMapping("/UpdateClient")
    public Agence update(@RequestBody Agence a) {
        return agenceService.updateAgence(a);
    }

    @DeleteMapping("/DeleteAgence/{id}")
    public void delete(@PathVariable Long id) {
        agenceService.removeAgence(id);
    }
}