package Utils;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Messages {

    public static void sendMessage(String subject, String text, String destinataire, String copyDest){
        Properties properties = new Properties();
        properties.setProperty("mail.transport.protocol", "smtp");
        properties.setProperty("mail.smtp.host", "localhost");
        properties.setProperty("mail.smtp.user", "theluffy008@gmail.com");
        properties.setProperty("mail.from", "imap.gmail.com");
        Session session = Session.getInstance(properties);

        MimeMessage message = new MimeMessage(session);
        try{
            message.setText(text);
            message.setSubject(subject);
            message.addRecipients(Message.RecipientType.TO, destinataire);
            message.addRecipients(Message.RecipientType.CC, copyDest);
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
        }catch (MessagingException e){
            e.printStackTrace();
        } finally {
            try{
                if (transport != null){
                    transport.close();
                }
            } catch (MessagingException e){
                e.printStackTrace();
            }
        }
    }

}
