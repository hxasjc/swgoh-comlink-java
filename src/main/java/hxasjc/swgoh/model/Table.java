package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Table {
    private String id;
    private TableRow[] row;

    public String getId() {
        return id;
    }

    public TableRow[] getRow() {
        return row;
    }

    @Override
    public String toString() {
        return "Table{" +
                "id='" + id + '\'' +
                ", row=" + Arrays.toString(row) +
                '}';
    }
}
