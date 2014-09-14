import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class DeckOfCards {

	public static void main(String[] args) throws DocumentException, IOException {
		
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream("DeckOfCards.pdf"));
		document.open(); 
		
		//table params
        PdfPTable table = new PdfPTable(13);
        table.setWidthPercentage(100);
        table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
        table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
        table.getDefaultCell().setFixedHeight(50);
        
        //font/color set
        BaseFont bf = BaseFont.createFont("times.ttf", BaseFont.IDENTITY_H, true); 
        Font black = new Font(bf, 15f, 0, BaseColor.BLACK);
        Font red = new Font(bf, 15f, 0, BaseColor.RED);
        
		int suits = 9830; //unicode table
		Font color;
		
		for (int i = 0; i < 4; i++) {
			suits -= i; //down in the unicode table
			
			if(i > 1){color = black;}
			else {color	= red;}
			
			for (int j = 0; j < 52; j++)
            {
				switch (j)
	            {
	                case 1: table.addCell(new Paragraph("2" + (char)suits, color)); break;
	                case 2: table.addCell(new Paragraph("3" + (char)suits, color)); break;
	                case 3: table.addCell(new Paragraph("4" + (char)suits, color)); break;
	                case 4: table.addCell(new Paragraph("5" + (char)suits, color)); break;
	                case 5: table.addCell(new Paragraph("6" + (char)suits, color)); break;
	                case 6: table.addCell(new Paragraph("7" + (char)suits, color)); break;
	                case 7: table.addCell(new Paragraph("8" + (char)suits, color)); break;
	                case 8: table.addCell(new Paragraph("9" + (char)suits, color)); break;
	                case 9: table.addCell(new Paragraph("10" + (char)suits, color)); break;
	                case 10: table.addCell(new Paragraph("J" + (char)suits, color)); break;
	                case 11: table.addCell(new Paragraph("D" + (char)suits, color)); break;
	                case 12: table.addCell(new Paragraph("K" + (char)suits, color)); break;
	                case 13: table.addCell(new Paragraph("A" + (char)suits, color)); break;
	                default: break;
	            }// end of switch			
            }// end of inner for
		}//end of for
		
		document.add(table);
		document.close();
		
	}// end of main
}// end of class
