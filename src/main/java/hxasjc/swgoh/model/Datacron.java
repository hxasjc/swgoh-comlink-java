package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Datacron {
    private String id;
    private int setId;
    private String templateId;
    private String[] tag;
    private DatacronAffix[] affix;
    private boolean locked;
    private int rerollIndex;
    private DatacronAffix[] rerollOption;
    private int rerollCount;

    public String getId() {
        return id;
    }

    public int getSetId() {
        return setId;
    }

    public String getTemplateId() {
        return templateId;
    }

    public String[] getTag() {
        return tag;
    }

    public DatacronAffix[] getAffix() {
        return affix;
    }

    public boolean isLocked() {
        return locked;
    }

    public int getRerollIndex() {
        return rerollIndex;
    }

    public DatacronAffix[] getRerollOption() {
        return rerollOption;
    }

    public int getRerollCount() {
        return rerollCount;
    }

    @Override
    public String toString() {
        return "Datacron{" +
                "id='" + id + '\'' +
                ", setId=" + setId +
                ", templateId='" + templateId + '\'' +
                ", tag=" + Arrays.toString(tag) +
                ", affix=" + Arrays.toString(affix) +
                ", locked=" + locked +
                ", rerollIndex=" + rerollIndex +
                ", rerollOption=" + Arrays.toString(rerollOption) +
                ", rerollCount=" + rerollCount +
                '}';
    }
}
