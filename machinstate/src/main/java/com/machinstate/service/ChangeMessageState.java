package com.machinstate.service;

import com.machinstate.domain.Message;
import com.machinstate.enums.MessageState;

import java.util.List;

public interface ChangeMessageState {

    MessageState statusPara();

    List<MessageState> statusDe();

    Message changeState(Message message);
}
