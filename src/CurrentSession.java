import SourceItems.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//lưu dạng UTF-8
public class CurrentSession {
    
	public static void main(String []args)  throws IOException, InterruptedException {
		// Create a Streaming of .xlsx file .
		File directory = new File("");
		final String fileExcel = directory.getAbsolutePath() + "\\material\\Dictionary.xlsx";
		XSSFWorkbook wb = new XSSFWorkbook(fileExcel);
		Sheet sheet = wb.getSheetAt(0);
		Dictionary D = new Dictionary();
		Funtional.copyXLXStoDICTIONARY(D,sheet);
		Scanner scan = new Scanner(System.in);
		wb.close();
		// testing 1st method : Search the Meaning of Word.
		System.out.println("Enter The Word which needed to find Meaning :");
		while (scan.hasNextLine()) {
			String w = scan.nextLine();
			if (w.equals("EOF")) {
				break;
			}
			D.searchWord(w);
			System.out.println("Enter The Word which needed to find Meaning :");
		}
		
		System.out.println("You have Ended Current Session");
		scan.close();
	}
}
