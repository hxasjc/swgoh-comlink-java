package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.RoomType;

@SuppressWarnings("unused")
public class RoomData {
    private String roomId;
    private RoomType type;
    private String name;
    private String topic;
    private long creationTime;
    private String ownerId;

    public String getRoomId() {
        return roomId;
    }

    public RoomType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getTopic() {
        return topic;
    }

    public long getCreationTime() {
        return creationTime;
    }

    public String getOwnerId() {
        return ownerId;
    }

    @Override
    public String toString() {
        return "RoomData{" +
                "roomId='" + roomId + '\'' +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", topic='" + topic + '\'' +
                ", creationTime=" + creationTime +
                ", ownerId='" + ownerId + '\'' +
                '}';
    }
}
