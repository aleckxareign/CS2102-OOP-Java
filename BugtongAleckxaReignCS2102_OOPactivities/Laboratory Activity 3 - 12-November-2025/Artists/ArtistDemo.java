public class ArtistDemo {
    public static void main(String[] args) {
        Artist artist = new Artist("Charlie Puth", 32, "Music");
        artist.displayInfo();

        System.out.println("\n");
        Singer singer = new Singer("Nayeon Im", 29, "Music", Singer.Genre.POP);
        singer.displayInfo();

        System.out.println("\n");
        Painter painter = new Painter("Claude Monet", 86, "Impressionism", Painter.Medium.WATERCOLOR);
        painter.displayInfo();

        System.out.println("\n");
        Writer writer = new Writer("Lang Leav", 39, "Poetry", Writer.WritingStyle.POETRY);
        writer.displayInfo();

        System.out.println("\n");
        Dancer dancer = new Dancer("Lisa Manoban", 28, "Performance", Dancer.DanceStyle.HIPHOP);
        dancer.displayInfo();
    }
}
