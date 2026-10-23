package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {
    List<Vehicule> retrieveAllVehicules();

    Vehicule addVehicule(Vehicule x);

    Vehicule updateVehicule(Vehicule x);

    Vehicule retrieveVehicule(Long idVehicule);

    void removeVehicule(Long idVehicule);

    List<Vehicule> addVehicules(List<Vehicule> vehicules);
}
