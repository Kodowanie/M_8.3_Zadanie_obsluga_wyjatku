package exception.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {


    @Test
    void ExceptionHandlingTestSuite() throws Exception {

        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        //when & then
        assertAll(
                () -> assertThrows(Exception.class , () -> secondChallenge.probablyIWillThrowException(3, 1)),
                () -> assertThrows(Exception.class , () -> secondChallenge.probablyIWillThrowException(1, 1.5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1))
        );

    }

}
