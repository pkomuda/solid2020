package pl.zzpj2020.solid.isp.contactbook.solution;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data class Contact implements Dialler, Emailer {

    private String name;
    private String address;
    private String emailAddress;
    private String telephone;

    @Override
    public void makeCall() {
        // call using this.telephone
    }

    @Override
    public void sendEmail(String subject, String body) {
        // send email using this.emailAddress
    }
}
