package model.exceptions;

import java.io.Serial;

public class NomeIncompativelComClasseException extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    public NomeIncompativelComClasseException(String msg) {

        super(msg);
    }
}
