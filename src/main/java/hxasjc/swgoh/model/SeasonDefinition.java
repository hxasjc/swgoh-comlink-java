package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class SeasonDefinition {
    private String id;
    private String nameKey;
    private SeasonLeagueReference[] seasonLeagueReference;
    private SeasonDivisionReference[] seasonDivisionReference;
    private String seasonRewardTableId;
    private int minimumBannerSeasonRewardThreshold;
    private SeasonDivisionSkillBoundary[] divisionSkillBoundary;

    public String getId() {
        return id;
    }

    public String getNameKey() {
        return nameKey;
    }

    public SeasonLeagueReference[] getSeasonLeagueReference() {
        return seasonLeagueReference;
    }

    public SeasonDivisionReference[] getSeasonDivisionReference() {
        return seasonDivisionReference;
    }

    public String getSeasonRewardTableId() {
        return seasonRewardTableId;
    }

    public int getMinimumBannerSeasonRewardThreshold() {
        return minimumBannerSeasonRewardThreshold;
    }

    public SeasonDivisionSkillBoundary[] getDivisionSkillBoundary() {
        return divisionSkillBoundary;
    }

    @Override
    public String toString() {
        return "SeasonDefinition{" +
                "id='" + id + '\'' +
                ", nameKey='" + nameKey + '\'' +
                ", seasonLeagueReference=" + Arrays.toString(seasonLeagueReference) +
                ", seasonDivisionReference=" + Arrays.toString(seasonDivisionReference) +
                ", seasonRewardTableId='" + seasonRewardTableId + '\'' +
                ", minimumBannerSeasonRewardThreshold=" + minimumBannerSeasonRewardThreshold +
                ", divisionSkillBoundary=" + Arrays.toString(divisionSkillBoundary) +
                '}';
    }
}
