package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservations();

    Reservation addReservation(Reservation x);

    Reservation updateReservation(Reservation x);

    Reservation retrieveReservation(Long idReservation);

    void removeReservation(Long idReservation);

    List<Reservation> addReservations(List<Reservation> reservations);
}
