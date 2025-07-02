package com.cobeliii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PasswordValidatorTest {
    private final PasswordValidator underTest = new PasswordValidator();

    @Test
    void itShouldFailIfPasswordIsNotNull() {
        //given
        String password = null;

        //when
        var actual = underTest.test(password);

        //Assert
        assertThat(actual).isFalse();
    }

    @Test
    void itShouldFailIfPasswordIsEmpty() {
        //given
        String password = null;

        //when
        var actual = underTest.test(password);

        //Assert
        assertThat(actual).isFalse();
    }

    @Test
    void itShouldFailIfPasswordDoesNotMeetMinimumLengthRequirement() {
        //given
        String password = "njorge";

        //when
        var actual = underTest.test(password);

        //Assert
        assertThat(actual).isFalse();
    }
}
