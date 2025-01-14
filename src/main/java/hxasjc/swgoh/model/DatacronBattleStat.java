package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class DatacronBattleStat {
    private String id;
    private int setId;
    private String templateId;
    private String[] tag;
    private DatacronAffix[] affix;

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

    @Override
    public String toString() {
        return "DatacronBattleStat{" +
                "id='" + id + '\'' +
                ", setId=" + setId +
                ", templateId='" + templateId + '\'' +
                ", tag=" + Arrays.toString(tag) +
                ", affix=" + Arrays.toString(affix) +
                '}';
    }
}
