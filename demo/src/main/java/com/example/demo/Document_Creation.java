package com.example.demo;

import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;

public class Document_Creation {
	
	public static void main (String args[]) throws IOException {
		//Creating PDF document object
		PDDocument document = new PDDocument();
		
		//Saving the document
		document.save("./PdfBox_Examples/my_doc.pdf");
		
		System.out.println("PDF created");
		
		// closing the document
		document.close();
	}

}
