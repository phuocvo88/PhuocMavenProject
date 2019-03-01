
import org.apache.poi.ss.usermodel.Workbook;
import seleniumutils.ExcelUtils;
import seleniumutils.ReadGuru99ExcelFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

    /*//code chay duoc roi, nhung dung list de add tung cell vao roi sosanh nen hieu suat se ko tot
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        ReadGuru99ExcelFile objExcelFile = new ReadGuru99ExcelFile();
        String filePath = "D:\\TestExcelUtil";

        list1 = objExcelFile.readExcel(filePath,"datatest_Shorter1.xlsx","Sheet1");
        list2 = objExcelFile.readExcel(filePath,"datatest_Shorter2.xlsx","Sheet1");

        System.out.println("list 1: " + list1);
        System.out.println("list 2: " + list2);
    */

    /*//code chay duoc roi, dung method compareWorkbookData, 4 arguments
        String filePath = "D:\\TestExcelUtil";
        Workbook wb1 = ExcelUtils.createWorkbook(filePath,"datatest_Shorter1.xlsx");
        Workbook wb2 = ExcelUtils.createWorkbook(filePath,"datatest_Shorter2.xlsx");

        ExcelUtils.compareWorkbookData(wb1,wb2,"Sheet1","Sheet1");
    */

        String fileTargetLink1 = "D:\\TestExcelUtil\\datatest_Shorter1.xlsx";
        String fileTargetLink2 = "D:\\TestExcelUtil\\datatest_Shorter2.xlsx";
        ExcelUtils.compareExcel(fileTargetLink1,fileTargetLink2);




    }

}
