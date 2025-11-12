public class Singer extends Artist {
    public enum Genre { POP, ROCK, CLASSICAL, JAZZ, HIPHOP, RNB }

    private Genre genre;

    public Singer(String name, int age, String specialty, Genre genre) {
        super(name, age, specialty);
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Singer's Info:");
        super.displayInfo();
        System.out.println("Genre: " + genre);
    }
}
