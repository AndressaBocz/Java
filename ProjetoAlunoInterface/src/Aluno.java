
public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public double nota4;
    public double media;
    
    public double CalcularMedia(){
        media=(nota1+nota2+nota3+nota4)/4;
        return media;
    }
    
    public boolean VericaSituacao(){
        if(this.media>=5){
            return true;
        }
        
        else{
            return false;    
        }
    }
}
