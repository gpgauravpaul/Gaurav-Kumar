package ArrayLogic;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Data2 {

        public ArrayList data2 (String testdata) throws IOException {
            ArrayList <String>list2 = new ArrayList<>();
            FileInputStream fis = new FileInputStream ("/Users/gaurav.pauloutlook.in/Desktop/read.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            int count = workbook.getNumberOfSheets ();
            for (int i=0;i<count;i++)
            {
                Sheet sheet = workbook.getSheetAt (i);
                if(sheet.getSheetName ().equalsIgnoreCase ("Sheet2"))
                {
                    Iterator<Row> it = sheet.iterator ();
                    while (it.hasNext ())
                    {
                        Row row = it.next ();
                        if(row.getCell (0).getStringCellValue ().equalsIgnoreCase (testdata))
                        {
                            Iterator<Cell> cell = row.iterator ();
                            while (cell.hasNext ())
                            {
                                list2.add (cell.next ().getStringCellValue ());
                            }
                        }
                    }

                }

            }


            return list2;

        }
    }

