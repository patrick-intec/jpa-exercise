package be.infernalwhale.exception;

public class AccountDaoException extends RuntimeException{
    public AccountDaoException(String message, Throwable cause) {
        super(message, cause);
    }
}
