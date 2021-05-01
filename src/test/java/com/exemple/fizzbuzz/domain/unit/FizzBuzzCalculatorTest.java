package com.exemple.fizzbuzz.domain.unit;

import static org.assertj.core.api.Assertions.assertThat;

import com.exemple.fizzbuzz.domain.FizzBuzzCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Unit Test : FizzbuzzCalculator")
class FizzBuzzCalculatorTest {

    private final FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();

    @Test
    @DisplayName("should return 2 if the number is equal to 2")
    void should_return_2_if_number_not_respect_fizzbuzz_rules() {
        assertThat(fizzBuzzCalculator.determinateFizzBuzz(2)).isEqualTo("2");
    }

    @Test
    @DisplayName("should return 4 if the number is equal to 4")
    void should_return_4_if_number_not_respect_fizzbuzz_rules() {
        assertThat(fizzBuzzCalculator.determinateFizzBuzz(4)).isEqualTo("4");
    }

    @Test
    @DisplayName("should return Fizz if the number is multiple of 3")
    void should_return_fizz_if_number_is_multiple_of_three() {
        assertThat(fizzBuzzCalculator.determinateFizzBuzz(3)).isEqualTo("Fizz");
    }

    @Test
    @DisplayName("should return Buzz if the number is multiple of 5")
    void should_return_buzz_if_number_is_multiple_of_five() {
        assertThat(fizzBuzzCalculator.determinateFizzBuzz(5)).isEqualTo("Buzz");
    }

    @Test
    @DisplayName("should return FizzBuzz if the number is multiple of 3 and 5")
    void should_return_fizzbuzz_if_number_is_multiple_of_three_and_five() {
        assertThat(fizzBuzzCalculator.determinateFizzBuzz(15)).isEqualTo("FizzBuzz");
    }
}
