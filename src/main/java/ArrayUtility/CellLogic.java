package ArrayUtility;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class CellLogic {

    public static void main (String[] args) throws IOException {

        File file1 = new File("DataSheet.xlsx");
            FileInputStream file = new FileInputStream (file1.getAbsolutePath ());
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            int SheetCount = workbook.getNumberOfSheets ();
            for(int i = 0; i<SheetCount; i++) {
                Sheet sh = workbook.getSheetAt (i);
                if (sh.getSheetName ().equalsIgnoreCase ("Sheet1")) {
                    Iterator ii = sh.rowIterator ();
                    while (ii.hasNext ()) {
                        Row row = (Row) ii.next ();
                        Iterator it = row.cellIterator ();
                        while (it.hasNext ()) {
                            Cell cl = (Cell) it.next ();
                            if (cl.getStringCellValue ().equalsIgnoreCase ("RJ")) {

                                } }
                    } }
                XSSFCell str = workbook.getSheetAt (0).getRow (1).getCell (1);
                XSSFCell str1 = workbook.getSheetAt (0).getRow (3).getCell (1);
                XSSFCell str2 = workbook.getSheetAt (0).getRow (2).getCell (0);
                XSSFCell str3 = workbook.getSheetAt (0).getRow (2).getCell (2);
                ArrayList list = new ArrayList();
                list.add (str.getStringCellValue ());
                list.add (str1.getStringCellValue ());
                list.add (str2.getStringCellValue ());
                list.add (str3.getStringCellValue ());

   Iterator io = list.iterator();
                String sr = "RJ";
                while(io.hasNext ())
                {
                    String stt = (String) io.next ();
                 if (stt.equalsIgnoreCase (sr))
                   {

                   }
                }


            } }}