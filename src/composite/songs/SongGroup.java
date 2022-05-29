package composite.songs;

import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent {
    ArrayList<SongComponent> components = new ArrayList<>();

    String gropName;
    String groupDescription;

    public SongGroup(String newGroupName, String newGroupDesc) {
        gropName = newGroupName;
        groupDescription = newGroupDesc;
    }

    public ArrayList<SongComponent> getComponents() {
        return components;
    }

    public String getGropName() {
        return gropName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    @Override
    public void add(SongComponent newSongComponent) {
        components.add(newSongComponent);
    }

    @Override
    public void remove(SongComponent songComponent) {
        components.remove(songComponent);
    }

    public SongComponent getComponent(int idx) {
        return components.get(idx);
    }

    @Override
    public void displaySongInfo() {
        System.out.println(getGropName() + " " +
                getGroupDescription() + "\n");

        Iterator songIterator = components.iterator();
        while (songIterator.hasNext()) {
            SongComponent songInfo = (SongComponent) songIterator.next();
            songInfo.displaySongInfo();
        }
    }
}
