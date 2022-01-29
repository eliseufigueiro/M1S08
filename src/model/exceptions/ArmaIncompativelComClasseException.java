package model.exceptions;

import java.io.Serial;

public class ArmaIncompativelComClasseException extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    public ArmaIncompativelComClasseException(String msg) {

        super(msg);
    }
}
