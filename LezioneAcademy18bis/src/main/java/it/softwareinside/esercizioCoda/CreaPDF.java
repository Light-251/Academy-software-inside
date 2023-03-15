package it.softwareinside.esercizioCoda;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class CreaPDF {

	public static void main(String[] args) throws IOException {
		PDDocument document = new PDDocument();//classe per gestire i PDF
		PDPage myPage = new PDPage();//classe per gestire le pagine del PDF
		
		//---------------------------------------------
		Coda coda = new Coda();
		Persona persona1 = new Persona();
		Persona persona2 = new Persona("Bianchi", 50);
		
		coda.aggiungiPersona(persona1);
		coda.aggiungiPersona(persona2);
		coda.aggiungiPersona(new Persona("Gialli", 25));
		//---------------------------------------------
		
		document.addPage(myPage);//Aggiunge una pagina al PDF
		document.save("D:/PROGETTI/Eclipse/Workspace/LezioneAcademy18bis/src/main/java/it/softwareinside/esercizioCoda/PDF/prova1.pdf");// salva un PDF nel percorso indicato
//		document.close();
		
		File file = new File("D:/PROGETTI/Eclipse/Workspace/LezioneAcademy18bis/src/main/java/it/softwareinside/esercizioCoda/PDF/prova1.pdf"); // carica un file esistente fornendo il percorso
		PDDocument documento = PDDocument.load(file);//carica il file nell'oggetto document
		PDPage page = documento.getPage(0);
		PDPageContentStream contentStream = new PDPageContentStream(documento, page);
		
		contentStream.beginText();//punto di inizio del testo
		contentStream.newLineAtOffset(25, 700);//Imposta la posizione dove inserire il testo
		contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);//Imposta il Font
		String text = coda.toString();
		contentStream.showText(text);// Inserisce il testo nel PDF
		System.out.println(text);
		contentStream.endText();//punto di fine del testo
		contentStream.close();//Chiude la classe ContentStream
		documento.save("D:/PROGETTI/Eclipse/Workspace/LezioneAcademy18bis/src/main/java/it/softwareinside/esercizioCoda/PDF/prova1.pdf");
		documento.close();// Chiude il documento
		

	}

}
