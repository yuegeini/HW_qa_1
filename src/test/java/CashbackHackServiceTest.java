import org.testng.annotations.Test;
import org.testng.Assert;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemain1() {
        int expected = 1;
        int actual = service.remain(999);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemain0() {
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }
    @Test
    public void testRemain999() {
        int expected = 999;
        int actual = service.remain(1001);
        assertEquals(expected, actual);
    }
}