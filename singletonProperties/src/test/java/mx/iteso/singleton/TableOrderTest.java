package mx.iteso.singleton;

import mx.iteso.singleton.tables.Table;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by felipe on 10/22/16.
 */
public class TableOrderTest {

    private String EMPTY_ORDER =
            "Check for TEST\n" +
            "Drinks:\n" +
            "Dishes:\n" +
            "Total: $0.0";

    private TableOrder order;

    @Before
    public void setup () {
        order = new TableOrder();
        order.tableName = "TEST";
    }

    @Test
    public void emptyOrders () {
        assertEquals(EMPTY_ORDER, order.printCheck());

        makingOrders();
        assertEquals("Check for TEST\n" +
                "Drinks:\n" +
                "Me: TestDrink 4.0\n" +
                "Dishes:\n" +
                "Me: TestDish 5.0Total: $9.0", order.printCheck());

        order.clearDishes();
        order.clearDrinks();

        assertEquals(EMPTY_ORDER, order.printCheck());
    }

    @Test
    public void makingOrders () {
        Dish test_dish = new Dish();
        test_dish.setName("TestDish");
        test_dish.setWaiter("Me");
        test_dish.setPrice(5.0f);

        order.addDish(test_dish);

        Drink drink = new Drink();
        drink.setName("TestDrink");
        drink.setWaiter("Me");
        drink.setPrice(4.0f);

        order.addDrink(drink);

        assertEquals("Check for TEST\n" +
                "Drinks:\n" +
                "Me: TestDrink 4.0\n" +
                "Dishes:\n" +
                "Me: TestDish 5.0Total: $9.0", order.printCheck());
    }
}
