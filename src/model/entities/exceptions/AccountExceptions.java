package model.entities.exceptions;

import model.entities.Account;

import java.io.Serial;

public class AccountExceptions  extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public AccountExceptions(String msg){
        super(msg);
    }
}
