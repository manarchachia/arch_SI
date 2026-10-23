package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.autoloc.domain.Reservation;
import tn.esprit.autoloc.service.IReservationService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/Reservation")
public class ReservationController {

    private final IReservationService ireservation;

    @PostMapping("/AddReservation")
    public Reservation AddReservation(@RequestBody Reservation x) {
        return ireservation.addReservation(x);
    }

    @GetMapping("/GetReservation")
    public List<Reservation> getReservation() {
        return ireservation.retrieveAllReservations();
    }

    @DeleteMapping("/DeleteReservation/{id}")
    public void DeleteReservation(@PathVariable Long id) {
        ireservation.removeReservation(id);
    }

    @PostMapping("/addAllReservation")
    public List<Reservation> addAllReservation(@RequestBody List<Reservation> listeReservation) {
        return ireservation.addReservations(listeReservation);
    }
}
