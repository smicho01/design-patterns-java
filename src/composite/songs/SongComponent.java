package composite.songs;

public abstract class SongComponent {

    public void add(SongComponent newSongComponent) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void remove(SongComponent songComponent) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public SongComponent getComponent(int componentIndex) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public String getSongName() {
        throw new UnsupportedOperationException("Not implemented");
    }

    public String getBandName() {
        throw new UnsupportedOperationException("Not implemented");
    }

    public int getReleaseYear() {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void displaySongInfo() {
        throw new UnsupportedOperationException("Not implemented");
    }
}
