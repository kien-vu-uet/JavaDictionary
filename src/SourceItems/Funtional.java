package SourceItems;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//lưu dạng UTF-8
public class Funtional {
	
	public static final int COLUMN_INDEX_ID = 0;
    public static final int COLUMN_INDEX_WORD = 1;
    public static final int COLUMN_INDEX_MEANING = 2;
    public static final int COLUMN_INDEX_TYPE = 3;
    
    // Copy Data from .xlsx file to Dictionary's Instance.
	public static void copyXLXStoDICTIONARY(Dictionary dict, Sheet sheet) {
		if (dict == null || sheet == null) {
			System.out.println("Error Undefined");
			return;
		}
		Iterator<Row> iterator = sheet.iterator();
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            if (nextRow.getRowNum() == 0) {
                // Ignore header
                continue;
            }
            // Get all cells
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            // Read cells and set value for word object
            Word word = new Word();
            while (cellIterator.hasNext()) {
                //Read cell
                Cell cell = cellIterator.next();
                Object cellValue = getCellValue(cell);
                if (cellValue == null || cellValue.toString().isEmpty()) {
                    break;
                }
                // Set value for word object
                int columnIndex = cell.getColumnIndex();
                switch (columnIndex) {
                case COLUMN_INDEX_ID:
                    break;
                case COLUMN_INDEX_WORD:
                    word.setWord((String) getCellValue(cell));
                    break;
                case COLUMN_INDEX_MEANING:
                    word.setMeaning((String) getCellValue(cell));
                    break;
                case COLUMN_INDEX_TYPE:
                    word.setType((String) getCellValue(cell));
                    break;
                default:
                    break;
                }
 
            }
            dict.dict.add(word);
        }
		dict.setScale(dict.dict.size());		
		
	}
	
	// Get cell value
    private static Object getCellValue(Cell cell) {
        CellType cellType = cell.getCellType();
        Object cellValue = null;
        switch (cellType) {
        case BOOLEAN:
            cellValue = cell.getBooleanCellValue();
            break;
        case FORMULA:
            Workbook workbook = cell.getSheet().getWorkbook();
            FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
            cellValue = evaluator.evaluate(cell).getNumberValue();
            break;
        case NUMERIC:
            cellValue = cell.getNumericCellValue();
            break;
        case STRING:
            cellValue = cell.getStringCellValue();
            break;
        case _NONE:
        case BLANK:
        case ERROR:
            break;
        default:
            break;
        }
 
        return cellValue;
    }
	
	
}
