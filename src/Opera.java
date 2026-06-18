public class Opera extends MusicalShow {

    private int choirSize;
    private String title;
    private String librettoText;

    public Opera(String title, String musicAuthor, String librettoText, int choirSize) {
        super(musicAuthor, librettoText);
        this.choirSize = choirSize;
        this.title = title;
        this.librettoText = librettoText;

    }
    @Override
    public String getTitle() {
        return title;
    }
    @Override
    public String getLibrettoText() {
        return librettoText;
    }




}
