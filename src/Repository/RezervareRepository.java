package Repository;

import Domain.Rezervare;
import Domain.RezervareValidator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RezervareRepository {
    private Map<Integer, Rezervare> storage = new HashMap<>();

    private RezervareValidator validator;

    /**
     * Instantiates a repository for rezervare.
     *
     * @param validator the validator used.
     */
    public RezervareRepository(RezervareValidator validator) {
        this.validator = validator;
        // low coupling, high cohesion
//        this.validator = new RezervareValidator();
    }

    /* metode CRUD: Create, Read, Update, Delete


     * ...
     * @param rezervare
     */
    public void add(Rezervare rezervare) {
        if (storage.containsKey(rezervare.getId())) {
            throw new RuntimeException("Exista deja o rezervare cu acest id!");
        }

        validator.validate(rezervare);
        storage.put(rezervare.getId(), rezervare);
    }

    /**
     * ...
     *
     * @param rezervare
     */
    public void update(Rezervare rezervare) {
        if (!storage.containsKey(rezervare.getId())) {
            throw new RuntimeException("Nu este nicio rezervare de updatat cu acest id!");
        }

        validator.validate(rezervare);
        storage.put(rezervare.getId(), rezervare);
    }

    /**
     * @return a list of all rezervare.
     */
    public List<Rezervare> getAll() {

        return new ArrayList<>(storage.values());
//        return (List<Rezervare>)storage.values();
        //return storage.values().toArray();
    }
}