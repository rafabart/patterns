package com.machinstate;

import com.machinstate.domain.Message;
import com.machinstate.enums.MessageState;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;

@Component
public class MessageFactory {

    public Message createMessage() {
        HashMap<String, String> customer = new HashMap<>();
        customer.put("name", "Fulano");
        customer.put("tempoEntrega", "15 Dias");

        HashMap<String, String> payload = new HashMap<>();
        payload.put("subject", "Confirmação de aquisição de cartão");
        payload.put("destino", "email@gmail.com");
        payload.put("params", customer.toString());

        HashMap<String, String> originalEvent = new HashMap<>();
        originalEvent.put("topic", "bank.account.card.my_topic_name");
        originalEvent.put("payload", "Dados dinamicos segundo payload do kafka");


        return Message.builder()
                .template("101")
                .payload(payload)
                .originalEvent(originalEvent)
                .build();
    }
}
