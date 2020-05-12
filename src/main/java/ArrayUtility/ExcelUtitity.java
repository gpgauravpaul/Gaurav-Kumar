package ArrayUtility;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
public class ExcelUtitity {
   static ArrayList <String>array = new ArrayList <String>();
    public static ArrayList<String> data (String testcasename) throws IOException {
   FileInputStream file = new FileInputStream ("/Users/gaurav.pauloutlook.in/Desktop/DataSheet.xlsx");
   XSSFWorkbook workbook = new XSSFWorkbook(file);
   int SheetCount = workbook.getNumberOfSheets ();
   for(int i=0;i<SheetCount;i++) {
       Sheet sheet = workbook.getSheetAt (i);
       if (sheet.getSheetName ().equalsIgnoreCase ("Sheet1")) {
           Iterator it = sheet.rowIterator ();
           while (it.hasNext ()) {
               Row r = (Row) it.next ();
               if (r.getCell (0).getStringCellValue ().equalsIgnoreCase (testcasename)) {
                   Iterator cc = r.cellIterator ();
                   while (cc.hasNext ()) {
                       Cell cell = (Cell) cc.next ();
                       array.add (cell.getStringCellValue ());
                   } } } } }
        return array;
    }}