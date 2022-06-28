import org.apache.log4j.Logger;

public class TestExcel {

	
// Rows starts from 1 2 3
// Column starts from 0 1 2
	public static void main(String[] args) {
		//Logger log= Logger.getLogger("devpinoylogger");//
		Logger log= Logger.getLogger("devpinoylogger");
		
		ExcelReader excel=new ExcelReader("C:\\Workspace\\File_Writing\\ReadWriteExcel.xlsx");
		
		String sheetName="Trainer";
		
		//Rows start from 2(actual data) and cell starts from 0
		
		log.debug("Getting RowCount");
		System.out.println(excel.getRowCount(sheetName));
		
		log.debug("Getting Colun Count");
		System.out.println(excel.getColumnCount(sheetName));
		
		log.debug("Getting data");
		System.out.println(excel.getCellData(sheetName,"username", 2));
		
		log.debug("Getting data");
		System.out.println(excel.getCellData(sheetName, 2, 2));
		
		log.debug("Getting data");
		System.out.println(excel.getCellData(sheetName, 1, 3));
		
		log.debug("Setting data");
		System.out.println(excel.setCellData(sheetName, "username", 4, "hehe"));
		
		
		

	}

}
