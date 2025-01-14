package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class BattleEnvironment {
    private String prefab;
    private String[] audioPackage;

    public String getPrefab() {
        return prefab;
    }

    public String[] getAudioPackage() {
        return audioPackage;
    }

    @Override
    public String toString() {
        return "BattleEnvironment{" +
                "prefab='" + prefab + '\'' +
                ", audioPackage=" + Arrays.toString(audioPackage) +
                '}';
    }
}
