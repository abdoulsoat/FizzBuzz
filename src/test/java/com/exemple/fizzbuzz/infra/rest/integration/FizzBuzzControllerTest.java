package com.exemple.fizzbuzz.infra.rest.integration;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.exemple.fizzbuzz.FizzBuzzApplication;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

@SpringBootTest(classes = FizzBuzzApplication.class)
@AutoConfigureMockMvc
@DisplayName("Integration test : Fizzbuzz")
class FizzBuzzControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("should return Fizz if the number is multiple of 3")
    void should_return_fizz_if_number_is_multiple_of_three() throws Exception {
        // When
        ResultActions resultActions = mockMvc.perform(get("/api/fizzbuzz/3"));

        // Then
        resultActions.andExpect(status().isOk());
        resultActions.andExpect(jsonPath("$.result").value("Fizz"));
    }

}
