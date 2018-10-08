import org.junit.*;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {
    @Before
    public void before() {
        WaterBottle waterBottle = new WaterBottle();
    }

    @Test
    public void volumeStartsAt100() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void takes10WhenDrinks() {
        waterBottle.drinks();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void canEmptyBottle() {
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void fillBottle() {
        waterBottle.empty();
        waterBottle.fill();
        assertEquals(100, waterBottle.fill());
    }
}
