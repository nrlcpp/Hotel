package Domain;

public class RatingMediu {
    private int camera;
    private double averageRating;

    @Override
    public String toString() {
        return "AverageRating{" +
                "camera=" + camera +
                ", averageRating=" + averageRating +
                '}';
    }

    public int getCamera() {
        return camera;
    }

    public void setSCamera(int camera) {
        this.camera = camera;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public RatingMediu(int camera, double averageRating) {
        this.camera = camera;
        this.averageRating = averageRating;
    }
}
