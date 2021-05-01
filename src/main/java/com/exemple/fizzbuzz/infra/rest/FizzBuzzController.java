package com.exemple.fizzbuzz.infra.rest;

import com.exemple.fizzbuzz.domain.FizzBuzzCalculator;
import com.exemple.fizzbuzz.infra.rest.data.FizzBuzzDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FizzBuzzController {

    private final FizzBuzzCalculator fizzBuzzCalculator;

    public FizzBuzzController(FizzBuzzCalculator fizzBuzzCalculator) {
        this.fizzBuzzCalculator = fizzBuzzCalculator;
    }

    @GetMapping("fizzbuzz/{number}")
    public ResponseEntity<FizzBuzzDTO> calculateFizzBuzz(@PathVariable int number) {
        FizzBuzzDTO fizzBuzzDTO = new FizzBuzzDTO(fizzBuzzCalculator.determinateFizzBuzz(number));
        return new ResponseEntity<>(fizzBuzzDTO, HttpStatus.OK);
    }
}
