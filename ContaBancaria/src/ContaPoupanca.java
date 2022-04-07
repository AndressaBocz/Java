
import javax.swing.JOptionPane;


public class ContaPoupanca {
    
    public double saldocp;
    
    public void DepositarCP(double valor){
        this.saldocp+=valor;
        JOptionPane.showMessageDialog(null,"Deposito realizado com sucesso !!!");
    }
    
    public void SacarCP(double valor){
        if (saldocp>=valor){
           this.saldocp-=valor;
           JOptionPane.showMessageDialog(null,"Saque realizado com sucesso !!!");
        }
        else{
            JOptionPane.showMessageDialog(null,"Saldo Insuficiente !!!");
        }
    }
    
    public double SaldoCP(){
        return this.saldocp;
    }
    
}
