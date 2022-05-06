package javaString;

public class PDFReadExample {
	  public static void main(String args[]){
	    try {
		//Create PdfReader instance.
		PdfReader pdfReader = new PdfReader("D:\\testFile.pdf");	
	 	
		int pages = pdfReader.getNumberOfPages(); 
	 
		
		for(int i=1; i<=pages; i++) { 
		 
		  String pageContent = 
		  	PdfTextExtractor.getTextFromPage(pdfReader, i);
	 
		 
		  System.out.println("Content on Page "
		  		              + i + ": " + pageContent);
	      }
	 
	      //Close the PdfReader.
	      pdfReader.close();
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	  }
	}
