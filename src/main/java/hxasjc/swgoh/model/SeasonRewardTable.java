package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class SeasonRewardTable {
    private String id;
    private SeasonRewardTableRow[] row;

    public String getId() {
        return id;
    }

    public SeasonRewardTableRow[] getRow() {
        return row;
    }

    @Override
    public String toString() {
        return "SeasonRewardTable{" +
                "id='" + id + '\'' +
                ", row=" + Arrays.toString(row) +
                '}';
    }
}
