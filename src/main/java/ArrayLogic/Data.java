package ArrayLogic;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Data {

    public ArrayList data (String testdata) throws IOException {
ArrayList list = new ArrayList();
        FileInputStream fis = new FileInputStream ("/Users/gaurav.pauloutlook.in/Desktop/read.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        int count = workbook.getNumberOfSheets ();
        for (int i=0;i<count;i++)
        {
Sheet sheet = workbook.getSheetAt (i);
if(sheet.getSheetName ().equalsIgnoreCase ("Sheet1"))
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
    Cell cell1 = cell.next ();

    if(cell1.getCellTypeEnum ()== CellType.NUMERIC)
    {
        String str = String.valueOf (cell1);
        list.add (str);
    }
    else
    {
        list.add (cell1.getStringCellValue ());
    }
}
 }
    }

}

        }

return list;
    }
}
