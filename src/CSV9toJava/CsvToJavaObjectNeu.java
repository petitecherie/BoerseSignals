package CSV9toJava;



/**
 * @author Nagesh Chauhan
 * 
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class CsvToJavaObjectNeu {

	public static void convertCsvToJava() {
		String csvFileToRead = "Resourses/XAUUSD1440.csv";
		BufferedReader br = null;
		String line = "";
		String splitBy = ",";
	//	List carList = new ArrayList();
		List chartList = new ArrayList();

		try {

			br = new BufferedReader(new FileReader(csvFileToRead));
			while ((line = br.readLine()) != null) {

				// split on comma(',')
			//	String[] cars = line.split(splitBy);
				String[] chart = line.split(splitBy);

				// create car object to store values
			//	Cars carObject = new Cars();
				Chart chartObject = new Chart();

				// add values from csv to car object
				chartObject.setDate(chart[0]);
				chartObject.setTime(chart[1]);
				chartObject.setPriceOpen(chart[2]);
				chartObject.setPriceHigh(chart[3]);
//				chartObject.setPriceLow(chart[4]);
//				chartObject.setPriceClose(chart[5]);
//				chartObject.setVolume(chart[6]);
//				carObject.setMake(cars[1]);
//				carObject.setModel(cars[2]);
//				carObject.setDescription(cars[3]);
//				carObject.setPrice(cars[4]);

				// adding car objects to a list
			//	carList.add(carObject);
				chartList.add(chartObject);
			}
			// print values stored in carList
		//	printCarList(carList);
			printChartListNeu(chartList);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

//	public void printCarList(List carListToPrint) {
//		for (int i = 0; i < carListToPrint.size(); i++) {
//			System.out.println("CARS [year= " + carListToPrint.get(i).getYear()
//					+ " , make=" + carListToPrint.get(i).getMake()
//					+ " , model=" + carListToPrint.get(i).getModel()
//					+ " , description="
//					+ carListToPrint.get(i).getDescription() + " , price="
//					+ carListToPrint.get(i).getPrice() + "]");
//		}
//	}
	
	public static void printChartListNeu(List<Chart> chartListToPrint) {
		for (int i = 0; i < chartListToPrint.size(); i++) {
			System.out.println("ChARtS [date= " +  chartListToPrint.get(i).getDate()
					+ " , time=" + chartListToPrint.get(i).getTime()
					+ " , PriceOpen=" +chartListToPrint.get(i).getPriceOpen()
					+ " , PriceHigh="+ chartListToPrint.get(i).getPriceHigh() + "]");
			
		}
	}
}
