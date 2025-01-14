package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class XpTable {
    private String id;
    private XpTableRow[] row;

    public String getId() {
        return id;
    }

    public XpTableRow[] getRow() {
        return row;
    }

    @Override
    public String toString() {
        return "XpTable{" +
                "id='" + id + '\'' +
                ", row=" + Arrays.toString(row) +
                '}';
    }
}
