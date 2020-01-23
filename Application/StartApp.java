
package Application;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Albertino Augusto */

public class StartApp 
{
    public static void main(String[] args)
    {     
        JTextArea textArea = new JTextArea();
        LightScrollPane scrollPane = new LightScrollPane(textArea);
        JFrame frame = new JFrame(); 
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER ); 
        frame.setSize(500, 300); 
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true); 
    }

}
