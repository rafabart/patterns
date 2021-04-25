package com.machinstate.service;

import com.machinstate.domain.Message;
import com.machinstate.enums.MessageState;
import com.machinstate.exception.InvalidStateTransitionException;
import com.machinstate.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.util.CollectionUtils;

@RequiredArgsConstructor
public abstract class AbstractChangeMessageState implements ChangeMessageState {

    private final MessageRepository messageRepository;

    public Message changeState(final Message message) {

        if (!isValidStatusTransition(message)) {
            throw new InvalidStateTransitionException((
                    String.format(
                            "Invalid state transition for Message: from=%s, to=%s",
                            message.getMessageState(),
                            statusPara()
                    )
            ));
        }

        return change(message);
    }


    protected boolean isValidStatusTransition(final Message message) {

        final MessageState currentState = message.getMessageState() == null ? MessageState.CREATED : message.getMessageState();

        return !CollectionUtils.isEmpty(statusDe()) && statusDe().contains(currentState);
    }


    private Message change(final Message message) {

        message.setMessageState(statusPara());

        return messageRepository.save(message);
    }
}
