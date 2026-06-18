import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Иван", "Петров",185, Person.Gender.MALE);
        Actor actor2 = new Actor("Елизавета ", "Смирнова",165 , Person.Gender.FEMALE);
        Actor actor3 = new Actor("Алёна ", "Иванова",167, Person.Gender.FEMALE);
        Actor nullActor = null;


        Director director1 = new Director("Дмитрий", "Иванов", 180, Person.Gender.MALE);
        Director director2 = new Director("Александр","Васильев", 185, Person.Gender.MALE);

        ArrayList<Actor> actorsList = new ArrayList<>();
        Show regularShow = new Show("Обычный спектакль", 40, director1, actorsList);
        Opera operaShow = new Opera("Оперный спектакль" ,"Артём", "Текст либретто", 20);
        Ballet balletShow = new Ballet("Балет", "Антон", "Текст либретто","Сергей");

        regularShow.addActor(actor1);
        regularShow.addActor(actor2);

        balletShow.addActor(actor1);
        balletShow.addActor(actor3);

        operaShow.addActor(actor2);
        operaShow.addActor(actor3);

        //regularShow
        System.out.println(regularShow.getTitle() + ":");
        regularShow.printAllActors();
        regularShow.removeActor(actor1);
        regularShow.addActor(actor3);
        regularShow.printAllActors();

        //operaShow
        System.out.println(operaShow.getTitle() + ":");
        operaShow.printAllActors();
        System.out.println(operaShow.getLibrettoText());

        //balletShow
        System.out.println(balletShow.getTitle() + ":");
        balletShow.printAllActors();
        balletShow.removeActor(actor3);
        balletShow.addActor(nullActor);
        System.out.println(balletShow.getLibrettoText());





    }
}
