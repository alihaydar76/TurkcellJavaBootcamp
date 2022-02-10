package nlayeredapp.workshop.turkcell.core.concretes;

import nlayeredapp.workshop.turkcell.core.abstracts.Logger;

public class EmailLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("Email Logger ile loglandi. "+ message+"\n");
    }
}
