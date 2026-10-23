package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Contrat;

import java.util.List;

public interface IContratService {
    List<Contrat> retrieveAllContrats();

    Contrat addContrat(Contrat x);

    Contrat updateContrat(Contrat x);

    Contrat retrieveContrat(Long idContrat);

    void removeContrat(Long idContrat);

    List<Contrat> addContrats(List<Contrat> contrats);
}
