
package faculdade;

import javax.swing.JOptionPane;  
import java.lang.Math; 

public class Faculdade {    
    static int i, j, aux, menu, option; 
    static int vet[] = new int[10]; 

    public static void main(String[] args) { 

        Inserir(); 

        do { 
            menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n\n" 
                    + "1 - Ordem Crescente\n"
                    + "2 - Ordem Decrescente\n"
                    + "3 - Inserir Valores\n"
                    + "4 - Simular Valor Novo\n"
                    + "0 - Sair"));   

            switch (menu) { 

                case (1): 
                    Crescente();    
                    break;

                case (2):    
                    Decrescente();  
                    break;

                case (3): 
                    Insere();      
                    break;

                case (4): 
                    Simular();            
                    break;

                case (0): 
                    System.exit(0);     
                    break;
            }


        } while (menu != 9); 
        
    }

    private static void Inserir() { 
        while (option != 1 && option != 2) { 
            option = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n\n"
                    + "1 - Inserir novo valor\n"
                    + "2 - Simular novo valor"));
            switch (option) {
                case (1):
                    Insere(); 
                    break;

                case (2):
                    Simular();  
                    break;

            } 
        }
    }


    private static void Insere() { 
        for (i = 0; i < (vet.length); i++) { 
            aux = i + 1;
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("insira o " + aux + "º valor:"));
        }
        JOptionPane.showMessageDialog(null, "Os valores são: ["
                + vet[0] + "," + vet[1] + "," + vet[2] + "," + vet[3] + "," + vet[4] + "," + vet[5] + "," + vet[6] + "," + vet[7] + "," + vet[8] + "," + vet[9] + "]");

    }

    private static void Simular() {
        long aux2 = 0;
        for (i = 0; i < (vet.length); i++) {
            aux2 = Math.round(Math.random() * 100); 
            vet[i] = (int) aux2;
        }
        JOptionPane.showMessageDialog(null, "Os valores são: ["
                + aux2 + "" + vet[0] + "," + vet[1] + "," + vet[2] + "," + vet[3] + "," + vet[4] + "," + vet[5] + "," + vet[6] + "," + vet[7] + "," + vet[8] + "," + vet[9] + "]");
    }

    public static void Crescente() {
        for (i = 0; i < (vet.length)-1; i++) {
            for (j = i + 1; j < (vet.length); j++) { 
                if (vet[i] > vet[j]) {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Em ordem crescente: ["
                + vet[0] + "," + vet[1] + "," + vet[2] + "," + vet[3] + "," + vet[4] + "," + vet[5] + "," + vet[6] + "," + vet[7] + "," + vet[8] + "," + vet[9] + "]");

    }

    public static void Decrescente() {
        for (i = 0; i < (vet.length)-1; i++) {
            for (j = i + 1; j < (vet.length); j++) {
                if (vet[i] < vet[j]) {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Em ordem decrescente: ["
                + vet[0] + "," + vet[1] + "," + vet[2] + "," + vet[3] + "," + vet[4] + "," + vet[5] + "," + vet[6] + "," + vet[7] + "," + vet[8] + "," + vet[9] + "]");

    }
}
