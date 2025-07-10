package com.graviton.webserver;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greetingMethodName(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/greeting2")
    public String getMethodName() {
        return "abc";
    }

    @GetMapping("/leaderboard")
    public Graviton_Leaderboard graviton_Leaderboard() {
        ArrayList<Player_Data> pd = new ArrayList<>();

        for(int i=0; i<10; i++){
            pd.add(new Player_Data("SH MODE", 50000-i*5000));
        }
            pd.add(new Player_Data("DH MODE", -9999));
        return new Graviton_Leaderboard(1, "Leaderboard for 2025-07-01", pd);
    }
    
    
}
