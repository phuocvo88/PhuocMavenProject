package seleniumutils;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class ExcelUtils {


    public void readExcel(String filepath, String fileName, String sheetName) throws Exception {
        createWorkbook(filepath, fileName);


    }

    public static Workbook createWorkbook(String filepath, String fileName) throws IOException {
        File file = new File(filepath + "\\" + fileName);
        FileInputStream fis = new FileInputStream(file);
        Workbook wb = null;
        String fileExtensionName = fileName.substring(fileName.indexOf("."));


        if(fileExtensionName.equals(".xlsx")){

            //If it is xlsx file then create object of XSSFWorkbook class

            wb = new XSSFWorkbook(fis);

        }

        //Check condition if the file is xls file

        else if(fileExtensionName.equals(".xls")){

            //If it is xls file then create object of XSSFWorkbook class

            wb = new HSSFWorkbook(fis);

        }


        return wb;
    }

    public static boolean compareWorkbookData(Workbook wb1, Workbook wb2,String wb1_sheet, String wb2_sheet){
        boolean matchCheck = TRUE;
        Sheet book1Sheet = wb1.getSheet(wb1_sheet);
        Sheet book2Sheet = wb2.getSheet(wb2_sheet);

        int rowCount_book1 = book1Sheet.getLastRowNum()- book1Sheet.getFirstRowNum();
        int rowCount_book2 = book2Sheet.getLastRowNum()- book2Sheet.getFirstRowNum();

        //Compare xem file nao co so dòng nhiều hơn
        /*
        if book1Sheet.getLastRowNum() > book2Sheet.getLastRowNum() ==> print: book1 has more row than book2
        else if book1Sheet.getLastRowNum() > book2Sheet.getLastRowNum() ==> print: book2 has more row than book1
        else ==> print 2 files have same row
         */

        //convert cell into String type
        for (int i = 0; i < book1Sheet.getLastRowNum(); i++){
            Row row = book1Sheet.getRow(i);

            for(int j = 0; j < row.getLastCellNum(); j++ ){
                row.getCell(j).setCellType(CellType.STRING);

            }

        }

       /* System.out.println("Cell A1 value: " + book1Sheet.getRow(3).getCell(0).getStringCellValue());
        System.out.println("Cell A1 data type: " + book1Sheet.getRow(3).getCell(0).getCellType());*/


        for (int i = 0; i < book2Sheet.getLastRowNum(); i++){
            Row row = book2Sheet.getRow(i);

            for(int j = 0; j < row.getLastCellNum(); j++ ){
                row.getCell(j).setCellType(CellType.STRING);

            }

        }

        String cellSheet1Value = null;
        String cellSheet2Value = null;

            for (int i = 1; i < book2Sheet.getLastRowNum(); i++) {
                Row row1 = book1Sheet.getRow(i);
                Row row2 = book2Sheet.getRow(i);

                for (int j = 0; j < row1.getLastCellNum(); j++) {
                     cellSheet1Value = row1.getCell(j).getStringCellValue();
                     cellSheet2Value = row2.getCell(j).getStringCellValue();
                    System.out.println("   cell wb1 at " + i + 1 + "  " + cellSheet1Value + "\nand " + "cell wb2 at " + i + 1 + "  " + cellSheet2Value);

                    if(cellSheet1Value.equals(cellSheet2Value)){
                        matchCheck = TRUE;
                    }else{
                        matchCheck = FALSE;
                        System.out.println("cells don't match");
                        return matchCheck;
                    }

                }


            }
        System.out.println("matchcheck value = " + matchCheck);
        return matchCheck;
    }


    public static boolean compareExcel(String fileTargetLink1, String fileTargetLink2) throws Exception{
        boolean matchCheck = TRUE;
        FileInputStream fis1 = new FileInputStream(fileTargetLink1);
        FileInputStream fis2 = new FileInputStream(fileTargetLink2);

        Workbook wb1 = null;
        Workbook wb2 = null;

        String fileExtension1 = fileTargetLink1.substring(fileTargetLink1.indexOf("."));
        String fileExtension2 = fileTargetLink2.substring(fileTargetLink2.indexOf("."));

        if (fileExtension1.equals(".xlsx") ){
            wb1 = new XSSFWorkbook(fis1);
        }else if (fileExtension1.equals(".xls"))
            wb1 = new HSSFWorkbook(fis1);


        if (fileExtension2.equals(".xlsx")){
            wb2 = new XSSFWorkbook(fis2);
        }else if (fileExtension2.equals(".xls"))
            wb2 = new HSSFWorkbook();

        Sheet wb1_sheet = wb1.getSheetAt(0);
        Sheet wb2_sheet = wb2.getSheetAt(0);

        int wb1_rowCount = wb1_sheet.getLastRowNum()- wb1_sheet.getFirstRowNum();
        int wb2_rowCount = wb2_sheet.getLastRowNum()- wb2_sheet.getFirstRowNum();

        if (wb1_rowCount == wb2_rowCount)
            System.out.println("2 Sheets have same rows");
        else
            System.out.println("2 sheets have different rows");

        for (int i = 0; i < wb1_sheet.getLastRowNum(); i++){
            Row row = wb1_sheet.getRow(i);

            for(int j = 0; j < row.getLastCellNum(); j++ ){
                row.getCell(j).setCellType(CellType.STRING);

            }

        }

        for (int i = 0; i < wb2_sheet.getLastRowNum(); i++){
            Row row = wb2_sheet.getRow(i);

            for(int j = 0; j < row.getLastCellNum(); j++ ){
                row.getCell(j).setCellType(CellType.STRING);

            }

        }


        String wb1_cell = null;
        String wb2_cell = null;

        for (int i = 1; i < wb1_sheet.getLastRowNum(); i++) {
            Row wb1_row = wb1_sheet.getRow(i);
            Row wb2_row = wb2_sheet.getRow(i);

            for (int j = 0; j < wb1_row.getLastCellNum(); j++) {
                wb1_cell = wb1_row.getCell(j).getStringCellValue();
                wb2_cell = wb2_row.getCell(j).getStringCellValue();
                System.out.println("   cell wb1 at " + i + 1 + "  " + wb1_cell + "\nand " + "cell wb2 at " + i + 1 + "  " + wb2_cell);

                if(wb1_cell.equals(wb2_cell)){
                    matchCheck = TRUE;
                }else{
                    matchCheck = FALSE;
                    System.out.println("cells don't match");
                    return matchCheck;
                }

            }


        }
        System.out.println("matchcheck value = " + matchCheck);
        return matchCheck;

    }



}
