package com.machinstate.enums;

import lombok.Getter;

@Getter
public enum MessageState {

    CREATED,
    ERROR_POPULATION,
    POPULATED,
    ERROR_INTEGRATION,
    POSTED
}
