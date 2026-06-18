public class Ballet extends MusicalShow {

    private String choreographer;
    private String title;

    public Ballet(String title, String musicAuthor, String librettoText, String choreographer) {
        super(musicAuthor, librettoText);
        this.choreographer = choreographer;
        this.title = title;
    }
    @Override
    public String getTitle() {
        return title;
    }

}
