package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.RecipeType;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Recipe {
    private String id;
    private String descKey;
    private BucketItem result;
    private BucketItem[] ingredients;
    private RecipeType type;
    private Requirement viewRequirement;
    private int unlockLevel;
    private Requirement craftRequirement;

    public String getId() {
        return id;
    }

    public String getDescKey() {
        return descKey;
    }

    public BucketItem getResult() {
        return result;
    }

    public BucketItem[] getIngredients() {
        return ingredients;
    }

    public RecipeType getType() {
        return type;
    }

    public Requirement getViewRequirement() {
        return viewRequirement;
    }

    public int getUnlockLevel() {
        return unlockLevel;
    }

    public Requirement getCraftRequirement() {
        return craftRequirement;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id='" + id + '\'' +
                ", descKey='" + descKey + '\'' +
                ", result=" + result +
                ", ingredients=" + Arrays.toString(ingredients) +
                ", type=" + type +
                ", viewRequirement=" + viewRequirement +
                ", unlockLevel=" + unlockLevel +
                ", craftRequirement=" + craftRequirement +
                '}';
    }
}
