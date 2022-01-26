package exporter;

import java.io.File;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * @author z1323a02
 * Klasse zum Konvertieren von Bild Formaten zu PDF Datei
 */
public class ImageToPDFConverter {
	
	
	public void ConvertImageToPDF(File imageFile) {
		writePDF(imageFile);
	}
	
	/**
	 * @param imgFile Die zu konvertierende Datei
	 * 
	 * konvertiert die übergebene Datei in eine PDF datei indem sie die Datei öffnet und dann ein Bild mit dem inhalt der übergebnen datei in die PDF Datei schreibt
	 */
	private void writePDF(File imgFile){
		try {
			
			
			Document docPDF = new Document();
			
			String currPath = System.getProperty("user.dir");
			
			FileOutputStream fOS = new FileOutputStream(currPath+"/GraphDateien/GraphenPDF.pdf");
			
			PdfWriter writer = PdfWriter.getInstance(docPDF, fOS);
			
			String fileURL = (currPath+"/GraphDateien/"+imgFile.getName());
			
			writer.open();
			docPDF.open();
			docPDF.add(Image.getInstance(fileURL));
			docPDF.close();
			writer.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
