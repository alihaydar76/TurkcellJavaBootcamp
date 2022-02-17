package exceptionhandling.workshop.turkcell.core.loggers.concretes;

import exceptionhandling.workshop.turkcell.core.loggers.abstracts.Logger;

public class DatabaseLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("Database Logger ile loglandi. "+ message+"\n");
    }
}
