package mx.iteso.singleton;

import mx.iteso.singleton.tables.Table;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by felipe on 10/22/16.
 */
public class TableTest {
    @Test
    public void orderMaking () {
        Table table1 = new Table("Table1");
        assertEquals("Table1", table1.getInstance().tableName);

        table1.tableName = "NAME_CHANGE";
        assertEquals("Table1", table1.getInstance().tableName); // Shouldn't change yet until oder clears
        table1.clearOrder();

        assertEquals("NAME_CHANGE", table1.getInstance().tableName);
    }
}
