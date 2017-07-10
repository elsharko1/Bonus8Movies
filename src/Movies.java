import java.util.ArrayList;

/**
 * Created by Mark on 7/7/2017.
 */
public class Movies {

    private String title;
    private String category;

    public Movies() {
    }

    public Movies(String title, String category) {
        this.category = category;
        this.title = title;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String  getCategory() {

        return category;
    }

    public void setCategory(String category) {

        this.category = category;
    }

    @Override
    public String toString() {

        return title;
    }

    public ArrayList<Movies> listOfMovies() {
        ArrayList<Movies> list = new ArrayList<>();
        list.add(new Movies("Legally Blonde", "comedy"));
        list.add(new Movies("Zoolander", "comedy"));
        list.add(new Movies("Bourne Ulitmatum", "action"));
        list.add(new Movies("Crazy, Stupid Love", "comedy"));
        list.add(new Movies("Godfather", "drama"));
        list.add(new Movies("Pulp Fiction", "drama"));
        list.add(new Movies("Fight Club", "drama"));
        list.add(new Movies("The Wizard of Oz", "musical"));
        list.add(new Movies("West Side Story", "musical"));
        list.add(new Movies("Skyfall", "action"));


        return list;
    }
}
