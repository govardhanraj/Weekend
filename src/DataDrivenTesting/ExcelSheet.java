package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("C:\\DataDriven\\Govardhan.xlsx");
		
		Workbook work = WorkbookFactory.create(fis); //select file
		String testdata = work.getSheet("Sheet1").getRow(0).getCell(3).toString();
		System.out.println(testdata);
		
		
	}

}
