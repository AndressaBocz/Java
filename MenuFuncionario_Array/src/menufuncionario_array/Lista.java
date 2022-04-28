
package menufuncionario_array;

import java.util.ArrayList;


public class Lista extends Funcionario {
     public static void main(String[] args) {
        ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();
       
        public void Cadastrar(String nm, int reg,double sl){
            funcionario.add(new Funcionario(nm, reg, sl));
        }
          public void Lista(){
              for(Funcionario f:funcionario){
                System.out.println(f.getNome()+
                        " "+f.getRegistro()+
                        " "+f.getSalario());
          }  
     
    }
  
}

    

