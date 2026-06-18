import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Actor extends Person {
    private int experienceYears;
    private List<String> filmography;
    private int awardCount;
    private boolean isStar;

    public Actor(String name, String surname, int height, Gender gender) {
        super(name, surname, height, gender);
        this.experienceYears = 0;
        this.filmography = new ArrayList<>();
        this.awardCount = 0;
        this.isStar = false;
    }

    public int getExperienceYears() {
        return experienceYears;
    }
    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public List<String> getFilmography() {
        return new ArrayList<>(filmography);
    }

    public int getAwardCount() {
        return awardCount;
    }

    public boolean isStar() {
        return isStar;
    }

    public void actInShow(String showTitle) {
        filmography.add(showTitle);
    }

    public void receiveAward() {
        awardCount++;
    }

    public void promoteToStar() {
        isStar = true;
    }

    @Override
    public String toString() {
        return "Актёр: " + getName() + " " + getSurname() +
                ", Опыт: " + experienceYears + " лет" +
                ", Награды: " + awardCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return  false;

        Actor actor = (Actor) obj;
        return Objects.equals(getName(), actor.getName()) &&
               Objects.equals(getSurname(), actor.getSurname());

    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname());
    }


}
