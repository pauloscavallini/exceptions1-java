package model.exceptions;

/*
*
* note que diferente da superclasse Exception, o compilador
* nao obriga a tratar RuntimeException
*
* */

public class DomainException extends RuntimeException {
    public static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}
