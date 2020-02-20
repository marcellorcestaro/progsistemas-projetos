/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrcestaro
 */

import javax.swing.JOptionPane;

public class Ex01 {
    public static void main(String[] args) {
            double valor, valorEst = -1.0; 
            int escolha = -1; 

            valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor em reais: "));
            do {
                escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de moeda, sendo:\n1) Dólar americano\n2) Euro\n3) Libra Esterlina"));
                switch (escolha) {
                    case 1:
                        valorEst = valor * 3.48;
                        break;
                    case 2: 
                        valorEst = valor * 4.34;
                        break;
                    case 3: 
                        valorEst = valor * 5.09;
                        break;
                    default: 
                        JOptionPane.showMessageDialog(null, "Valor inválido. Favor, tente novamente");
                }
            } while(escolha != 1 && escolha != 2 && escolha != 3);

            JOptionPane.showMessageDialog(null, "O valor na moeda dita é " + valorEst);
            
    }
}
