package boletin7_2;

import javax.swing.JOptionPane;

public class Boletin7_2 {

    public static void main(String[] args) {
       Mayor obj = new Mayor();
       
       short num = Short.parseShort(JOptionPane.showInputDialog("Ingrese n1 "));
       short num2 = Short.parseShort(JOptionPane.showInputDialog("Ingrese n2 "));
       
       obj.esMayor(num, num2);
    }
    
}
