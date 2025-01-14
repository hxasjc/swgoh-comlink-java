package legacy;

import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.apache.commons.lang.StringUtils.removeEnd;
import static org.apache.commons.lang.StringUtils.removeStart;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        //File titles = new File("X:\\jq\\playertitle.txt");
        //Scanner scanner = new Scanner(titles);

        String line = "\"PLAYERTITLE_BATTALIONBREAKER_SHORT_DESC\": \"Beat \\\"Clash on Kamino\\\" in the Clash on Kamino event\",";

        String[] arr = line.split(": ");
        String value = removeStart(removeEnd(removeEnd(arr[1], "\""), "\","), "\"");
        System.out.println(value);
    }
}
