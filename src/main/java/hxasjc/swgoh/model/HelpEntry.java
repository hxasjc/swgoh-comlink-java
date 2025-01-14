package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.HelpType;

import java.util.Arrays;

@SuppressWarnings("unused")
public class HelpEntry {
    private HelpType id;
    private HelpTile[] tile;

    public HelpType getId() {
        return id;
    }

    public HelpTile[] getTile() {
        return tile;
    }

    @Override
    public String toString() {
        return "HelpEntry{" +
                "id=" + id +
                ", tile=" + Arrays.toString(tile) +
                '}';
    }
}
