package com.email.api.emailapipost.services;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class EmailServices {

    private static String subject;
    private static String message;
    private static String to;
    private static String from;

    /*public void main(String[] args){


        String subject = "HI WELCOME TO NEW WORLD";
        String message ="THIS IS NEW WORLD OF URS";
        String to = "abhilashvkhot@gmail.com";
        boolean b = sendMailService(subject, message, to, from);
        String from ="abhilash.vk@dikshatech.com";

        sendMailService( subject ,  message, to,from);*/

    public boolean sendMailService(String subject , String message , String to){

        String from ="abhilash.vk@dikshatech.com";

        boolean f = false;


        String host = "smtp.gmail.com";

        Properties properties = System.getProperties();

        properties.put("mail.smtp.host",host);
        properties.put("mail.smtp.port",465);
        properties.put("mail.smtp.ssl.enable","true");
        properties.put("mail.smtp.auth","true");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("abhilash.vk@dikshatech.com","uebxvojcimjkkbss");
            }
        });

        MimeMessage m = new MimeMessage(session);

        try{
            m.setFrom(from);

            m.setText(message);

            m.addRecipients(Message.RecipientType.TO, String.valueOf(new InternetAddress(to)));

            m.setSubject(subject);

            Transport.send(m);

            f=true;
        }
        catch (Exception e){

        }

        System.out.println("EMAIL SENT SUCCESSFULLY .......");


        return f;
    }

}


