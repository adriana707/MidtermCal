package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/calc/add")      public int add(@RequestParam int a, @RequestParam int b){ return a + b; }
    @GetMapping("/calc/subtract") public int sub(@RequestParam int a, @RequestParam int b){ return a - b; }
    @GetMapping("/calc/multiply") public int mul(@RequestParam int a, @RequestParam int b){ return a * b; }
    @GetMapping("/calc/divide")   public String div(@RequestParam int a, @RequestParam int b){
        if (b == 0) return "Error: cannot divide by zero";
        return String.valueOf(a / b);
    }
}
