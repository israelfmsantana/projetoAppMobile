package com.israelsantana.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.israelsantana.demo.services.CalculatorService;


@RestController
@RequestMapping("/calculator")
@Validated
public class CalculatorController {
    
    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/soma/{n1}/{n2}")
    public ResponseEntity<Double> Sum(@PathVariable Double n1, @PathVariable Double n2) {

        Double sum = this.calculatorService.Sum(n1, n2);
        return ResponseEntity.ok().body(sum);
        
    }

    @GetMapping("/subtracao/{n1}/{n2}")
    public ResponseEntity<Double> Subtraction(@PathVariable Double n1, @PathVariable Double n2) {

        Double subtraction = this.calculatorService.Subtraction(n1, n2);
        return ResponseEntity.ok().body(subtraction);
        
    }

    @GetMapping("/multiplicacao/{n1}/{n2}")
    public ResponseEntity<Double> Multiplication(@PathVariable Double n1, @PathVariable Double n2) {

        Double multiplication = this.calculatorService.Multiplication(n1, n2);
        return ResponseEntity.ok().body(multiplication);
        
    }

    @GetMapping("/divisao/{n1}/{n2}")
    public ResponseEntity<Double> Division(@PathVariable Double n1, @PathVariable Double n2) {

        Double division = this.calculatorService.Division(n1, n2);
        return ResponseEntity.ok().body(division);
        
    }

    @GetMapping("/exponenciacao/{n1}/{n2}")
    public ResponseEntity<Double> Exponentiation(@PathVariable Double n1, @PathVariable Double n2) {

        Double exponentiation = this.calculatorService.Exponentiation(n1, n2);
        return ResponseEntity.ok().body(exponentiation);
        
    }

    @GetMapping("/raizQuadrada/{n1}")
    public ResponseEntity<Double> SquareRoot(@PathVariable Double n1) {

        Double squareRoot = this.calculatorService.SquareRoot(n1);
        return ResponseEntity.ok().body(squareRoot);
        
    }

    @GetMapping("/logaritmo/{n1}")
    public ResponseEntity<Double> Logarithm(@PathVariable Double n1) {

        Double logarithm = this.calculatorService.Logarithm(n1);
        return ResponseEntity.ok().body(logarithm);
        
    }
    
}
