package Service;

import Domain.RatingMediu;
import Domain.Rezervare;
import Repository.RezervareRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RezervareService {
    private RezervareRepository repository;
    /**
     * ...
     * @param repository
     */
    public RezervareService(RezervareRepository repository) {
        this.repository = repository;
    }


    /*
     * ...
     * @param id
     * @param camera
     * @param persoane
     * @param zile
     */

    public void enterService(int id, int camera, int persoane, int zile) {
        Rezervare rezervare = new Rezervare(id, camera, persoane, zile);
        List<Rezervare> rezervari = repository.getAll();
        for (Rezervare r : rezervari) {
            if ((r.getCamera() == camera) && !r.isCheckOut()) {
                throw new RuntimeException("Acea camera este deja luata!");
            }
        }
        repository.add(rezervare);
    }

    /**
     *
     * @param camera
     * @param feedback
     * @param rating
     */
    public void exitService(int camera, String feedback, double rating) {
        Rezervare rezervareInCamera = null;
        List<Rezervare> rezervari = repository.getAll();
        for (Rezervare r : rezervari) {
            if (r.getCamera() == camera && !r.isCheckOut()) {
                rezervareInCamera = r;
            }
    }
        if (rezervareInCamera != null) {
            rezervareInCamera.setFeedback(feedback);
            rezervareInCamera.setRating (double ratings);
            rezervareInCamera.setCheckOut(true);
            repository.update(rezervareInCamera);
        } else {
            throw new RuntimeException("Nu mai sunt persoane in camera, camera e libera!");
        }
    }
    public List<RatingMediu> getRatingAverage() {
        List<RatingMediu> results = new ArrayList<>();
        Map<Integer, List<Double>> ratingPentruCamera = new HashMap<>();
    }

};


        public List<Rezervare> getAll() { return repository.getAll();}
