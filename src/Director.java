import java.util.ArrayList;
import java.util.List;

public class Director extends Person {
    private int filmsDirected;
    private List<String> awards;

    public int getFilmsDirected() {
        return filmsDirected;
    }

    public void setFilmsDirected(int filmsDirected) {
        if (filmsDirected >= 0){
            this.filmsDirected = filmsDirected;
        } else {
            System.out.println("Количество фильмов не может быть отрицательным.");
        }

    }

    public List<String> getAwards() {
        return new ArrayList<>(awards);
    }

    public Director(String name,String surname,int height,Gender gender) {
        super(name, surname, height, gender);
        this.filmsDirected = 0;
        this.awards = new ArrayList<>();
    }

    public void receiveAward(String awardName) {
        awards.add(awardName);
    }

    public void directMovie(String movieTitle) {
        filmsDirected++;
        System.out.println(getName() + " снял новый фильм: " + movieTitle);
    }

    @Override
    public String toString() {
        return "Режисёр: " + getName() + " " + getSurname() +
                ", Снял фильм: " + filmsDirected +
                ", Награды: " + awards.size();
    }

}
