package day_307;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashSetTest {

    @Test
    void shouldPerformCorrectBehavior() {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        myHashSet.add(2);
        assertTrue(myHashSet.contains(1));
        assertFalse(myHashSet.contains(3));
        myHashSet.add(2);
        assertTrue(myHashSet.contains(2));
        myHashSet.remove(2);
        assertFalse(myHashSet.contains(2));
    }

}