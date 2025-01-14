package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class EnvironmentCollection {
    private String id;
    private Environment[] battleEnvironment;

    public String getId() {
        return id;
    }

    public Environment[] getBattleEnvironment() {
        return battleEnvironment;
    }

    @Override
    public String toString() {
        return "EnvironmentCollection{" +
                "id='" + id + '\'' +
                ", battleEnvironment=" + Arrays.toString(battleEnvironment) +
                '}';
    }
}
