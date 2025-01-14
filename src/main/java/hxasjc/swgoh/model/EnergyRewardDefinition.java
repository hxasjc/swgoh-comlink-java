package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.EnergyType;

import java.util.Arrays;

@SuppressWarnings("unused")
public class EnergyRewardDefinition {
    private EnergyType energyType;
    private EnergyRewardInstance[] instance;

    public EnergyType getEnergyType() {
        return energyType;
    }

    public EnergyRewardInstance[] getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "EnergyRewardDefinition{" +
                "energyType=" + energyType +
                ", instance=" + Arrays.toString(instance) +
                '}';
    }
}
