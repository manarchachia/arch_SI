package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.service.IPaiementService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/Paiement")
public class PaiementController {

    private final IPaiementService ipaiement;

    @PostMapping("/AddPaiement")
    public Paiement AddPaiement(@RequestBody Paiement x) {
        return ipaiement.addPaiement(x);
    }

    @GetMapping("/GetPaiement")
    public List<Paiement> getPaiement() {
        return ipaiement.retrieveAllPaiements();
    }

    @DeleteMapping("/DeletePaiement/{id}")
    public void DeletePaiement(@PathVariable Long id) {
        ipaiement.removePaiement(id);
    }

    @PostMapping("/addAllPaiement")
    public List<Paiement> addAllPaiement(@RequestBody List<Paiement> listePaiement) {
        return ipaiement.addPaiements(listePaiement);
    }
}
