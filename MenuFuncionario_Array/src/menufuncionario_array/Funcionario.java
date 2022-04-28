
package menufuncionario_array;

public class Funcionario {
    private double salario;
    private int registro;
    private String nome;

    public Funcionario(String nm,int reg,double sl){
        nome=nm;
        registro=reg;
        salario=sl;
        
    }
    public double getSalario() {
        return salario;
    }

   
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getRegistro() {
        return registro;
    }

    
    public void setRegistro(int registro) {
        this.registro = registro;
    }

   
    public String getNome() {
        return nome;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }
    
  
   
    
}
