package day_251;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OptimalPartitionOfStringTest {

    @Test
    void shouldReturnFour() {
        String s = "abacaba";
        assertEquals(4, new OptimalPartitionOfString().partitionString(s));
    }

    @Test
    void shouldReturnSix() {
        String s = "ssssss";
        assertEquals(6, new OptimalPartitionOfString().partitionString(s));
    }

    @Test
    void shouldReturnFour_Optimized() {
        String s = "abacaba";
        assertEquals(4, new OptimalPartitionOfString().partitionString_Hash(s));
    }

    @Test
    void shouldReturnSix_Optimized() {
        String s = "ssssss";
        assertEquals(6, new OptimalPartitionOfString().partitionString_Hash(s));
    }

}