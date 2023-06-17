/**
 * This class represents a Movie with various attributes such as title, genre, year, actors, and rental information.
 * It also provides methods to access and modify these attributes.
 *
 * <p>
 * Authors:
 * <ul>
 *     <li>Rhenz Bhovie O. Viloria</li>
 *     <li>Steven Yu</li>
 * </ul>
 */
public class Movie {
    private final String title;
    private String genre;
    private int year;
    private String[] actors;
    private int times;
    private static int total = 0;
    private static float burat = 1;

    /**
     * Constructs a Movie object with the given title, genre, and year.
     *
     * @param title The title of the movie.
     * @param genre The genre of the movie.
     * @param year  The year of release of the movie.
     */
    public Movie(String title, String genre, int year) {
        this.title = title;
        this.year = year;
        this.actors = new String[5];
        this.times = 0;
        total++;
        if (genre.equalsIgnoreCase("drama") || genre.equalsIgnoreCase("horror")
                || genre.equalsIgnoreCase("comedy") || genre.equalsIgnoreCase("biography")
                || genre.equalsIgnoreCase("sci-fi") || genre.equalsIgnoreCase("action")
                || genre.equalsIgnoreCase("romance") || genre.equalsIgnoreCase("kids")) {
            this.genre = genre;
        } else {
            this.genre = "comedy";
        }
    }

    /**
     * Constructs a Movie object with the given title and genre, assuming the year as 2020.
     *
     * @param title The title of the movie.
     * @param genre The genre of the movie.
     */
    public Movie(String title, String genre) {
        this(title, genre, 2020);
    }

    /**
     * Constructs a Movie object with the given title, genre, and an initial actor.
     *
     * @param title The title of the movie.
     * @param genre The genre of the movie.
     * @param actor The initial actor in the movie.
     */
    public Movie(String title, String genre, String actor) {
        this(title, genre);
        actors[0] = actor;
    }

    /**
     * Constructs a Movie object with the given title and year, assuming the genre as comedy.
     *
     * @param title The title of the movie.
     * @param year  The year of release of the movie.
     */
    public Movie(String title, int year) {
        this(title, "comedy", year);
    }

    /**
     * Returns the title of the movie.
     *
     * @return The title of the movie.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the genre of the movie.
     *
     * @return The genre of the movie.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Returns the array of actors in the movie.
     *
     * @return The array of actors in the movie.
     */
    public String[] getActors() {
        return actors;
    }

    /**
     * Returns the total number of Movie objects created.
     *
     * @return The total number of Movie objects created.
     */
    public static int getTotal() {
        return total;
    }

    /**
     * Returns the year of release of the movie.
     *
     * @return The year of release of the movie.
     */
    public int getYear() {
        return year;
    }

    /**
     * Returns the number of times the movie has been rented.
     *
     * @return The number of times the movie has been rented.
     */
    public int getTimes() {
        return times;
    }

    /**
     * Sets the genre of the movie if it is a valid genre.
     *
     * @param genre The genre of the movie.
     */
    public void setGenre(String genre) {
        if (genre.equalsIgnoreCase("drama") || genre.equalsIgnoreCase("horror")
                || genre.equalsIgnoreCase("comedy") || genre.equalsIgnoreCase("biography")
                || genre.equalsIgnoreCase("sci-fi") || genre.equalsIgnoreCase("action")
                || genre.equalsIgnoreCase("romance") || genre.equalsIgnoreCase("kids")) {
            this.genre = genre;
        } else {
            return;
        }
    }

    /**
     * Sets the year of release of the movie.
     *
     * @param year The year of release of the movie.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Adds an actor to the movie.
     *
     * @param actor The actor to be added to the movie.
     */
    public void addActors(String actor) {
        for (int i = 0; i < actors.length; i++) {
            if (actors[i] == null) {
                actors[i] = actor;
                return;
            }
        }
    }

    /**
     * Increases the rental count of the movie by one.
     */
    public void rent() {
        times++;
    }

    /**
     * Checks if the movie is a blockbuster based on the rental count.
     *
     * @return {@code true} if the movie is a blockbuster, {@code false} otherwise.
     */
    public boolean isBlockbuster() {
        return times >= 10000;
    }

    /**
     * Returns a string representation of the movie in the format: "title - year (genre)".
     *
     * @return A string representation of the movie.
     */
    @Override
    public String toString() {
        return title + " - " + year + " (" + genre + ")";
    }

    /**
     * Checks if this Movie object is equal to the specified Movie object.
     *
     * @param m The Movie object to compare.
     * @return {@code true} if the Movie objects are equal, {@code false} otherwise.
     */
    public boolean equals(Movie m) {
        if (this.title.equals(m.getTitle()) && this.year == m.getYear() && this.genre.equals(m.getGenre())) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Decrements the total count of Movie objects.
     */
    public static void decrement() {
        total--;
    }
}
