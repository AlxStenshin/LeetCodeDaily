package day_171;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LexicographicallySmallestEquivalentStringTest {

    @Test
    void shouldReturn_makkek(){
        String s1 = "parker";
        String s2 = "morris";
        String baseStr = "parser";
        String expected = "makkek";

        assertEquals(expected, new LexicographicallySmallestEquivalentString().smallestEquivalentString(s1, s2, baseStr));
    }

    @Test
    void shouldReturn_hdld(){
        String s1 = "hello";
        String s2 = "world";
        String baseStr = "hold";
        String expected = "hdld";

        assertEquals(expected, new LexicographicallySmallestEquivalentString().smallestEquivalentString(s1, s2, baseStr));
    }

    @Test
    void shouldReturn_aauaaaaada(){
        String s1 = "leetcode";
        String s2 = "programs";
        String baseStr = "sourcecode";
        String expected = "aauaaaaada";

        assertEquals(expected, new LexicographicallySmallestEquivalentString().smallestEquivalentString(s1, s2, baseStr));
    }
    @Test
    void shouldReturn_makkek_uf(){
        String s1 = "parker";
        String s2 = "morris";
        String baseStr = "parser";
        String expected = "makkek";

        assertEquals(expected, new LexicographicallySmallestEquivalentString().smallestEquivalentStringUnionFind(s1, s2, baseStr));
    }

    @Test
    void shouldReturn_hdld_uf(){
        String s1 = "hello";
        String s2 = "world";
        String baseStr = "hold";
        String expected = "hdld";

        assertEquals(expected, new LexicographicallySmallestEquivalentString().smallestEquivalentStringUnionFind(s1, s2, baseStr));
    }

    @Test
    void shouldReturn_aauaaaaada_uf(){
        String s1 = "leetcode";
        String s2 = "programs";
        String baseStr = "sourcecode";
        String expected = "aauaaaaada";

        assertEquals(expected, new LexicographicallySmallestEquivalentString().smallestEquivalentStringUnionFind(s1, s2, baseStr));
    }
}