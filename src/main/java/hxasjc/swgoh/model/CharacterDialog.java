package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class CharacterDialog {
    private String characterPrefab;
    private String[] animations;
    private String audioKey;
    private String layout;
    private boolean useHologramEffect;

    public String getCharacterPrefab() {
        return characterPrefab;
    }

    public String[] getAnimations() {
        return animations;
    }

    public String getAudioKey() {
        return audioKey;
    }

    public String getLayout() {
        return layout;
    }

    public boolean isUseHologramEffect() {
        return useHologramEffect;
    }

    @Override
    public String toString() {
        return "CharacterDialog{" +
                "characterPrefab='" + characterPrefab + '\'' +
                ", animations=" + Arrays.toString(animations) +
                ", audioKey='" + audioKey + '\'' +
                ", layout='" + layout + '\'' +
                ", useHologramEffect=" + useHologramEffect +
                '}';
    }
}
