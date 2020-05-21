package ru.qadojo.catsproducer;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cats")
@RequiredArgsConstructor
public class CatsController {

    private final CatsService catsService;


    @GetMapping
    public CatsResponse getCats() {
        return CatsResponse.builder()
            .cats(catsService.fetchCats())
            .build();
    }

    @Value
    @Builder
    public static class CatsResponse {
        List<Cat> cats;
    }
}
