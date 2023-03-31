package org.example;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

import java.io.File;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        String message = "HI CHECK ATTACHMENT";
        String subject = "I have sent Attchment Check Once Bro";
        String to ="abhilashvkhot@gmail.com";
        String from ="abhilash.vk@dikshatech.com";

        SendEmailAttach(message , subject,to,from);


        System.out.println("Generation Started");
    }

    private static void SendEmailAttach(String message, String subject, String to, String from) {

        //host
        String host = "smtp.gmail.com";

        //properties
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host",host);
        properties.put("mail.smtp.port","465");
        properties.put("mail.smtp.ssl.enable","true");
        properties.put("mail.smtp.auth","true");

        //session

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("abhilash.vk@diksha" +
                        "" +
                        "tech.com", "revogaemvbqtataw");
            }
        });

        MimeMessage m = new MimeMessage(session);

        try
        {
            m.setFrom(from);

            m.setSubject(subject);

            m.addRecipients(Message.RecipientType.TO, String.valueOf(new InternetAddress(to)));

            MimeMultipart mimeMultipart = new MimeMultipart();

            MimeBodyPart textmime = new MimeBodyPart();
            MimeBodyPart filemime = new MimeBodyPart();

            textmime.setText(message);

            String path = "C://Users//Diksha//Desktop";
            File file = new File(path);
            filemime.attachFile(file);

            m.setText(message);

            Transport.send(m);

            m.setContent(mimeMultipart);
        }
        catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("EMAIL SENT SUCCESSFULLY.............................");






    }
}