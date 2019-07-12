package CSV9toJava;
import java.io.File;
import java.io.FileOutputStream;

public class CreateBlankExcel {
   public static void main(String[] args)throws Exception {

      //Create Blank workbook
      XSSFWorkbook workbook = new XSSFWorkbook();

      //Create file system using specific name
      FileOutputStream out = new FileOutputStream(
         new File("C:/1/createBlankWorkBook.xlsx"));

      //write operation workbook using file out object
      workbook.write(out);
      out.close();
      System.out.println("createworkbook.xlsx written successfully");
   }
}
