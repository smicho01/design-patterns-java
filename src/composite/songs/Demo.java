package composite.songs;

public class Demo {

    public static void main(String[] args) {
        SongComponent metalMusic = new SongGroup("Metal", "Metal music is ...");
        SongComponent heavyMetal = new SongGroup("Heavy Metal", "Heavy Metal music is ...");

        SongComponent everySong = new SongGroup("Song List", "All songs in da house");
        everySong.add(metalMusic);
        everySong.add(metalMusic);

        metalMusic.add(new Song("Nothing Else Matters", "Metallica", 1991));
        metalMusic.add(new Song("Symphony of Destruction", "Megadeth", 1992));

        metalMusic.add(heavyMetal);

        heavyMetal.add(new Song("Immigrant Song", "Led Zeppelin", 1970));
        heavyMetal.add(new Song("Master of Puppets", "Metallica", 1986));

        DJ madDj = new DJ(everySong);
        madDj.getSongList();


    }
}
