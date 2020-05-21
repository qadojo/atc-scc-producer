package ru.qadojo.catsproducer;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Cat {

    Long id;
    String name;
}
