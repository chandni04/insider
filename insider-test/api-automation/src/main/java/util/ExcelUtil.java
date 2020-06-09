package util;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelUtil {

    public static void writeMovieDataToExcel(List<String> movies, String fileName) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Movies without content");
        int rowId = 0;
        int cellId = 0;
        XSSFRow row = sheet.createRow(rowId++);
        XSSFCell cell = row.createCell(cellId);
        cell.setCellValue("Movie Name");
        for (String movie : movies) {
            row = sheet.createRow(rowId++);
            cell = row.createCell(cellId);
            cell.setCellValue(movie);
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileName));
            workbook.write(fileOutputStream);
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
