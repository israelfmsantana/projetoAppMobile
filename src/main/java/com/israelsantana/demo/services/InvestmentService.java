package com.israelsantana.demo.services;

import org.springframework.stereotype.Service;


@Service
public class InvestmentService {

    //Juros Simples
    public Double SimpleInterest(Double investimento, Double taxa, Double tempo) {
        return investimento * taxa * tempo;
    }

    //Juros Compostos
    public Double CompoundInterest(Double investimento, Double taxa, Double tempo) {
        return investimento * Math.pow(1 + taxa, tempo) - investimento;
    }
}

