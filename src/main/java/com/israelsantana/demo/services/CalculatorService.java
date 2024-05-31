package com.israelsantana.demo.services;

import org.springframework.stereotype.Service;


@Service
public class CalculatorService {

    //Soma
    public Double Sum(Double n1, Double n2) {
      return n1 + n2;
    }

    //Subtração
    public Double Subtraction(Double n1, Double n2) {
        return n1 - n2;
    }

    //Multiplicação
    public Double Multiplication(Double n1, Double n2) {
        return n1 * n2;
    }

    //Divisão
    public Double Division(Double n1, Double n2) {
        return n1 / n2;
    }

    //Exponenciação
    public Double Exponentiation(Double n1, Double n2) {
        return Math.pow(n1,n2);
    }

    //Raiz quadrada
    public Double SquareRoot(Double n) {
        return Math.sqrt(n);
    }

    //Logaritmo
    public Double Logarithm(Double n) {
        return Math.log(n);
    }
}

