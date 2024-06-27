package com.israelsantana.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.israelsantana.demo.services.InvestmentService;


@RestController
@RequestMapping("/investment")
@Validated
public class InvestmentController {
    
    @Autowired
    private InvestmentService investmentService;


    //Juros Simples
    @GetMapping("/jurosSimples/{investimento}/{taxa}/{tempo}")
    public ResponseEntity<Double> SimpleInterest(@PathVariable Double investimento, @PathVariable Double taxa, @PathVariable Double tempo) {

        Double simpleInterest = this.investmentService.SimpleInterest(investimento, taxa, tempo);
        return ResponseEntity.ok().body(simpleInterest);
        
    }

    //Juros Compostos
    @GetMapping("/jurosCompostos/{investimento}/{taxa}/{tempo}")
    public ResponseEntity<Double> CompoundInterest(@PathVariable Double investimento, @PathVariable Double taxa, @PathVariable Double tempo) {

        Double compoundInterest = this.investmentService.CompoundInterest(investimento, taxa, tempo);
        return ResponseEntity.ok().body(compoundInterest);
        
    }
    
}
