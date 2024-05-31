package com.israelsantana.demo.services;

import org.springframework.stereotype.Service;


@Service
public class ConversionService {

    //Graus para Radianos
    public Double DegreesToRadians(Double graus) {
        return Math.toRadians(graus);
    }
 
    //Radianos para Graus
    public Double RadiansToDegrees(Double radianos) {
        return Math.toDegrees(radianos);
    }

    //Celsius para Fahrenheit
    public Double CelsiusToFahrenheit(Double celsius) {
        return (celsius * 9/5) + 32;
    }

    //Fahrenheit para Celsius
    public Double FahrenheitToCelsius(Double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    //Metros para Centímetros
    public Double MetersToCentimeters(Double metros) {
        return metros * 100;
    }
    
    //Centímetros para Metros
    public Double CentimetersToMeters(Double centimetros) {
        return centimetros / 100;
    }

    //Quilogramas para Gramas
    public Double KilogramsToGrams(Double quilogramas) {
        return quilogramas * 1000;
    }

    //Gramas para Quilogramas
    public Double GramsToKilograms(Double gramas) {
        return gramas / 1000;
    }

    //Litros para Mililitros
    public Double LitersToMilliliters(Double litros) {
        return litros * 1000;
    }

    //Mililitros para Litros 
    public Double MillilitersToLiters(Double mililitros) {
        return mililitros / 1000;
    }

    //Metros Quadrados para Centímetros Quadrados
    public Double SquareMetersToSquareCentimeters(Double metrosQuadrados) {
        return metrosQuadrados * 10000;
    }

    //Centímetros Quadrados para Metros Quadrados 
    public Double SquareCentimetersToSquareMeters(Double centimetrosQuadrados) {
        return centimetrosQuadrados / 10000;
    }

    //Quilômetros por Hora para Metros por Segundo
    public Double KilometersPerHourToMetersPerSecond(Double quilometrosPorHora) {
        return quilometrosPorHora * (1000.0 / 3600.0);
    }

    //Metros por Segundo para Quilômetros por Hora 
    public Double MetersPerSecondToKilometersPerHour(Double metrosPorSegundo) {
        return metrosPorSegundo  * (1000.0 * 3600.0);
    }

    //Dólares para Euros
    public Double DollarsToEuros(Double dolares) {
        Double exchangeRate = 0.92;
        return dolares * exchangeRate;
    }

    //Reais para Dólares
    public Double ReaisToDollars(Double reais) {
        Double exchangeRate = 0.19;
        return reais * exchangeRate;
    }

    //Horas para Minutos
    public Double HoursToMinutes(Double horas) {
        return horas * 60;
    }

    //Minutos para Horas
    public Double MinutesToHours(Double minutos) {
        return minutos / 60;
    }
}

