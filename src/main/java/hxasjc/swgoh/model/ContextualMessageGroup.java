package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class ContextualMessageGroup {
    private String groupId;
    private String startMessage;
    private ContextualMessage[] message;
    private int priority;
    private boolean canDismissWhileHidden;
    private long startTime;
    private long endTime;
    private boolean isFtue;

    public String getGroupId() {
        return groupId;
    }

    public String getStartMessage() {
        return startMessage;
    }

    public ContextualMessage[] getMessage() {
        return message;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isCanDismissWhileHidden() {
        return canDismissWhileHidden;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public boolean isFtue() {
        return isFtue;
    }

    @Override
    public String toString() {
        return "ContextualMessageGroup{" +
                "groupId='" + groupId + '\'' +
                ", startMessage='" + startMessage + '\'' +
                ", message=" + Arrays.toString(message) +
                ", priority=" + priority +
                ", canDismissWhileHidden=" + canDismissWhileHidden +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", isFtue=" + isFtue +
                '}';
    }
}
