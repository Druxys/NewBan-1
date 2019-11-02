package Utils;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Messages {

    public static void sendMessage(String subject, String text, String destinataire, String copyDest){
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", true);
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        Session session = Session.getInstance(properties);

        System.out.println("PASSE 1");
        MimeMessage message = new MimeMessage(session);

        System.out.println("PASSE 2");
        try{
            message.setText(text);
            message.setSubject(subject);
            message.addRecipients(Message.RecipientType.TO, destinataire);
            message.addRecipients(Message.RecipientType.CC, copyDest);
            System.out.println("PASSE 3");
        } catch (MessagingException e){
            e.printStackTrace();
        }

        Transport transport = null;
        try {
            transport = session.getTransport("smtp");
            transport.connect("12newban12@gmail.com", "newban12!");
            transport.sendMessage(message, new Address[] {
                    new InternetAddress(destinataire),
                    new InternetAddress(copyDest)
            });
            System.out.println("PASSE 4");
        }catch (MessagingException e){
            e.printStackTrace();
        } finally {
            try{
                if (transport != null){
                    transport.close();
                }
                System.out.println("PASSE 5");
            } catch (MessagingException e){
                e.printStackTrace();
            }
        }
    }

}
