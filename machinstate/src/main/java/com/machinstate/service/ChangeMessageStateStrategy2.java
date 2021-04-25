package com.machinstate.service;

import com.machinstate.enums.MessageState;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ChangeMessageStateStrategy2 {

    private final List<ChangeMessageState> messageStrategies;
    private Map<MessageState, ChangeMessageState> messageStateMap;


    @PostConstruct
    public void init() {
        createStrategy();
    }


    private void createStrategy() {
        messageStateMap = messageStrategies.stream()
                .collect(Collectors.toMap(ChangeMessageState::statusPara, Function.identity()));
    }


    public ChangeMessageState select(final MessageState messageState) {
        return messageStateMap.get(messageState);
    }
}
