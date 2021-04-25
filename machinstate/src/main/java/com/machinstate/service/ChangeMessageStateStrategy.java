package com.machinstate.service;

import com.machinstate.enums.MessageState;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class ChangeMessageStateStrategy {

    private final List<ChangeMessageState> changeMessageStateList;
    private Map<MessageState, ChangeMessageState> changeMessageStateMap;


    public ChangeMessageState select(final MessageState messageState) {
        return changeMessageStateMap.get(messageState);
    }


    @PostConstruct
    protected void onPostConstruct() {
        initializeChangeMessageStateMap();
    }


    private void initializeChangeMessageStateMap() {
        changeMessageStateMap =
                changeMessageStateList
                        .stream()
                        .collect(
                                HashMap::new,
                                (map, command) -> {
                                    if (map.putIfAbsent(command.statusPara(), command) != null) {
                                        throw new UnsupportedOperationException(
                                                String.format(
                                                        "There is more than one ChangeMessageStateList impl handling the same status [%s]",
                                                        command.statusPara()
                                                )
                                        );
                                    }
                                },
                                HashMap::putAll
                        );
    }
}
