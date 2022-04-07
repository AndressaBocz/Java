
import javax.swing.JOptionPane;


public class ContaCorrente {
    
    public double saldo;
    
    public void Depositar(double valor){
        this.saldo+=valor;
        JOptionPane.showMessageDialog(null,"Depósito realizado com sucesso !!!");
    }
    
    public void Sacar(double valor){
        if (this.saldo>=valor){
           this.saldo-=valor;
           JOptionPane.showMessageDialog(null,"Sacar realizado com sucesso !!!");
        }
        else{
           JOptionPane.showMessageDialog(null,"Saldo Insuficiente !!!"); 
        }
    }
    
    public double ConsultaSaldo(){
        return this.saldo;
    }
    
}
