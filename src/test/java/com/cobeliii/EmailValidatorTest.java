package com.cobeliii;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    private EmailValidator underTest = new EmailValidator();;


    @ParameterizedTest
    @CsvSource({
            "hello.com, false",
            "hello@amigoscode.com, true"

    })
    void isValidEmail(String email,  boolean expected) {
        //given
        //when
        var actual = underTest.test(email);

        // assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void itShouldNotValidateIncorrectEmails() {
        //given
        var email = "hello@amigoscode.com";
        //when
        var actual = underTest.test(email);

        // assert
        assertThat(actual).isFalse();
    }
}