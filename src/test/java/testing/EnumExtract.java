package testing;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class EnumExtract {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("X:\\jq\\enums.json");

        Type listType = new TypeToken<List<Map<String, Map<String, Integer>>>>(){}.getType();

        Map<String, Map<String, Integer>> list = new Gson().fromJson(new JsonReader(new FileReader(file)), listType);

        Map<String, Integer> map = list.get(0);
        System.out.println(map);
    }

    public static class EnumsList {
        List<Map<String, Map<String, Integer>>> list;
    }
}
