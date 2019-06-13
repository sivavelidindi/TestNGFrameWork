package frameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelUtils extends WaitUtils{
public static Object readExcelCellData(String filePath,String sheetName,int rowNumber,int cellNumber) {
	Object celldata=null;
	try {
		FileInputStream fis=new FileInputStream(filePath);
		
		
	} catch (FileNotFoundException e) {
		System.out.println("Unable to find excel file");
	}
	return celldata;
}
}
