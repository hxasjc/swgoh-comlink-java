package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.TerritoryMapPhase;

@SuppressWarnings("unused")
public class TerritoryLocalNote {
    private String messageKey;
    private String titleKey;
    private boolean optedIn;
    private TerritoryMapPhase phase;
    private int phaseTimeOffsetSeconds;
    private boolean finalMatchOnly;
    private boolean perSubPhaseRoundEnd;

    public String getMessageKey() {
        return messageKey;
    }

    public String getTitleKey() {
        return titleKey;
    }

    public boolean isOptedIn() {
        return optedIn;
    }

    public TerritoryMapPhase getPhase() {
        return phase;
    }

    public int getPhaseTimeOffsetSeconds() {
        return phaseTimeOffsetSeconds;
    }

    public boolean isFinalMatchOnly() {
        return finalMatchOnly;
    }

    public boolean isPerSubPhaseRoundEnd() {
        return perSubPhaseRoundEnd;
    }

    @Override
    public String toString() {
        return "TerritoryLocalNote{" +
                "messageKey='" + messageKey + '\'' +
                ", titleKey='" + titleKey + '\'' +
                ", optedIn=" + optedIn +
                ", phase=" + phase +
                ", phaseTimeOffsetSeconds=" + phaseTimeOffsetSeconds +
                ", finalMatchOnly=" + finalMatchOnly +
                ", perSubPhaseRoundEnd=" + perSubPhaseRoundEnd +
                '}';
    }
}
