package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.GcActivityLevel;
import hxasjc.swgoh.enums.MemoryLevel;
import hxasjc.swgoh.enums.PerformanceLevel;
import hxasjc.swgoh.enums.VfxAllocationLevel;

import java.util.Arrays;

@SuppressWarnings("unused")
public class ClientQualityData {
    private PerformanceLevel performanceLevel;
    private MemoryLevel memoryLevel;
    private GcActivityLevel gcActivityLevel;
    private VfxAllocationLevel vfxAllocationLevel;
    private String[] flag;

    public PerformanceLevel getPerformanceLevel() {
        return performanceLevel;
    }

    public MemoryLevel getMemoryLevel() {
        return memoryLevel;
    }

    public GcActivityLevel getGcActivityLevel() {
        return gcActivityLevel;
    }

    public VfxAllocationLevel getVfxAllocationLevel() {
        return vfxAllocationLevel;
    }

    public String[] getFlag() {
        return flag;
    }

    @Override
    public String toString() {
        return "ClientQualityData{" +
                "performanceLevel=" + performanceLevel +
                ", memoryLevel=" + memoryLevel +
                ", gcActivityLevel=" + gcActivityLevel +
                ", vfxAllocationLevel=" + vfxAllocationLevel +
                ", flag=" + Arrays.toString(flag) +
                '}';
    }
}
