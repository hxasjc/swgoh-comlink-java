package localisation;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

@SuppressWarnings("unused")
public class Localisation {
    private String version;
    private Map<String, String> data;

    public int size() {
        return data.size();
    }

    public boolean containsKey(String key) {
        return data.containsKey(key);
    }

    public boolean containsValue(String value) {
        return data.containsValue(value);
    }

    public String get(String key) {
        return data.get(key);
    }

    @NotNull
    public Set<String> keySet() {
        return data.keySet();
    }

    @NotNull
    public Collection<String> values() {
        return data.values();
    }

    @NotNull
    public Set<Map.Entry<String, String>> entrySet() {
        return data.entrySet();
    }

    public String getOrDefault(String key, String defaultValue) {
        return data.getOrDefault(key, defaultValue);
    }

    public String getOrLocKey(String key) {
        return data.getOrDefault(key, key);
    }

    public void forEach(BiConsumer<String, String> action) {
        data.forEach(action);
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "Localisation{" +
                "version='" + version + '\'' +
                ", data=" + data +
                '}';
    }
}
