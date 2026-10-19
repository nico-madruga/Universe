package br.com.project.universe.exception;

public class StarNotFoundException extends RuntimeException
{
    public StarNotFoundException(String message)
    {
        super(message);
    }
}
