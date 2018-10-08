import org.junit.*;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(50, 100);
    }

    @Test
    public void hasVolume() {
        assertEquals(50, printer.getSheets());
    }

    @Test
    public void canPrintPages() {
        printer.printPages(40);
        assertEquals(10, printer.getSheets());
        assertEquals(60, printer.getTonerVolume());
    }

    @Test
    public void givesInfoWhenPrinting() {
        assertEquals("Not enough sheets or toner to print", printer.printPages(80));
    }

    @Test
    public void notEnoughCanPrintPages() {
        printer.printPages(80);
        assertEquals(50, printer.getSheets());
    }

    @Test
    public void canRefill() {
        printer.refill(10);
        assertEquals(60, printer.getSheets());
    }

    @Test
    public void hasTonerVolume() {
        assertEquals(100, printer.getTonerVolume());
    }

}
