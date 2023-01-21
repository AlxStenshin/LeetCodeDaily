package day_178;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

class RestoreIPAddressesTest {

    @Test
    void shouldReturnTwoAddresses() {
        String input = "25525511135";
        List<String> expected = List.of("255.255.11.135", "255.255.111.35");
        assertThat(new RestoreIPAddresses().restoreIpAddresses(input), Matchers.containsInAnyOrder(expected.toArray()));
    }

    @Test
    void shouldReturnOnlyOneAddress() {
        String input = "0000";
        List<String> expected = List.of("0.0.0.0");
        assertThat(new RestoreIPAddresses().restoreIpAddresses(input), Matchers.containsInAnyOrder(expected.toArray()));
    }

    @Test
    void shouldReturnFiveAddresses() {
        String input = "101023";
        List<String> expected = List.of("1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3");
        assertThat(new RestoreIPAddresses().restoreIpAddresses(input), Matchers.containsInAnyOrder(expected.toArray()));
    }

}