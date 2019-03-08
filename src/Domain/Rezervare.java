package Domain;

public class Rezervare {
        private int id;
        private int camera;
        private int persoane;
        private int zile;
        private boolean checkOut;
        private String feedback;
        private int rating;


    public String toString() {
        return "Rezervare{" +
                "id=" + id +
                ", camera=" + camera +
                ", persoane='" + persoane + '\'' +
                ", zile=" + zile +
                ", checkOut=" + checkOut +
                ", feedback='" + feedback + '\'' +
                ", rating=" + rating +
                '}';
    }

    public Rezervare(int id, int camera, int persoane, int zile) {
        this.id = id;
        this.camera = camera;
        this.persoane = persoane;
        this.zile = zile;
        checkOut = false; 
    }

    public Rezervare(int id, int camera, int persoane, int zile, boolean checkOut, String feedback, int rating) {
        this.id = id;
        this.camera = camera;
        this.persoane = persoane;
        this.zile = zile;
        this.checkOut = checkOut;
        this.feedback = feedback;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getPersoane() {
        return persoane;
    }

    public void setPersoane(int persoane) {
        this.persoane = persoane;
    }

    public int getZile() {
        return zile;
    }

    public void setZile(int zile) {
        this.zile = zile;
    }

    public boolean isCheckOut() {
        return checkOut;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}


