package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.service.IContratService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/Contrat")
public class ContratController {

    private final IContratService icontrat;

    @PostMapping("/AddContrat")
    public Contrat AddContrat(@RequestBody Contrat x) {
        return icontrat.addContrat(x);
    }

    @GetMapping("/GetContrat")
    public List<Contrat> getContrat() {
        return icontrat.retrieveAllContrats();
    }

    @DeleteMapping("/DeleteContrat/{id}")
    public void DeleteContrat(@PathVariable Long id) {
        icontrat.removeContrat(id);
    }

    @PostMapping("/addAllContrat")
    public List<Contrat> addAllContrat(@RequestBody List<Contrat> listeContrat) {
        return icontrat.addContrats(listeContrat);
    }
}
