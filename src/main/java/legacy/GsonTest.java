package legacy;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import hxasjc.swgoh.enums.ItemType;
import hxasjc.swgoh.model.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.time.Instant;
import java.util.Map;
import java.util.function.UnaryOperator;

public class GsonTest {

    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) throws IOException {
        Instant start = Instant.now();

        File dataFile = new File("X:\\jq\\swgoh-data.json");
        File localisationFile = new File("X:\\jq\\Loc_ENG_US.txt.json");

        JsonReader reader = new JsonReader(new FileReader(dataFile));
        GameData data = GSON.fromJson(reader, GameData.class);

        System.out.println(data.getAbility().length);

        Localisation localisation = GSON.fromJson(new JsonReader(new FileReader(localisationFile)), Localisation.class);

        System.out.println(localisation.data.size());


        File outputSheet = new File("X:\\jq\\titlePortraitOutput.xlsx");
        //createExcelSpreadsheet(data, localisation, outputSheet);

        Instant end = Instant.now();
        long duration = end.toEpochMilli() - start.toEpochMilli();
        System.out.println((double) duration / 1000);
    }

    public static Localisation getLocalisation() throws FileNotFoundException {
        File localisationFile = new File("X:\\jq\\Loc_ENG_US.txt.json");
        Localisation localisation = GSON.fromJson(new JsonReader(new FileReader(localisationFile)), Localisation.class);
        return localisation;
    }

    public static void createExcelSpreadsheet(GameData data, Localisation localisation, File destination) throws IOException {
        UnaryOperator<String> getLocalisation = s -> localisation.data.getOrDefault(s, s);

        XSSFWorkbook workbook = new XSSFWorkbook();

        CellStyle headerStyle = workbook.createCellStyle();
        XSSFFont headerFont = workbook.createFont();
        //headerFont.setFontName("Arial");
        //headerFont.setFontHeight(16);
        headerFont.setBold(true);
        headerStyle.setFont(headerFont);

        //titles
        {
            Sheet titles = workbook.createSheet("Titles");

            //header row
            //id, nameKey, shortDescKey, descKey, obtainable, hidden
            {
                Row header = titles.createRow(0);

                Cell cell = header.createCell(0);
                cell.setCellValue("ID");
                cell.setCellStyle(headerStyle);

                cell = header.createCell(1);
                cell.setCellValue("Name");
                cell.setCellStyle(headerStyle);

                cell = header.createCell(2);
                cell.setCellValue("Short Description");
                cell.setCellStyle(headerStyle);

                cell = header.createCell(3);
                cell.setCellValue("Description");
                cell.setCellStyle(headerStyle);

                cell = header.createCell(4);
                cell.setCellValue("Obtainable?");
                cell.setCellStyle(headerStyle);

                cell = header.createCell(5);
                cell.setCellValue("Hidden?");
                cell.setCellStyle(headerStyle);
            }

            //content rows
            {
                int rowId = 1;
                for (PlayerTitleDefinition title : data.getPlayerTitle()) {
                    Row row = titles.createRow(rowId);

                    row.createCell(0).setCellValue(title.getId());
                    row.createCell(1).setCellValue(localisation.data.getOrDefault(title.getNameKey(), title.getNameKey()));
                    row.createCell(2).setCellValue(localisation.data.getOrDefault(title.getShortDescKey(), title.getShortDescKey()));
                    row.createCell(3).setCellValue(localisation.data.getOrDefault(title.getDescKey(), title.getDescKey()));
                    row.createCell(4).setCellValue(title.isObtainable());
                    row.createCell(5).setCellValue(title.isHidden());

                    rowId++;
                }
            }
        }

        //portraits
        {
            Sheet portraits = workbook.createSheet("Portraits");

            //header row
            //id, nameKey, descKey, obtainable, hidden, icon
            {
                Row header = portraits.createRow(0);

                Cell cell = header.createCell(0);
                cell.setCellValue("ID");
                cell.setCellStyle(headerStyle);

                cell = header.createCell(1);
                cell.setCellValue("Name");
                cell.setCellStyle(headerStyle);

                cell = header.createCell(2);
                cell.setCellValue("Description");
                cell.setCellStyle(headerStyle);

                cell = header.createCell(3);
                cell.setCellValue("Obtainable?");
                cell.setCellStyle(headerStyle);

                cell = header.createCell(4);
                cell.setCellValue("Hidden?");
                cell.setCellStyle(headerStyle);

                cell = header.createCell(5);
                cell.setCellValue("Icon");
                cell.setCellStyle(headerStyle);
            }

            //content rows
            {
                int rowId = 1;
                for (PlayerPortraitDefinition portrait : data.getPlayerPortrait()) {
                    Row row = portraits.createRow(rowId);

                    row.createCell(0).setCellValue(portrait.getId());
                    row.createCell(1).setCellValue(localisation.data.getOrDefault(portrait.getNameKey(), portrait.getNameKey()));
                    row.createCell(2).setCellValue(localisation.data.getOrDefault(portrait.getDescKey(), portrait.getDescKey()));
                    row.createCell(3).setCellValue(portrait.isObtainable());
                    row.createCell(4).setCellValue(portrait.isHidden());
                    row.createCell(5).setCellValue(portrait.getIcon());

                    rowId++;
                }
            }
        }

        //old challenges
        /*{
            Sheet challenges = workbook.createSheet("Challenges");

            //header row
            //id, type, nameKey, descKey
            {
                Row header = challenges.createRow(0);

                Cell cell = header.createCell(0);
                cell.setCellValue("ID");
                cell.setCellStyle(headerStyle);

                cell = header.createCell(1);
                cell.setCellValue("Type");
                cell.setCellStyle(headerStyle);

                cell = header.createCell(2);
                cell.setCellValue("Name");
                cell.setCellStyle(headerStyle);

                cell = header.createCell(3);
                cell.setCellValue("Description");
                cell.setCellStyle(headerStyle);
            }

            //content rows
            {
                int rowId = 1;
                for (Challenge challenge : data.getChallenge()) {
                    Row row = challenges.createRow(rowId);

                    row.createCell(0).setCellValue(challenge.getId());
                    row.createCell(1).setCellValue(String.valueOf(challenge.getType()));
                    row.createCell(2).setCellValue(localisation.data.getOrDefault(challenge.getNameKey(), challenge.getNameKey()));
                    row.createCell(3).setCellValue(localisation.data.getOrDefault(challenge.getDescKey(), challenge.getDescKey()));

                    rowId++;
                }
            }
        }*/

        //new challenges
        {
            Sheet challenges = workbook.createSheet("Challenges");

            //header row
            //ID, Type, Name, Desc
            {
                Row row = challenges.createRow(0);

                Cell cell = row.createCell(0);
                cell.setCellValue("ID");
                cell.setCellStyle(headerStyle);

                cell = row.createCell(1);
                cell.setCellValue("Type");
                cell.setCellStyle(headerStyle);

                cell = row.createCell(2);
                cell.setCellValue("Name");
                cell.setCellStyle(headerStyle);

                cell = row.createCell(3);
                cell.setCellValue("Description");
                cell.setCellStyle(headerStyle);

                int cellId = 4;

                for (ItemType type : ItemType.values()) {
                    cell = row.createCell(cellId);
                    cell.setCellStyle(headerStyle);
                    cell.setCellValue(String.valueOf(type));

                    cellId++;
                }
            }

            //content rows
            {
                int rowId = 1;
                int rewardOffset = 4;

                for (Challenge challenge : data.getChallenge()) {
                    Row row = challenges.createRow(rowId);

                    row.createCell(0).setCellValue(challenge.getId());
                    row.createCell(1).setCellValue(String.valueOf(challenge.getType()));
                    row.createCell(2).setCellValue(getLocalisation.apply(challenge.getNameKey()));
                    row.createCell(3).setCellValue(getLocalisation.apply(challenge.getDescKey()));

                    for (BucketItem bucketItem : challenge.getReward()) {
                        ItemType type = bucketItem.getType();
                        int col = type.ordinal() + rewardOffset;

                        Cell cell = row.createCell(col);
                        cell.setCellValue("%s - %s".formatted(bucketItem.getMinQuantity(), bucketItem.getMaxQuantity()));
                    }
                }
            }
        }

        FileOutputStream outputStream = new FileOutputStream(destination);
        workbook.write(outputStream);
        workbook.close();
    }

    public static class Localisation {
        public String version;
        public Map<String, String> data;
    }
}
