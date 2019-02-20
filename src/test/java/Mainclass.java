
import seleniumutils.ReadGuru99ExcelFile;

import java.io.IOException;

public  class Mainclass {



    public static void main(String[] args) throws Exception {
        //SeleniumFunction.openBrowser("firefox");
        //SeleniumFunction.openBrowser("chrome");
        //SeleniumFunction.goToHomePage();

/*

        //Create an object of ReadGuru99ExcelFile class

        ExcelUtil objExcelFile = new ExcelUtil();

        //Prepare the path of excel file

        //String filePath = System.getProperty("D:\\TestExcelUtil");
        String filePath = "D:\\TestExcelUtil\\datatest.xlsx";

        //Call read file method of the class to read data
        objExcelFile.readExcel(filePath,"Sheet1");
*/
        ReadGuru99ExcelFile objExcelFile = new ReadGuru99ExcelFile();
        String filePath = "D:\\TestExcelUtil";
        objExcelFile.readExcel(filePath,"datatest.xlsx","Sheet1");



    }

}
