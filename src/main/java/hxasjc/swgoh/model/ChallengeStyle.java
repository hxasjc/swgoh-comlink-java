package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class ChallengeStyle {
    private String id;
    private String buttonIcon;
    private String characterIcon;
    private String characterNameKey;
    private String characterRewardIcon;
    private String completeKey;
    private String audioKey;
    private String questTitleKey;

    public String getId() {
        return id;
    }

    public String getButtonIcon() {
        return buttonIcon;
    }

    public String getCharacterIcon() {
        return characterIcon;
    }

    public String getCharacterNameKey() {
        return characterNameKey;
    }

    public String getCharacterRewardIcon() {
        return characterRewardIcon;
    }

    public String getCompleteKey() {
        return completeKey;
    }

    public String getAudioKey() {
        return audioKey;
    }

    public String getQuestTitleKey() {
        return questTitleKey;
    }

    @Override
    public String toString() {
        return "ChallengeStyle{" +
                "id='" + id + '\'' +
                ", buttonIcon='" + buttonIcon + '\'' +
                ", characterIcon='" + characterIcon + '\'' +
                ", characterNameKey='" + characterNameKey + '\'' +
                ", characterRewardIcon='" + characterRewardIcon + '\'' +
                ", completeKey='" + completeKey + '\'' +
                ", audioKey='" + audioKey + '\'' +
                ", questTitleKey='" + questTitleKey + '\'' +
                '}';
    }
}
