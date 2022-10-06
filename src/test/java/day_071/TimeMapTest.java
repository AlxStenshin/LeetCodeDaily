package day_071;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeMapTest {

    @Test
    void shouldPerformCorrectBehavior() {
    TimeMapTreeMap timeMap = new TimeMapTreeMap();

    timeMap.set("foo", "bar", 1);
    assertEquals("bar", timeMap.get("foo", 1));
    assertEquals("bar", timeMap.get("foo", 3));

    timeMap.set("foo", "bar2", 4);
    assertEquals("bar2", timeMap.get("foo", 4));
    assertEquals("bar2", timeMap.get("foo", 5));

    TimeMapHashMaps timeMapHash = new TimeMapHashMaps();

    timeMapHash.set("foo", "bar", 1);
    assertEquals("bar", timeMapHash.get("foo", 1));
    assertEquals("bar", timeMapHash.get("foo", 3));

    timeMapHash.set("foo", "bar2", 4);
    assertEquals("bar2", timeMapHash.get("foo", 4));
    assertEquals("bar2", timeMapHash.get("foo", 5));
    }

}