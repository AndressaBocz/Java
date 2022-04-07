package havan;

public class Eletrodomestico extends Loja {
 
     private int voltagem;
     private int potencia; 
    
     public int getVoltagem(){
         return voltagem;
         
     }
     
     public void setVoltagem(int volt){
          voltagem=volt;  
     }
    
     public int getPotencia(){
          return potencia;
     }
    
     public void setPotencia(int pot){
          potencia=pot;
     }
}

