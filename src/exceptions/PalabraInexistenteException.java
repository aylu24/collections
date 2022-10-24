package exceptions;

public class PalabraInexistenteException extends Exception{

    // exeption uncheked extiende de RuntimeException y la cheked de exception

    private String descripcion;

    public PalabraInexistenteException (String descripcion){
        super(descripcion);

    }
}
