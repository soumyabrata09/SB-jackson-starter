package com.sam09.lib.sbjacksonstarter.jackson.mixin;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
        getterVisibility = JsonAutoDetect.Visibility.PROTECTED_AND_PUBLIC
)
public interface SerializeByPublicGettersAndFieldsMixin {
}
