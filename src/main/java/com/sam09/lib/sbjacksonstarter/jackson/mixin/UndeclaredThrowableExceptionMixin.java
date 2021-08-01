package com.sam09.lib.sbjacksonstarter.jackson.mixin;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class UndeclaredThrowableExceptionMixin {
    UndeclaredThrowableExceptionMixin(@JsonProperty("cause") Throwable cause){
    }
}
