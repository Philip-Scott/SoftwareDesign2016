package mx.iteso;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

public class TacitKnowledgePrinterTest {
    public TacitKnowledgePrinter printer;
    public Printer interfaz;

    @Before
    public void Setup () {
        interfaz = mock(Printer.class);
        when(interfaz.print(any(String.class))).thenAnswer(i -> i.getArguments()[0]);
        printer = new TacitKnowledgePrinter(interfaz);
    }

    @Test
    public void print_10_numbers () {
        String formed_string = printer.printNumbers(10);
        assertEquals (formed_string, "12Tacit4KnowledgeTacit78TacitKnowledge");
        verify(interfaz, times(10)).print (anyString());
    }

    @Test(expected=RuntimeException.class)
    public void print_0_numbers () {
        String formed_string = printer.printNumbers(0);
    }

    @Test
    public void print_15_numbers () {
        String formed_string = printer.printNumbers(15);
        assertEquals (formed_string, "12Tacit4KnowledgeTacit78TacitKnowledge11Tacit1314TacitKnowledge");
    }

    @Test(expected=RuntimeException.class)
    public void print_negative_numbers () {
        String formed_string = printer.printNumbers(-42);
    }
}
