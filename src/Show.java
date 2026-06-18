import java.util.ArrayList;
public class Show {

    private String title;
    private int duration;
    private Director director;

    private ArrayList<Actor> listOfActor = new ArrayList<>();

    public Show () {

    }

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActor) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActor = listOfActor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public ArrayList<Actor> getListOfActor() {
        return listOfActor;
    }

    public void setListOfActor(ArrayList<Actor> listOfActor) {
        this.listOfActor = listOfActor;
    }

    public void addActor(Actor actor) {
        if (actor == null) {
            System.out.println("Ошибка: нельзя добавить null-актёра в спектакль!");
            return;
        }

        if (!listOfActor.contains(actor)) { // Использует equals для сравнения
            listOfActor.add(actor);
            System.out.println("Актёр " + actor.getName() + " добавлен в спектакль.");
        } else {
            System.out.println("Актёр " + actor.getName() + " уже участвует в спектакле.");
        }
    }

    public void removeActor(Actor actor){
        if (listOfActor.contains(actor)) {
            listOfActor.remove(actor);
            System.out.println("Актёр " + actor.getName() + " убран из спектакля");
        } else {
            System.out.println("Актёр " + actor.getName() + " уже участвует в спектакле.");
        }

    }
    public ArrayList<Actor> getActors() {
        return listOfActor;
    }

    public  void printAllActors() {
        System.out.println("Актёры спектакля:");
        for (Actor actor : listOfActor) {
            System.out.println(actor);
        }
    }



}
