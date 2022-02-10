package nlayeredapp.workshop.turkcell.core.concretes;

import nlayeredapp.workshop.turkcell.core.abstracts.Logger;

public class SmsLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("Sms Logger ile loglandi. "+ message+"\n");
    }
}
