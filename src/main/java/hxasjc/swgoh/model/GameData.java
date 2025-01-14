package hxasjc.swgoh.model;

import org.apache.commons.lang.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

@SuppressWarnings("unused")
public class GameData {
    private UnitDef[] units;
    private BattleEnvironment[] battleEnvironments;
    private XpTable[] xpTable;
    private CraftingMaterialDef[] material;
    private Recipe[] recipe;
    private StatProgression[] statProgression;
    private Category[] category;
    private HelpEntry[] helpEntry;
    private Challenge[] challenge;
    private SkillDefinition[] skill;
    private EventSampling[] eventSampling;
    private EquipmentDef[] equipment;
    private WarDef[] warDefinition;
    private TargetingSet[] targetingSet;
    private Ability[] ability;
    private Effect[] effect;
    private Requirement[] requirement;
    private PowerUpBundle[] powerUpBundle;
    private GuildBannerDef guildBanner;
    private GuildRaidConfig[] raidConfig;
    private StatModSetDefinition[] statModSet;
    private StatModDefinition[] statMod;
    private GuildExchangeItem[] guildExchangeItem;
    private Table[] table;
    private UnlockAnnouncementDefinition[] unlockAnnouncementDefinition;
    private EffectTarget[] battleTargetingRule;
    private TerritoryBattleDefinition[] territoryBattleDefinition;
    private TerritoryWarDefinition[] territoryWarDefinition;
    private EnvironmentCollection[] environmentCollection;
    private ChallengeStyle[] challengeStyle;
    private SocialStatus socialStatus;
    private StarterGuildDef[] starterGuild;
    private PlayerTitleDefinition[] playerTitle;
    private ModRecommendation[] modRecommendation;
    private PersistentVfx[] persistentVfx;
    private TerritoryTournamentDefinition[] territoryTournamentDefinition;
    private EventBonus[] eventBonus;
    private SkillDefinition[] skillDefinition;
    private PlayerPortraitDefinition[] playerPortrait;
    private TimeZoneChangeConfig timeZoneChangeConfig;
    private String[] effectIconPriority;
    private MysteryBoxDefinition[] mysteryBox;
    private MysteryStatModDefinition[] mysteryStatMod;
    private Cooldown[] cooldown;
    private DailyActionCap[] dailyActionCap;
    private EnergyRewardDefinition[] energyReward;
    private String territoryTournamentMatchmakingDescKey;
    private SeasonLeagueDefinition[] seasonLeagueDefinition;
    private SeasonDivisionDefinition[] seasonDivisionDefinition;
    private SeasonRewardTable[] seasonRewardTable;
    private RelicTierDefinition[] relicTierDefinition;
    private ConversionSet[] scavengerConversionSet;
    private UnitGuideDefinition[] unitGuideDefinition;
    private GalacticBundle[] galacticBundle;
    private LinkedStoreItem[] linkedStoreItem;
    private TerritoryTournamentLeagueDefinition[] territoryTournamentLeagueDefinition;
    private TerritoryTournamentDivisionDefinition[] territoryTournamentDivisionDefinition;
    private SaveSquadConfig[] savedSquadConfig;
    private GuildRaidGlobalConfig guildRaidGlobalConfig;
    private Campaign[] campaign;
    // TODO: 2025-01-10 conquestDefinition;
    // TODO: 2025-01-10 conquestMission
    // TODO: 2025-01-10 artifactDefinition;
    // TODO: 2025-01-10 abilityDecisionTree
    // TODO: 2025-01-10 consumableDefinition
    // TODO: 2025-01-10 consumableType
    // TODO: 2025-01-10 artifactTierDefinition
    // TODO: 2025-01-10 consumableTierDefinition
    // TODO: 2025-01-10 recommendedSquad
    // TODO: 2025-01-10 unitGuideLayout
    // TODO: 2025-01-10 dailyLoginRewardDefinition
    // TODO: 2025-01-10 calendarCategoryDefinition
    // TODO: 2025-01-10 territoryTournamentDailyRewardTable
    // TODO: 2025-01-10 datacronSet
    // TODO: 2025-01-10 datacronTemplate
    // TODO: 2025-01-10 datacronAffixTemplateSet
    // TODO: 2025-01-10 datacronHelpEntry
    // TODO: 2025-01-10 displayableEnemy


    public UnitDef[] getUnits() {
        return units;
    }

    public UnitDef getUnitById(String id) {
        for (UnitDef unit : units) {
            if (unit.getId().equals(id)) {
                return unit;
            }
        }

        throw new NoSuchElementException(); // TODO: 2025-01-12 more specific error message
    }

    public UnitDef[] getUnitsByBaseId(String baseId) {
        ArrayList<UnitDef> list = new ArrayList<>();

        for (UnitDef unit : units) {
            if (unit.getBaseId().equals(baseId)) {
                list.add(unit);
            }
        }

        return list.toArray(new UnitDef[]{});
    }

    public UnitDef[] getUnitsByCategory(String categoryId) {
        ArrayList<UnitDef> list = new ArrayList<>();

        for (UnitDef unit : units) {
            if (ArrayUtils.contains(unit.getCategoryId(), categoryId)) {
                list.add(unit);
            }
        }

        return list.toArray(new UnitDef[]{});
    }

    public UnitDef[] getUnitsByCategory(Category category) {
        return getUnitsByCategory(category.getId());
    }

    public BattleEnvironment[] getBattleEnvironments() {
        return battleEnvironments;
    } // TODO: 2025-01-12 impletent get-by-id esque function

    public XpTable[] getXpTable() {
        return xpTable;
    }

    public XpTable getXpTable(String id) {
        for (XpTable xpTable1 : xpTable) {
            if (xpTable1.getId().equals(id)) {
                return xpTable1;
            }
        }

        throw new NoSuchElementException(); // TODO: 2025-01-12 more specific error message
    }

    public CraftingMaterialDef[] getMaterial() {
        return material;
    }

    public CraftingMaterialDef getMaterial(String id) {
        for (CraftingMaterialDef craftingMaterialDef : material) {
            if (craftingMaterialDef.getId().equals(id)) {
                return craftingMaterialDef;
            }
        }

        throw new NoSuchElementException(); // TODO: 2025-01-12 more specific error message
    }

    public Recipe[] getRecipe() {
        return recipe;
    }

    public Recipe getRecipe(String id) {
        for (Recipe recipe1 : recipe) {
            if (recipe1.getId().equals(id)) {
                return recipe1;
            }
        }

        throw new NoSuchElementException(); // TODO: 2025-01-12 more specific error message
    }

    public StatProgression[] getStatProgression() {
        return statProgression;
    }

    public StatProgression getStatProgression(String id) {
        for (StatProgression progression : statProgression) {
            if (progression.getId().equals(id)) {
                return progression;
            }
        }

        throw new NoSuchElementException(); // TODO: 2025-01-12 more specific error message
    }

    public Category[] getCategory() {
        return category;
    }

    public Category getCategory(String id) {
        for (Category category1 : category) {
            if (category1.getId().equals(id)) {
                return category1;
            }
        }

        throw new NoSuchElementException(); // TODO: 2025-01-12 more specific error message
    }

    public HelpEntry[] getHelpEntry() {
        return helpEntry;
    } // TODO: 2025-01-12 check if can implement get by id

    public Challenge[] getChallenge() {
        return challenge;
    }

    public Challenge getChallenge(String id) {
        for (Challenge challenge1 : challenge) {
            if (challenge1.getId().equals(id)) {
                return challenge1;
            }
        }

        throw new NoSuchElementException(); // TODO: 2025-01-12 more specific error message
    }

    public SkillDefinition[] getSkill() {
        return skill;
    }

    public SkillDefinition getSkill(String id) {
        for (SkillDefinition definition : skill) {
            if (definition.getId().equals(id)) {
                return definition;
            }
        }

        throw new NoSuchElementException(); // TODO: 2025-01-12 more specific error message
    }

    public EventSampling[] getEventSampling() {
        return eventSampling;
    } // TODO: 2025-01-12 check if can implement get by id

    public EquipmentDef[] getEquipment() {
        return equipment;
    }

    public EquipmentDef getEquipment(String id) {
        for (EquipmentDef equipmentDef : equipment) {
            if (equipmentDef.getId().equals(id)) {
                return equipmentDef;
            }
        }

        throw new NoSuchElementException(); // TODO: 2025-01-12 more specific error message
    }

    public WarDef[] getWarDefinition() {
        return warDefinition;
    }

    public WarDef getWarDefinition(String id) {
        for (WarDef warDef : warDefinition) {
            if (warDef.getId().equals(id)) {
                return warDef;
            }
        }

        throw new NoSuchElementException(); // TODO: 2025-01-12 more specific error message
    }

    // TODO: 2025-01-12 implement get by id
    public TargetingSet[] getTargetingSet() {
        return targetingSet;
    }

    // TODO: 2025-01-12 implement get by id
    public Ability[] getAbility() {
        return ability;
    }

    // TODO: 2025-01-12 implement get by id
    public Effect[] getEffect() {
        return effect;
    }

    // TODO: 2025-01-12 implement get by id
    public Requirement[] getRequirement() {
        return requirement;
    }

    // TODO: 2025-01-12 implement get by id
    public PowerUpBundle[] getPowerUpBundle() {
        return powerUpBundle;
    }

    public GuildBannerDef getGuildBanner() {
        return guildBanner;
    }

    // TODO: 2025-01-12 implement get by id
    public GuildRaidConfig[] getRaidConfig() {
        return raidConfig;
    }

    // TODO: 2025-01-12 implement get by id
    public StatModSetDefinition[] getStatModSet() {
        return statModSet;
    }

    // TODO: 2025-01-12 implement get by id
    public StatModDefinition[] getStatMod() {
        return statMod;
    }

    // TODO: 2025-01-12 implement get by id
    public GuildExchangeItem[] getGuildExchangeItem() {
        return guildExchangeItem;
    }

    // TODO: 2025-01-12 implement get by id
    public Table[] getTable() {
        return table;
    }

    // TODO: 2025-01-12 implement get by id
    public UnlockAnnouncementDefinition[] getUnlockAnnouncementDefinition() {
        return unlockAnnouncementDefinition;
    }

    // TODO: 2025-01-12 implement get by id
    public EffectTarget[] getBattleTargetingRule() {
        return battleTargetingRule;
    }
    // TODO: 2025-01-12 implement get by id

    public TerritoryBattleDefinition[] getTerritoryBattleDefinition() {
        return territoryBattleDefinition;
    }

    // TODO: 2025-01-12 implement get by id
    public TerritoryWarDefinition[] getTerritoryWarDefinition() {
        return territoryWarDefinition;
    }

    // TODO: 2025-01-12 implement get by id
    public EnvironmentCollection[] getEnvironmentCollection() {
        return environmentCollection;
    }

    // TODO: 2025-01-12 implement get by id
    public ChallengeStyle[] getChallengeStyle() {
        return challengeStyle;
    }

    public SocialStatus getSocialStatus() {
        return socialStatus;
    }

    // TODO: 2025-01-12 implement get by id
    public StarterGuildDef[] getStarterGuild() {
        return starterGuild;
    }

    // TODO: 2025-01-12 implement get by id
    public PlayerTitleDefinition[] getPlayerTitle() {
        return playerTitle;
    }

    // TODO: 2025-01-12 implement get by id
    public ModRecommendation[] getModRecommendation() {
        return modRecommendation;
    }

    // TODO: 2025-01-12 implement get by id
    public PersistentVfx[] getPersistentVfx() {
        return persistentVfx;
    }

    // TODO: 2025-01-12 implement get by id
    public TerritoryTournamentDefinition[] getTerritoryTournamentDefinition() {
        return territoryTournamentDefinition;
    }

    // TODO: 2025-01-12 implement get by id
    public EventBonus[] getEventBonus() {
        return eventBonus;
    }

    // TODO: 2025-01-12 implement get by id
    public SkillDefinition[] getSkillDefinition() {
        return skillDefinition;
    }

    // TODO: 2025-01-12 implement get by id
    public PlayerPortraitDefinition[] getPlayerPortrait() {
        return playerPortrait;
    }

    public TimeZoneChangeConfig getTimeZoneChangeConfig() {
        return timeZoneChangeConfig;
    }

    public String[] getEffectIconPriority() {
        return effectIconPriority;
    }

    // TODO: 2025-01-12 implement get by id
    public MysteryBoxDefinition[] getMysteryBox() {
        return mysteryBox;
    }

    // TODO: 2025-01-12 implement get by id
    public MysteryStatModDefinition[] getMysteryStatMod() {
        return mysteryStatMod;
    }

    // TODO: 2025-01-12 implement get by id
    public Cooldown[] getCooldown() {
        return cooldown;
    }

    // TODO: 2025-01-12 implement get by id
    public DailyActionCap[] getDailyActionCap() {
        return dailyActionCap;
    }

    // TODO: 2025-01-12 implement get by id
    public EnergyRewardDefinition[] getEnergyReward() {
        return energyReward;
    }

    public String getTerritoryTournamentMatchmakingDescKey() {
        return territoryTournamentMatchmakingDescKey;
    }

    // TODO: 2025-01-12 implement get by id
    public SeasonLeagueDefinition[] getSeasonLeagueDefinition() {
        return seasonLeagueDefinition;
    }

    // TODO: 2025-01-12 implement get by id
    public SeasonDivisionDefinition[] getSeasonDivisionDefinition() {
        return seasonDivisionDefinition;
    }

    // TODO: 2025-01-12 implement get by id
    public SeasonRewardTable[] getSeasonRewardTable() {
        return seasonRewardTable;
    }

    // TODO: 2025-01-12 implement get by id
    public RelicTierDefinition[] getRelicTierDefinition() {
        return relicTierDefinition;
    }

    // TODO: 2025-01-12 implement get by id
    public ConversionSet[] getScavengerConversionSet() {
        return scavengerConversionSet;
    }

    // TODO: 2025-01-12 implement get by id
    public UnitGuideDefinition[] getUnitGuideDefinition() {
        return unitGuideDefinition;
    }

    // TODO: 2025-01-12 implement get by id
    public GalacticBundle[] getGalacticBundle() {
        return galacticBundle;
    }

    // TODO: 2025-01-12 implement get by id
    public LinkedStoreItem[] getLinkedStoreItem() {
        return linkedStoreItem;
    }

    // TODO: 2025-01-12 implement get by id
    public TerritoryTournamentLeagueDefinition[] getTerritoryTournamentLeagueDefinition() {
        return territoryTournamentLeagueDefinition;
    }

    // TODO: 2025-01-12 implement get by id
    public TerritoryTournamentDivisionDefinition[] getTerritoryTournamentDivisionDefinition() {
        return territoryTournamentDivisionDefinition;
    }

    // TODO: 2025-01-12 implement get by id
    public SaveSquadConfig[] getSavedSquadConfig() {
        return savedSquadConfig;
    }

    public GuildRaidGlobalConfig getGuildRaidGlobalConfig() {
        return guildRaidGlobalConfig;
    }

    // TODO: 2025-01-12 implement get by id
    public Campaign[] getCampaign() {
        return campaign;
    }

    @Override
    public String toString() {
        return "GameData{" +
                "units=" + Arrays.toString(units) +
                ", battleEnvironments=" + Arrays.toString(battleEnvironments) +
                ", xpTable=" + Arrays.toString(xpTable) +
                ", material=" + Arrays.toString(material) +
                ", recipe=" + Arrays.toString(recipe) +
                ", statProgression=" + Arrays.toString(statProgression) +
                ", category=" + Arrays.toString(category) +
                ", helpEntry=" + Arrays.toString(helpEntry) +
                ", challenge=" + Arrays.toString(challenge) +
                ", skill=" + Arrays.toString(skill) +
                ", eventSampling=" + Arrays.toString(eventSampling) +
                ", equipment=" + Arrays.toString(equipment) +
                ", warDefinition=" + Arrays.toString(warDefinition) +
                ", targetingSet=" + Arrays.toString(targetingSet) +
                ", ability=" + Arrays.toString(ability) +
                ", effect=" + Arrays.toString(effect) +
                ", requirement=" + Arrays.toString(requirement) +
                ", powerUpBundle=" + Arrays.toString(powerUpBundle) +
                ", guildBanner=" + guildBanner +
                ", raidConfig=" + Arrays.toString(raidConfig) +
                ", statModSet=" + Arrays.toString(statModSet) +
                ", statMod=" + Arrays.toString(statMod) +
                ", guildExchangeItem=" + Arrays.toString(guildExchangeItem) +
                ", table=" + Arrays.toString(table) +
                ", unlockAnnouncementDefinition=" + Arrays.toString(unlockAnnouncementDefinition) +
                ", battleTargetingRule=" + Arrays.toString(battleTargetingRule) +
                ", territoryBattleDefinition=" + Arrays.toString(territoryBattleDefinition) +
                ", territoryWarDefinition=" + Arrays.toString(territoryWarDefinition) +
                ", environmentCollection=" + Arrays.toString(environmentCollection) +
                ", challengeStyle=" + Arrays.toString(challengeStyle) +
                ", socialStatus=" + socialStatus +
                ", starterGuild=" + Arrays.toString(starterGuild) +
                ", playerTitle=" + Arrays.toString(playerTitle) +
                ", modRecommendation=" + Arrays.toString(modRecommendation) +
                ", persistentVfx=" + Arrays.toString(persistentVfx) +
                ", territoryTournamentDefinition=" + Arrays.toString(territoryTournamentDefinition) +
                ", eventBonus=" + Arrays.toString(eventBonus) +
                ", skillDefinition=" + Arrays.toString(skillDefinition) +
                ", playerPortrait=" + Arrays.toString(playerPortrait) +
                ", timeZoneChangeConfig=" + timeZoneChangeConfig +
                ", effectIconPriority=" + Arrays.toString(effectIconPriority) +
                ", mysteryBox=" + Arrays.toString(mysteryBox) +
                ", mysteryStatMod=" + Arrays.toString(mysteryStatMod) +
                ", cooldown=" + Arrays.toString(cooldown) +
                ", dailyActionCap=" + Arrays.toString(dailyActionCap) +
                ", energyReward=" + Arrays.toString(energyReward) +
                ", territoryTournamentMatchmakingDescKey='" + territoryTournamentMatchmakingDescKey + '\'' +
                ", seasonLeagueDefinition=" + Arrays.toString(seasonLeagueDefinition) +
                ", seasonDivisionDefinition=" + Arrays.toString(seasonDivisionDefinition) +
                ", seasonRewardTable=" + Arrays.toString(seasonRewardTable) +
                ", relicTierDefinition=" + Arrays.toString(relicTierDefinition) +
                ", scavengerConversionSet=" + Arrays.toString(scavengerConversionSet) +
                ", unitGuideDefinition=" + Arrays.toString(unitGuideDefinition) +
                ", galacticBundle=" + Arrays.toString(galacticBundle) +
                ", linkedStoreItem=" + Arrays.toString(linkedStoreItem) +
                ", territoryTournamentLeagueDefinition=" + Arrays.toString(territoryTournamentLeagueDefinition) +
                ", territoryTournamentDivisionDefinition=" + Arrays.toString(territoryTournamentDivisionDefinition) +
                ", savedSquadConfig=" + Arrays.toString(savedSquadConfig) +
                ", guildRaidGlobalConfig=" + guildRaidGlobalConfig +
                ", campaign=" + Arrays.toString(campaign) +
                '}';
    }
}
