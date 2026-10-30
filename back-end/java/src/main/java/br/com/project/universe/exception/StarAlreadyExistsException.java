package br.com.project.universe.exception;

public class StarAlreadyExistsException extends RuntimeException
{
    public StarAlreadyExistsException(String message)
    {
        super(message);
    }
}
