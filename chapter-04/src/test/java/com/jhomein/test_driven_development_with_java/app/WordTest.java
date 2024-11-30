package com.jhomein.test_driven_development_with_java.app;

import com.jhomein.test_driven_development_with_java.app.domain.Letter;
import com.jhomein.test_driven_development_with_java.app.domain.Word;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class WordTest {

    @Test
    public void oneIncorrectLetter() {
        var word = new Word("A");
        var score = word.guess("Z");

        assertThat(score.letter(0)).isEqualTo(Letter.INCORRECT);
    }

    @Test
    public void oneCorrectLetter() {
        var word = new Word("A");
        var score = word.guess("A");

        assertThat(score.letter(0)).isEqualTo(Letter.CORRECT);
    }
}
