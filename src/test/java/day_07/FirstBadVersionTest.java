package day_07;

import org.junit.jupiter.api.Test;
import utils.versionControl.VersionControl;

import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersionTest {

    @Test
    void shouldReturnFour() {
        VersionControl v = new VersionControl(5,4);
        assertEquals(4, new FirstBadVersion().firstBadVersion(5));
    }

    @Test
    void shouldReturnOne() {
        VersionControl v = new VersionControl(1,1);
        assertEquals(1, new FirstBadVersion().firstBadVersion(1));
    }



    /* ToDo: calc method call count:
     VersionControl vc = Mockito.mock(VersionControl.class);
     vc.init(1,1);
     assertEquals(1, new FirstBadVersion().firstBadVersion(1));

     Collection<Invocation> invocations = Mockito.mockingDetails(vc).getInvocations();
     int numberOfCalls = invocations.size();
     assertEquals(1, numberOfCalls);
     */
}