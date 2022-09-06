package org.gangdodan.test;

import java.util.concurrent.atomic.AtomicLong;

import org.gangdodan.test.test_service.testService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    
    private final testService tService;
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    public testController(testService input){
        this.tService = input;
        tService.set_data("FXXK YOU");
    }

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name), tService.get_data());
    }

}
