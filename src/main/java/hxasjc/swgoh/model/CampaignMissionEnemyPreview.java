package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.*;

@SuppressWarnings("unused")
public class CampaignMissionEnemyPreview {
    private BucketItem baseEnemyItem;
    private int enemyLevel;
    private UnitTier enemyTier;
    private ThreatLevel threatLevel;
    private String thumbnailName;
    private String prafabName;
    private boolean displayedEnemy;
    private UnitClass unitClass;
    private ForceAlignment enemyForceAlignment;
    private RelicTier enemyRelicTier;
    private int zetaCount;
    private boolean isGalacticLegend;
    private boolean isUltimateUnlocked;
    private int omicronCount;

    public BucketItem getBaseEnemyItem() {
        return baseEnemyItem;
    }

    public int getEnemyLevel() {
        return enemyLevel;
    }

    public UnitTier getEnemyTier() {
        return enemyTier;
    }

    public ThreatLevel getThreatLevel() {
        return threatLevel;
    }

    public String getThumbnailName() {
        return thumbnailName;
    }

    public String getPrafabName() {
        return prafabName;
    }

    public boolean isDisplayedEnemy() {
        return displayedEnemy;
    }

    public UnitClass getUnitClass() {
        return unitClass;
    }

    public ForceAlignment getEnemyForceAlignment() {
        return enemyForceAlignment;
    }

    public RelicTier getEnemyRelicTier() {
        return enemyRelicTier;
    }

    public int getZetaCount() {
        return zetaCount;
    }

    public boolean isGalacticLegend() {
        return isGalacticLegend;
    }

    public boolean isUltimateUnlocked() {
        return isUltimateUnlocked;
    }

    public int getOmicronCount() {
        return omicronCount;
    }

    @Override
    public String toString() {
        return "CampaignMissionEnemyPreview{" +
                "baseEnemyItem=" + baseEnemyItem +
                ", enemyLevel=" + enemyLevel +
                ", enemyTier=" + enemyTier +
                ", threatLevel=" + threatLevel +
                ", thumbnailName='" + thumbnailName + '\'' +
                ", prafabName='" + prafabName + '\'' +
                ", displayedEnemy=" + displayedEnemy +
                ", unitClass=" + unitClass +
                ", enemyForceAlignment=" + enemyForceAlignment +
                ", enemyRelicTier=" + enemyRelicTier +
                ", zetaCount=" + zetaCount +
                ", isGalacticLegend=" + isGalacticLegend +
                ", isUltimateUnlocked=" + isUltimateUnlocked +
                ", omicronCount=" + omicronCount +
                '}';
    }
}
