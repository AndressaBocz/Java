package havan;

import javax.swing.JOptionPane;

public class Havan {

    private static String tipo;

    public static void main(String[] args) {
       Eletrodomestico eletro = new Eletrodomestico();
       eletro.descricao="fogão";
       eletro.preco=1500;
       eletro.setVoltagem(110);
       eletro.setPotencia(200);
       JOptionPane.showMessageDialog(null,
               "Descrição: "+eletro.descricao+
               "\nPreço: "+eletro.preco+
               "\nVoltagem: "+eletro.getVoltagem()+
               "\nPotencia: "+eletro.getPotencia());
       
       Roupa roupa = new Roupa();
       roupa.descricao="100% Algodão";
       roupa.preco= 50;
       roupa.setTamanho(36);
       roupa.setTipoDePeca(tipo);
       JOptionPane.showMessageDialog(null, 
               "Descrição: "+roupa.descricao+
               "\nPreço: "+roupa.preco+
               "\nTamanho: "+roupa.getTamanho()+
               "\nTipo de Peça: "+roupa.getTipoDePeca());
       
       
        
    }
    
}
