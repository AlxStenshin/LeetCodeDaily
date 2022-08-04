package day_008;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MirrorReflectionTest {

    @Test
    void shouldReturnTwo(){
        // The ray meets receptor 2 the first time it gets reflected back to the left wall.
        assertEquals(2, new MirrorReflection().mirrorReflection(2, 1));
    }

    @Test
    void shouldReturnOne(){
        assertEquals(1, new MirrorReflection().mirrorReflection(3, 1));
    }

    @Test
    void shouldReturnZero(){
        assertEquals(0, new MirrorReflection().mirrorReflection(3, 2));
    }

}