
import javax.swing.JOptionPane;


public class Cliente {
    
    public String nome_cliente;
    public String nome_banco;
    public int num_agencia;
    
    public void Cadastrar(String nc,String nb,int na){
        this.nome_cliente=nc;
        this.nome_banco=nb;
        this.num_agencia=na;
        JOptionPane.showMessageDialog(null,"Dados Cadastrados com sucesso !!!");
    }
    
    public String Exibir(){
        String dados=this.nome_cliente+";"+this.nome_banco+";"+this.num_agencia;
        return dados;
    }
    
    
    
}
