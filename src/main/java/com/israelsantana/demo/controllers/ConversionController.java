package com.israelsantana.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.israelsantana.demo.services.ConversionService;


@RestController
@RequestMapping("/conversion")
@Validated
public class ConversionController {
    
    @Autowired
    private ConversionService conversionService;

    @GetMapping("/graus-radianos/{graus}")
    public ResponseEntity<Double> DegreesToRadians(@PathVariable Double graus) {

        Double radians = this.conversionService.DegreesToRadians(graus);
        return ResponseEntity.ok().body(radians);
        
    }

    @GetMapping("/radianos-graus/{radianos}")
    public ResponseEntity<Double> RadiansToDegrees(@PathVariable Double radianos) {

        Double degrees = this.conversionService.RadiansToDegrees(radianos);
        return ResponseEntity.ok().body(degrees);
        
    }

    @GetMapping("/celsius-fahrenheit/{celsius}")
    public ResponseEntity<Double> CelsiusToFahrenheit(@PathVariable Double celsius) {

        Double fahrenheit = this.conversionService.CelsiusToFahrenheit(celsius);
        return ResponseEntity.ok().body(fahrenheit);
        
    }

    @GetMapping("/fahrenheit-celsius/{fahrenheit}")
    public ResponseEntity<Double> FahrenheitToCelsius(@PathVariable Double fahrenheit) {

        Double celsius = this.conversionService.FahrenheitToCelsius(fahrenheit);
        return ResponseEntity.ok().body(celsius);
        
    }

    @GetMapping("/metros-centimetros/{metros}")
    public ResponseEntity<Double> MetersToCentimeters(@PathVariable Double metros) {

        Double centimeters = this.conversionService.MetersToCentimeters(metros);
        return ResponseEntity.ok().body(centimeters);
       
    }

    @GetMapping("/centimetros-metros/{centimetros}")
    public ResponseEntity<Double> CentimetersToMeters(@PathVariable Double centimetros) {

        Double meters = this.conversionService.CentimetersToMeters(centimetros);
        return ResponseEntity.ok().body(meters);
       
    }

    @GetMapping("/quilogramas-gramas/{quilogramas}")
    public ResponseEntity<Double> KilogramsToGrams(@PathVariable Double quilogramas) {

        Double grams = this.conversionService.KilogramsToGrams(quilogramas);
        return ResponseEntity.ok().body(grams);
       
    }

    @GetMapping("/gramas-quilogramas/{gramas}")
    public ResponseEntity<Double> GramsToKilograms(@PathVariable Double gramas) {

        Double kilograms = this.conversionService.GramsToKilograms(gramas);
        return ResponseEntity.ok().body(kilograms);
       
    }

    @GetMapping("/litros-mililitros/{litros}")
    public ResponseEntity<Double> LitersToMilliliters(@PathVariable Double litros) {

        Double milliliters = this.conversionService.LitersToMilliliters(litros);
        return ResponseEntity.ok().body(milliliters);
       
    }

    @GetMapping("/mililitros-litros/{mililitros}")
    public ResponseEntity<Double> MillilitersToLiters(@PathVariable Double mililitros) {

        Double liters = this.conversionService.MillilitersToLiters(mililitros);
        return ResponseEntity.ok().body(liters);
       
    }

    @GetMapping("/metrosQuadrados-centimetrosQuadrados/{metrosQuadrados}")
    public ResponseEntity<Double> SquareMetersToSquareCentimeters(@PathVariable Double metrosQuadrados) {

        Double squareCentimeters = this.conversionService.SquareMetersToSquareCentimeters(metrosQuadrados);
        return ResponseEntity.ok().body(squareCentimeters);
       
    }

    @GetMapping("/centimetrosQuadrados-metrosQuadrados/{centimetrosQuadrados}")
    public ResponseEntity<Double> SquareCentimetersToSquareMeters(@PathVariable Double centimetrosQuadrados) {

        Double squareMeters = this.conversionService.SquareCentimetersToSquareMeters(centimetrosQuadrados);
        return ResponseEntity.ok().body(squareMeters);
       
    }

    @GetMapping("/quilômetrosPorHora-metrosPorSegundo/{quilômetrosPorHora}")
    public ResponseEntity<Double> KilometersPerHourToMetersPerSecond(@PathVariable Double quilômetrosPorHora) {

        Double metersPerSecond = this.conversionService.KilometersPerHourToMetersPerSecond(quilômetrosPorHora);
        return ResponseEntity.ok().body(metersPerSecond);
       
    }

    @GetMapping("/metrosPorSegundo-quilômetrosPorHora/{metrosPorSegundo}")
    public ResponseEntity<Double> MetersPerSecondToKilometersPerHour(@PathVariable Double metrosPorSegundo) {

        Double kilometersPerHour = this.conversionService.MetersPerSecondToKilometersPerHour(metrosPorSegundo);
        return ResponseEntity.ok().body(kilometersPerHour);
       
    }

    @GetMapping("/dolares-euros/{dolares}")
    public ResponseEntity<Double> DollarsToEuros(@PathVariable Double dolares) {

        Double euros = this.conversionService.DollarsToEuros(dolares);
        return ResponseEntity.ok().body(euros);
        
    }

    @GetMapping("/reais-dolares/{reais}")
    public ResponseEntity<Double> ReaisToDollars(@PathVariable Double reais) {

        Double dollars = this.conversionService.ReaisToDollars(reais);
        return ResponseEntity.ok().body(dollars);
        
    }

    @GetMapping("/horas-minutos/{horas}")
    public ResponseEntity<Double> HoursToMinutes(@PathVariable Double horas) {

        Double minutes = this.conversionService.HoursToMinutes(horas);
        return ResponseEntity.ok().body(minutes);
       
    }

    @GetMapping("/minutos-horas/{minutos}")
    public ResponseEntity<Double> MinutesToHours(@PathVariable Double minutos) {

        Double hours = this.conversionService.MinutesToHours(minutos);
        return ResponseEntity.ok().body(hours);
       
    }
    
}
