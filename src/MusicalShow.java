public class MusicalShow extends Show {

    private String musicAuthor;
    private String librettoText;

    public MusicalShow (String musicAuthor, String librettoText){
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }
}
