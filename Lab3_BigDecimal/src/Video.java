/**
 * Abstract base class representing a video in the streaming service.
 * All video types (TvSeries, Movie) extend this class.
 */
public abstract class Video {

    // Shared properties for all video content
    private String title;
    private int duration; // Duration in minutes

    /**
     * Constructs a Video with a title and duration.
     *
     * @param title    the title of the video
     * @param duration the duration in minutes
     */
    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    // --- Getters and Setters ---

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    /**
     * Returns a formatted string with this video's properties.
     * Subclasses should override to include their additional fields.
     *
     * @return a human-readable summary of the video
     */
    public String getInfo() {
        return "Title: " + title + " | Duration: " + duration + " min";
    }
}
