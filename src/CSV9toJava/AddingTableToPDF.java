package CSV9toJava;

import com.itextpdf.kernel.pdf.PdfDocument; 
import com.itextpdf.kernel.pdf.PdfWriter; 

import com.itextpdf.layout.Document; 
import com.itextpdf.layout.element.Cell; 
import com.itextpdf.layout.element.Table;  

public class AddingTableToPDF { 
   public static void main(String args[]) throws Exception { 
      String file = "C:/EXAMPLES/itextExamples/addingTableToPDF.pdf"; 

      //Creating a PdfDocument object 
      PdfDocument pdfDoc = new PdfDocument(new PdfWriter(file));     

      //Creating a Document object 
      Document doc = new Document(pdfDoc);        

      //Creating a table 
      Table table = new Table(2);     

      //Adding cells to the table 
      table.addCell(new Cell().add("Name")); 
      table.addCell(new Cell().add("Raju")); 
      table.addCell(new Cell().add("Id")); 
      table.addCell(new Cell().add("1001")); 
      table.addCell(new Cell().add("Designation")); 
      table.addCell(new Cell().add("Programmer")); 

      //Adding Table to document  
      doc.add(table);

      //Closing the document 
      doc.close();  
      System.out.println("Table created successfully.."); 
   }     
}
