/**
 * Represents a movie on the streaming service.
 * Adds a rating property to the base Video fields.
 */
public class Movie extends Video {

    // Viewer/critic rating (e.g. out of 10.0)
    private double rating;

    /**
     * Constructs a Movie with the standard Video properties plus a rating.
     *
     * @param title    the title of the movie
     * @param duration the duration in minutes
     * @param rating   the movie's rating (e.g. 8.5 out of 10)
     */
    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", 148, 8.8);
        System.out.println(movie1.getInfo());

        Movie movie2 = new Movie("The Dark Knight", 152, 9.0);
        System.out.println(movie2.getInfo());
    }

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    /**
     * Returns a formatted string describing this Movie,
     * including its rating.
     *
     * @return a human-readable summary
     */
    @Override
    public String getInfo() {
        return "[Movie] " + super.getInfo() + " | Rating: " + rating + "/10";
    }
}
