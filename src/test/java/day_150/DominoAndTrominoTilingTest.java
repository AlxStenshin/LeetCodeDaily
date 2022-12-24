package day_150;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DominoAndTrominoTilingTest {

    @Test
    void shouldReturnFive() {
        assertEquals(5, new DominoAndTrominoTiling().numTilings(3));
    }

    @Test
    void shouldReturnOne() {
        assertEquals(1, new DominoAndTrominoTiling().numTilings(1));
    }

}