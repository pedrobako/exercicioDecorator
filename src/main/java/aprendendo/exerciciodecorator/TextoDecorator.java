package aprendendo.exerciciodecorator;

public abstract class TextoDecorator extends Texto {
    
    protected Texto texto;
    
    public TextoDecorator(Texto texto){
        this.texto = texto;
    }
    
    
}
