package Domain;

public class RezervareValidator {
    /**
     * Validates a car.
     * @param rezervare the car to validate.
     * @throws RuntimeException if there are validation errors.
     */
    public void validate(Rezervare rezervare) {

        if (rezervare.getZile() <= 0) {
            throw new RuntimeException("Numarul de zile nu poate fi 0 sau negativ!");
        }
        if ((rezervare.getCamera() <= 0) || (rezervare.getCamera() >= 200)){
            throw new RuntimeException("Numarul camerei nu e valid!");
        }


        if (rezervare.isCheckOut() && (rezervare.getRating() <= 0 && rezervare.getRating() >= 5)) {
            throw new RuntimeException("Rating-ul trebuie sa fie intre 1 si 5");
        }
    }
}
