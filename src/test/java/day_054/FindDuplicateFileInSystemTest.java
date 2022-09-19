package day_054;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindDuplicateFileInSystemTest {

    @Test
    void shouldReturnTwoDuplicates() {
        String[] input = new String[]{
                "root/a 1.txt(abcd) 2.txt(efgh)",
                "root/c 3.txt(abcd)",
                "root/c/d 4.txt(efgh)",
                "root 4.txt(efgh)"
        };

        List<List<String>> expected = List.of(
                List.of("root/a/2.txt","root/c/d/4.txt","root/4.txt"),
                List.of("root/a/1.txt","root/c/3.txt"));

        assertEquals(expected, new FindDuplicateFileInSystem().findDuplicate(input));
    }

    @Test
    void shouldReturnTwoDuplicatesToo() {
        String[] input = new String[]{
                "root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)"
        };

        List<List<String>> expected = List.of(
                List.of("root/a/2.txt","root/c/d/4.txt"),
                List.of("root/a/1.txt","root/c/3.txt"));

        assertEquals(expected, new FindDuplicateFileInSystem().findDuplicate(input));
    }

    @Test
    void shouldReturnEmptyList() {

        String[] input = new String[]{
                "root/a 1.txt(FB) 2.txt(a)","root/c 3.txt(Ea)","root/c/d 4.txt(b)","root 4.txt(c)"};
        List<List<String>> expected = List.of();

        assertEquals(expected, new FindDuplicateFileInSystem().findDuplicate(input));
    }

}