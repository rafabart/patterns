package com.machinstate;

import com.machinstate.domain.Message;
import com.machinstate.service.ChangeMessageStateStrategy2;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import static com.machinstate.enums.MessageState.ERROR_INTEGRATION;
import static com.machinstate.enums.MessageState.POPULATED;

@Component
@RequiredArgsConstructor
public class DataStart implements CommandLineRunner {

    private final MessageFactory messageFactory;
    private final ChangeMessageStateStrategy2 stateSelector;

    @Override
    public void run(String... args) throws Exception {

        Message message = messageFactory.createMessage();

        Message messageChanged = stateSelector.select(POPULATED).changeState(message);

        System.out.println(messageChanged);


        Message messageChanged2 = stateSelector.select(ERROR_INTEGRATION).changeState(message);

        System.out.println(messageChanged2);
    }
}
