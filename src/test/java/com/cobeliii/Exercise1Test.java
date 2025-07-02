package com.cobeliii;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class Exercise1Test {

    private final Exercise1 underTest = new Exercise1();

    @ParameterizedTest
    @CsvSource({
            "90, A",
            "91, A",
            "100, A",
            "80, B",
            "89, B",
            "70, C",
            "79, C",
            "60, D",
            "69, D",
            "50, E",
            "59, E",
            "40, F",
            "1, F",
    })
    void itShouldGetGrade(int grade, String expected) {
        //when
           var actual = underTest.getGrade(grade);

        //Assert
        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({
            "-1",
            "150",
            "-100",
            "101"
    })
    void itShouldThrowExceptionWhenInsertingOutOfBoundValues(int grade) {

        //Assert
        assertThatThrownBy(() -> underTest.getGrade(grade))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Score must be between 0 and 100");
    }

    @ParameterizedTest
    @CsvSource({
            "Newton, 2",
            "AB, 1",
            "aeee, 4"
    })
    void itShouldCountVowels(String input, int expected) {
        //when
        var  actual = underTest.countVowels(input);

        //Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void itShouldReturn0WhenNameIsNull() {
        //given
        String name = null;
        //when
        var actual = underTest.countVowels(name);

        //Assert
        assertThat(actual).isEqualTo(0);
    }

    @Test
    void itShouldIsValidStudentId() {
        //given
        var studentId = "S3456";
        //when
        var  actual = underTest.isValidStudentId(studentId);

        //Assert
        assertThat(actual).isTrue();
    }

    @Test
    void itShouldCalculateAverage() {
        //given
        List<Integer> scores = List.of(12, 12, 12);
        //when
        var actual = underTest.calculateAverage(scores);
        //Assert
        assertThat(actual).isEqualTo(12.0);
    }

    @Test
    void itShouldReturn0WhenScoresIsNull() {
        //given
        List<Integer> scores = null;
        //when
        var actual = underTest.calculateAverage(scores);
        //Assert
        assertThat(actual).isEqualTo(0.0);
    }

    @Test
    void itShouldReturn0WhenScoresIsEmpty() {
        //given
        List<Integer> scores = new ArrayList<>();
        //when
        var actual = underTest.calculateAverage(scores);
        //Assert
        assertThat(actual).isEqualTo(0.0);
    }
    @Test
    void itShouldGenerateUsername() {
        //given
        String name = "Newton Jorge";
        //when
        var actual = underTest.generateUsername(name);
        //Assert
        assertThat(actual).isEqualTo("njorge");
    }

    @Test
    void itShouldGetTopStudents() {
        //given
        List<Student> students =
                List.of(new Student("Newton", 10),
                        new Student("Newmer", 99),
                        new Student("Erina", 99));

        List<Student> maus = List.of(new Student("Newmer", 99),
                new Student("Erina", 99));
        //when
        List<Student> actual = underTest.getTopStudents(students, 90);

        //Assert
        assertThat(actual).isEqualTo(maus);
    }

    @Test
    void itShouldHasDuplicateNames() {
        //given
        //when
        //Assert
    }

    @Test
    void itShouldReverseCourses() {
        //given
        //when
        //Assert
    }

    @Test
    void itShouldHasPassed() {
        //given
        //when
        //Assert
    }

    @Test
    void itShouldAssignBadge() {
        //given
        //when
        //Assert
    }
}