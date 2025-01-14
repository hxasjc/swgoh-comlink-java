package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.TerritoryZoneCommandState;
import hxasjc.swgoh.enums.TerritoryZoneState;

@SuppressWarnings("unused")
public class TerritoryZoneStatus {
    private String zoneId;
    private TerritoryZoneState zoneState;
    private long score;
    private String channelId;
    private String commandMessage;
    private TerritoryZoneCommandState commandState;
}
