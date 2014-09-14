
import java.io.IOException;
import java.io.StringWriter;

import javax.swing.text.BadLocationException;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;


public class PaintHouseSVG {

	public static void main(String[] args) throws IOException, BadLocationException {
		// TODO Auto-generated method stub
		StringWriter writer = new StringWriter();
		HTMLEditorKit htmlKit = new HTMLEditorKit();
	    HTMLDocument htmlDoc = (HTMLDocument) htmlKit.createDefaultDocument(); 
	    htmlKit.write(writer, htmlDoc, 0, htmlDoc.getLength());
	    
	    /// to be continued ....  
	}

}
