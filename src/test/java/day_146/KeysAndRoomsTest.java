package day_146;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KeysAndRoomsTest {

    @Test
    void shouldReturnTrue() {
        List<List<Integer>> rooms = List.of(List.of(1), List.of(2), List.of(3), List.of());
        assertTrue(new KeysAndRooms().canVisitAllRooms(rooms));
    }

    @Test
    void shouldReturnFalse() {
        List<List<Integer>> rooms = List.of(List.of(1, 3), List.of(3, 0, 1), List.of(2), List.of(0));
        assertFalse(new KeysAndRooms().canVisitAllRooms(rooms));
    }

}