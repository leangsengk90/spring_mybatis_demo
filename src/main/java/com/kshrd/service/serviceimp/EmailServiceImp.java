package com.kshrd.service.serviceimp;

import com.kshrd.service.EmailService;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;

@Service
public class EmailServiceImp implements EmailService {

    private final JavaMailSender javaMailSender;

    public EmailServiceImp(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    @Async
    public void sendByMail(String to, String email) {
        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(
                mimeMessage, "utf-8"
            );
            helper.setText(email, true);
            helper.setTo(to);
            helper.setSubject("Verification code");
            helper.setFrom("leangsengk90@gmail.com");
            javaMailSender.send(mimeMessage);
        }catch (Exception ex){
            System.out.println("send: " + ex);
        }
    }
}
