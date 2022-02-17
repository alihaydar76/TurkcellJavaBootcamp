package exceptionhandling.workshop.turkcell.core.loggers.concretes;

import exceptionhandling.workshop.turkcell.core.loggers.abstracts.Logger;

public class EmailLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("Email Logger ile loglandi. "+ message+"\n");
    }
}
