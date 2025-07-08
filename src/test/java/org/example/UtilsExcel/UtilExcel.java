package org.example.UtilsExcel;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class UtilExcel {

    // Apache POI
    // Read the File - TestData.xlsX
    //  Workbook Create
    // Sheet
    // Row and Cell
    // 2D Object  - getData()

    // File -> Workbook -> Sheet-> Row -> cell -> [][]

    static Workbook book;
    static Sheet sheet;

    public static String SHEET_PATH = System.getProperty("user.dir") + "/src/main/resources/fake_login_data.xlsx";


    public static Object[][] getTestDataFromExcel(String sheetName) {
        FileInputStream file = null;
        //
        try {
            file = new FileInputStream(SHEET_PATH);
            book = WorkbookFactory.create(file);
            sheet = book.getSheet(sheetName);



        } catch (IOException e) {
            throw new RuntimeException("Excel file not found or cannot be opened: " + SHEET_PATH, e);
        }


        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

        // 5x2
        for (int i = 0; i < sheet.getLastRowNum(); i++) { // 0 to 4
            for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {

                // First row email, password -> coumn name - skip - header
                data[i][j] = sheet.getRow(i + 1).getCell(j).toString();

            }
        }
        return data;
    }


}
