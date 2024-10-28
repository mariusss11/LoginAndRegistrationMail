package com.marius.demo.email;

import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;

public interface MailSender {
    void send(String to, String email);
}