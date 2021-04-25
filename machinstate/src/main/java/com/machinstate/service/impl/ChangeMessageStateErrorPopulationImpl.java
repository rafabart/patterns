package com.machinstate.service.impl;

import com.machinstate.enums.MessageState;
import com.machinstate.repository.MessageRepository;
import com.machinstate.service.AbstractChangeMessageState;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.machinstate.enums.MessageState.CREATED;
import static com.machinstate.enums.MessageState.ERROR_POPULATION;

@Component
public class ChangeMessageStateErrorPopulationImpl extends AbstractChangeMessageState {


    public ChangeMessageStateErrorPopulationImpl(final MessageRepository messageRepository) {
        super(messageRepository);
    }


    @Override
    public MessageState statusPara() {
        return ERROR_POPULATION;
    }


    @Override
    public List<MessageState> statusDe() {
        return List.of(CREATED);
    }
}
