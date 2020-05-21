package ru.qadojo.catsproducer;

import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Arrays.asList;

@Service
public class CatsService {

    public List<Cat> fetchCats() {
        return asList(
            Cat.builder()
                .id(1L)
                .name("Puppet")
                .build(),
            Cat.builder()
                .id(2L)
                .name("Puppet")
                .build()
        );
    }
}
