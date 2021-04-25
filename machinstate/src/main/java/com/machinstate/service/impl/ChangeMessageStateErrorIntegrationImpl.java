package com.machinstate.service.impl;

import com.machinstate.enums.MessageState;
import com.machinstate.repository.MessageRepository;
import com.machinstate.service.AbstractChangeMessageState;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.machinstate.enums.MessageState.CREATED;
import static com.machinstate.enums.MessageState.ERROR_INTEGRATION;
import static com.machinstate.enums.MessageState.POPULATED;

@Component
public class ChangeMessageStateErrorIntegrationImpl extends AbstractChangeMessageState {


    public ChangeMessageStateErrorIntegrationImpl(final MessageRepository messageRepository) {
        super(messageRepository);
    }


    @Override
    public MessageState statusPara() {
        return ERROR_INTEGRATION;
    }


    @Override
    public List<MessageState> statusDe() {
        return List.of(CREATED, POPULATED);
    }
}
