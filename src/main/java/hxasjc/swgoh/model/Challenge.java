package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.ChallengeClaimType;
import hxasjc.swgoh.enums.ChallengeRewardType;
import hxasjc.swgoh.enums.ChallengeType;
import hxasjc.swgoh.enums.ContextualMessageType;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Challenge {
    private String id;
    private ChallengeType type;
    private String nameKey;
    private String descKey;
    private Requirement viewRequirement;
    private BucketItem[] reward;
    private String platformAchievementId;
    private ChallengeClaimType claimType;
    private ChallengeRewardType rewardType;
    private double rewardRatio;
    private ChallengeTask[] task;
    private ContextualMessageType messageGroup;
    private String styleId;
    private int priority;
    private String nextChallengeId;
    private String rewardDialogKey;
    private boolean rewardRedirectToHome;
    private String rewardDescKey;
    private boolean starterGuildGraduation;
    private int rewardPoints;
    private String detailsKey;
    private boolean hiddenInMainQuests;

    public String getId() {
        return id;
    }

    public ChallengeType getType() {
        return type;
    }

    public String getNameKey() {
        return nameKey;
    }

    public String getDescKey() {
        return descKey;
    }

    public Requirement getViewRequirement() {
        return viewRequirement;
    }

    public BucketItem[] getReward() {
        return reward;
    }

    public String getPlatformAchievementId() {
        return platformAchievementId;
    }

    public ChallengeClaimType getClaimType() {
        return claimType;
    }

    public ChallengeRewardType getRewardType() {
        return rewardType;
    }

    public double getRewardRatio() {
        return rewardRatio;
    }

    public ChallengeTask[] getTask() {
        return task;
    }

    public ContextualMessageType getMessageGroup() {
        return messageGroup;
    }

    public String getStyleId() {
        return styleId;
    }

    public int getPriority() {
        return priority;
    }

    public String getNextChallengeId() {
        return nextChallengeId;
    }

    public String getRewardDialogKey() {
        return rewardDialogKey;
    }

    public boolean isRewardRedirectToHome() {
        return rewardRedirectToHome;
    }

    public String getRewardDescKey() {
        return rewardDescKey;
    }

    public boolean isStarterGuildGraduation() {
        return starterGuildGraduation;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public String getDetailsKey() {
        return detailsKey;
    }

    public boolean isHiddenInMainQuests() {
        return hiddenInMainQuests;
    }

    @Override
    public String toString() {
        return "Challenge{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", nameKey='" + nameKey + '\'' +
                ", descKey='" + descKey + '\'' +
                ", viewRequirement=" + viewRequirement +
                ", reward=" + Arrays.toString(reward) +
                ", platformAchievementId='" + platformAchievementId + '\'' +
                ", claimType=" + claimType +
                ", rewardType=" + rewardType +
                ", rewardRatio=" + rewardRatio +
                ", task=" + Arrays.toString(task) +
                ", messageGroup=" + messageGroup +
                ", styleId='" + styleId + '\'' +
                ", priority=" + priority +
                ", nextChallengeId='" + nextChallengeId + '\'' +
                ", rewardDialogKey='" + rewardDialogKey + '\'' +
                ", rewardRedirectToHome=" + rewardRedirectToHome +
                ", rewardDescKey='" + rewardDescKey + '\'' +
                ", starterGuildGraduation=" + starterGuildGraduation +
                ", rewardPoints=" + rewardPoints +
                ", detailsKey='" + detailsKey + '\'' +
                ", hiddenInMainQuests=" + hiddenInMainQuests +
                '}';
    }
}
