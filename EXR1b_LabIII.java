/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exr1b_labiii;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel_Nascimento
 */
public class EXR1b_LabIII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String y1, x1, x2, y2;
        JOptionPane.showMessageDialog(null, "Ponto 1");
        x1 = JOptionPane.showInputDialog("Digite o valor X:");
        y1 = JOptionPane.showInputDialog("Digite o valor Y:");
        
        JOptionPane.showMessageDialog(null, "Ponto 2");
        x2 = JOptionPane.showInputDialog("Digite o valor X:");
        y2 = JOptionPane.showInputDialog("Digite o valor Y:");
        
        
        Double xx1 = Double.parseDouble(x1);
        Double yy1 = Double.parseDouble(y1);
        
        Double xx2 = Double.parseDouble(x2);
        Double yy2 = Double.parseDouble(y2);
        
        Double resultado = Math.sqrt(Math.pow((xx2-xx1), 2) + Math.pow((yy2-yy1), 2));
        
        JOptionPane.showMessageDialog(null, "A distância entre os dois pontos é: " + resultado + " unidades de comprimento.", "Resultado", JOptionPane.PLAIN_MESSAGE);
    }
    
}
