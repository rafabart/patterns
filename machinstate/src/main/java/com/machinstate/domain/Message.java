package com.machinstate.domain;

import com.machinstate.enums.MessageState;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.HashMap;

@Data
@Builder
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    @Id
    private String id;

    private String template;

    private HashMap<String, String> payload = new HashMap<>();

    private MessageState messageState;

    private HashMap<String, String> originalEvent = new HashMap<>();

    private LocalDateTime datCreation;

    private LocalDateTime datUpdate;

}
