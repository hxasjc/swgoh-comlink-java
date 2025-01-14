package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.MemberContributionType;

@SuppressWarnings("unused")
public class GuildMemberContribution {
    private MemberContributionType type;
    private long currentValue;
    private long lifetimeValue;

    public MemberContributionType getType() {
        return type;
    }

    public long getCurrentValue() {
        return currentValue;
    }

    public long getLifetimeValue() {
        return lifetimeValue;
    }

    @Override
    public String toString() {
        return "GuildMemberContribution{" +
                "type=" + type +
                ", currentValue=" + currentValue +
                ", lifetimeValue=" + lifetimeValue +
                '}';
    }
}
