
package havan;
public class Roupa extends Loja {
    
    private int tamanho;
    private String tipodepeca;
    
    public int getTamanho(){
         return tamanho;
         
     }
     
     public void setTamanho(int tam){
          tamanho=tam;  
     }
     
     public String getTipoDePeca(){
         return tipodepeca;
     }
     
     public void setTipoDePeca(String tipo){
            tipodepeca=tipo;
     }
}
