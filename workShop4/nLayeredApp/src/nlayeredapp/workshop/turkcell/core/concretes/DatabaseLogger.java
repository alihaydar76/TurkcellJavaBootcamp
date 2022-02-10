package nlayeredapp.workshop.turkcell.core.concretes;

import nlayeredapp.workshop.turkcell.core.abstracts.Logger;

public class DatabaseLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("Database Logger ile loglandi. "+ message+"\n");
    }
}
