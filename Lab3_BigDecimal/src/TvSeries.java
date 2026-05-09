/**
 * Represents a TV series on the streaming service.
 * Adds an episodes property to the base Video fields.
 */
public class TvSeries extends Video {

    // Total number of episodes in the series
    private int episodes;

    /**
     * Constructs a TvSeries with the standard Video properties plus episode count.
     *
     * @param title    the title of the series
     * @param duration the total duration in minutes
     * @param episodes the number of episodes
     */
    public static void main(String[] args) {
        TvSeries series1 = new TvSeries("Breaking Bad", 2700, 62);
        System.out.println(series1.getInfo());

        TvSeries series2 = new TvSeries("The Office", 3120, 201);
        System.out.println(series2.getInfo());
    }

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    public int getEpisodes() { return episodes; }
    public void setEpisodes(int episodes) { this.episodes = episodes; }

    /**
     * Returns a formatted string describing this TvSeries,
     * including the episode count.
     *
     * @return a human-readable summary
     */
    @Override
    public String getInfo() {
        return "[TV Series] " + super.getInfo() + " | Episodes: " + episodes;
    }
}
