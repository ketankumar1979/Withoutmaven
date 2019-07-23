package Datafromexcel;

import org.apache.poi.ss.examples.html.XSSFHtmlHelper;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ReadingDataFromExcel {

   static XSSFWorkbook ExcellWbook;
   static XSSFSheet ExcellWSheet;
   static XSSFCell Cell;
    public static void main(String[]args) {
        //getrowcount();
        String path = "C:/Users/ketan/Desktop/Book1.xlsx";
        String sheetname = "Sheet1";
        try{
            FileInputStream Excelfile = new FileInputStream(path);
            ExcellWbook = new XSSFWorkbook(Excelfile);
            ExcellWSheet = ExcellWbook.getSheet(sheetname);
            Cell = ExcellWSheet.getRow(0).getCell(0);
            String cellData = Cell.getStringCellValue();
            System.out.println(cellData);
        } catch (Exception e){
            e.printStackTrace();
        }
        //}
        // public static void getrowcount()throws Exception{

        // try {



        //XSSFSheet Sheet = workbook.getSheet("Sheet1");
        //int rowcount = Sheet.getPhysicalNumberOfRows();
        //System.out.println(rowcount);

        // }catch (Exception exp){
        //  System.out.println(exp.getMessage());
        //  System.out.println(exp.getCause());
        // exp.printStackTrace();

        // }

    }


    }

