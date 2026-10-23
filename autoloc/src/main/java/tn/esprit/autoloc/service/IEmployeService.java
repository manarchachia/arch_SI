package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Employe;

import java.util.List;

public interface IEmployeService {
    List<Employe> retrieveAllEmployes();

    Employe addEmploye(Employe x);

    Employe updateEmploye(Employe x);

    Employe retrieveEmploye(Long idEmploye);

    void removeEmploye(Long idEmploye);

    List<Employe> addEmployes(List<Employe> employes);
}
