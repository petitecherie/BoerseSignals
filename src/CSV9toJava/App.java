package CSV9toJava;

/**
 * @author Nagesh Chauhan
 * 
 */
public class App {
	public static void main(String[] args) {

		// reading data from a csv file
		System.out.println("Reading data from csv :");
		ReadCsv readCsv = new ReadCsv();
		readCsv.readCsv();
		ReadCsvNeu readCsvChart = new ReadCsvNeu();
		 readCsvChart.readCsvNeu();


		// reading data from a csv file and convert to java object
		System.out.println("Reading data from csv and convert to java object:");
		CsvToJavaObject csvToJavaObject = new CsvToJavaObject();
		csvToJavaObject.convertCsvToJava();
		CsvToJavaObjectNeu csvToJavaObjectNeu = new CsvToJavaObjectNeu();
		CsvToJavaObjectNeu.convertCsvToJava();
	}
}
