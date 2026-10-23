package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.service.IEmployeService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/Employe")
public class EmployeController {

    private final IEmployeService iemploye;

    @PostMapping("/AddEmploye")
    public Employe AddEmploye(@RequestBody Employe x) {
        return iemploye.addEmploye(x);
    }

    @GetMapping("/GetEmploye")
    public List<Employe> getEmploye() {
        return iemploye.retrieveAllEmployes();
    }

    @DeleteMapping("/DeleteEmploye/{id}")
    public void DeleteEmploye(@PathVariable Long id) {
        iemploye.removeEmploye(id);
    }

    @PostMapping("/addAllEmploye")
    public List<Employe> addAllEmploye(@RequestBody List<Employe> listeEmploye) {
        return iemploye.addEmployes(listeEmploye);
    }
}
