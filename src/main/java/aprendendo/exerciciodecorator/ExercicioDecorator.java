/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprendendo.exerciciodecorator;
import java.awt.Color;
import javax.swing.*;
import javax.swing.text.*;

/**
 *
 * @author Suporte
 */
public class ExercicioDecorator {

    public static void main(String[] args) {
        ExibeTexto janela = new ExibeTexto();
        JTextPane jTextPane = janela.getjTextPane();
        StyledDocument doc = jTextPane.getStyledDocument();
        
        
        Style style = jTextPane.addStyle("paragraphStyle", null);
        StyleConstants.setBold(style, true);
        StyleConstants.setFontSize(style, 16);
        StyleConstants.setForeground(style, Color.RED);
        
        Style characterStyle = jTextPane.addStyle("characterStyle", null);
        StyleConstants.setItalic(characterStyle, true);
        StyleConstants.setFontSize(characterStyle, 14);
        StyleConstants.setForeground(characterStyle, Color.BLUE);
        
        try {
            // Inserindo texto formatado
            doc.insertString(doc.getLength(), "Texto em negrito\n", style);
            doc.insertString(doc.getLength(), "Texto em itálico", characterStyle);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
        
        janela.setVisible(true);
    }
}
