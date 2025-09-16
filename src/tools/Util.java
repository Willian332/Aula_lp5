/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author u12345677929
 */
public class Util {
    public static void habilitar(boolean valor, JComponent ... componentes) {
        for (int i = 0; i < componentes.length; i++) {
             componentes[i].setEnabled(valor);
            
        }
    }
    public static void limpar(JComponent ... components){
        for (int i = 0; i < components.length; i++) {
            //instanceof função limpar
            if(components[i] instanceof JTextField){
                 ((JTextField)components[i]).setText("");
            }
            if(components[i] instanceof JComboBox){
                 ((JComboBox)components[i]).setSelectedIndex(-1);
            }
            
        }
    }
    public static void mensagem(String cad){
        JOptionPane.showMessageDialog(null, cad);
    }
    public static void perguntar(String cad){
        JOptionPane.showConfirmDialog(null, cad);
        //return true;
     
    }
    public static int strToInt(String num) {
        return Integer.valueOf(num);
    }
    
    public static String intoStr(int num) {
        return String.valueOf(num);
    }
    public static String strToDouble(int num) {
        return null;
    }
    public static String doubleToStr(double num) {
        return "";
    }
    public static Date strToDaTEe(String data) {
        return null;
        
    }
    public static String dateToStr(Date dara) {
        return "";
        
    }
    
    //primeiro commit - pacotes tools e view. Util.java Finalizado
    //segundo commit - tela principal e telas dos cadastros finalizados
    // terceiro commit  - telas de cadastros usando o util.ja 
}
