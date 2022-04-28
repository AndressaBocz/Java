
package menufuncionario_array;

import javax.swing.JOptionPane;

public class MenuFuncionario_Array {

    public static void main(String[] args) {
        Lista li = new Lista();
        String nome;
        int registro;
        double salario;
        int op=0;
     
        String texto="1- Cadastrar Funcionario"
                + "\n2- Listar Funcionario"
                + "\n3- Excluir Funcionarios"
                + "\n0- Sair";
                
        do{
            op = Integer.parseInt(
            JOptionPane.showInputDialog("mensagem"));
            
            switch(op){
                case 1:
                    nome = JOptionPane.showInputDialog("Digite o nome:");
                    registro = Integer.parseInt(JOptionPane.showInputDialog("Digite o registro"));
                    salario = Integer.parseInt(JOptionPane.showInputDialog("Digite o salario"));
                    li.Cadastrar(nome, registro, salario);
                break;
                
                case 2:
                    li.Lista();
                break;
                
                case 3:
                    
                break;
                
                case 0:

                break;
                default:
            }
        }while(op!=0);
    }
    
}
