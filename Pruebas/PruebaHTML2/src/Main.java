import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

/**
 * A complete Java class that demonstrates how to create an HTML viewer with styles,
 * using the JEditorPane, HTMLEditorKit, StyleSheet, and JFrame.
 * 
 * @author alvin alexander, devdaily.com.
 *
 */
public class Main
{
  public static void main(String[] args)
  {
    new Main();
  }
  
  public Main()
  {
    SwingUtilities.invokeLater(new Runnable()
    {
      public void run()
      {
        // create jeditorpane
        JEditorPane jEditorPane = new JEditorPane();
        
        // make it read-only
        jEditorPane.setEditable(false);
        
        // create a scrollpane; modify its attributes as desired
        JScrollPane scrollPane = new JScrollPane(jEditorPane);
        
        // add an html editor kit
        HTMLEditorKit kit = new HTMLEditorKit();
        jEditorPane.setEditorKit(kit);
        
        // add some styles to the html
        StyleSheet styleSheet = kit.getStyleSheet();
        styleSheet.addRule("#principal{ height: 720px; width: 540px; background-color: green; position: relative; }");
        styleSheet.addRule("#nav{ background-color: black; position: absolute; bottom: 0; left: 0; min-width: 100%; }");
        styleSheet.addRule("#nav ul{ list-style-type: none; }");
        styleSheet.addRule("#nav li{ float: left; width: 25%; padding: 10px; background-color: red; text-align: center; color: white; border: 2px solid gold; }");
        styleSheet.addRule("#nav li:hover{ background-color: black; }");
        styleSheet.addRule("#nav a{ text-decoration: none; color: white; }");
        styleSheet.addRule("#nav a:visited{ text-decoration: none; color: white; }");

        // create some simple html as a string
        String htmlString = "<html><main id=\"principal\"><div id=\"nav\"><ul><li><a href=\"#\">Ajustes</a></li> <li><a href=\"#\">Inicio</a></li> <li><a href=\"#\">Salir</a></li> </ul> </div> </main></html>";
        
        // create a document, set it on the jeditorpane, then add the html
        Document doc = kit.createDefaultDocument();
        jEditorPane.setDocument(doc);
        jEditorPane.setText(htmlString);

        // now add it all to a frame
        JFrame j = new JFrame("HtmlEditorKit Test");
        j.getContentPane().add(scrollPane, BorderLayout.CENTER);

        // make it easy to close the application
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // display the frame
        j.setSize(new Dimension(64000000,64000000));
        
        // pack it, if you prefer
        //j.pack();
        
        // center the jframe, then make it visible
        j.setLocationRelativeTo(null);
        j.setVisible(true);
        j.setResizable(false);
      }
    });
  }
}