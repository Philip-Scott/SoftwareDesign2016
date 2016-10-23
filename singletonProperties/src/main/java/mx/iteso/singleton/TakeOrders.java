package mx.iteso.singleton;

import mx.iteso.singleton.tables.Table;

public class TakeOrders {
    public static void main (String[] args){
        TableOrder order;
        Drink drink;
        Dish dish;

        Table table1 = new Table ("table 1");
        Table table2 = new Table ("table 3");
        Table table4 = new Table ("table 4");

        order = table1.getInstance();

        drink = new Drink();
        drink.setName("Coke");
        drink.setWaiter("Waiter A");
        drink.setPrice(10);
        order.addDrink(drink);

        order = table1.getInstance();
        drink = new Drink();
        drink.setName("Coke");
        drink.setWaiter("Waiter B");
        drink.setPrice(10);
        order.addDrink(drink);

        order = table4.getInstance();
        drink = new Drink();
        drink.setName("Coke");
        drink.setWaiter("Waiter B");
        drink.setPrice(10);
        order.addDrink(drink);

        order = table4.getInstance();

        dish = new Dish();
        dish.setName("Enchilada");
        dish.setPrice(8);
        dish.setWaiter("Waiter C");
        order.addDish(dish);

        dish = new Dish();
        dish.setName("Enchilada");
        dish.setPrice(8);
        dish.setWaiter("Waiter C");
        order.addDish(dish);

        order = table4.getInstance();
        dish = new Dish();
        dish.setName("Chicken Pozole");
        dish.setPrice(45);
        dish.setWaiter("Waiter B");
        order.addDish(dish);

        order = table2.getInstance();
        dish = new Dish();
        dish.setName("Tostada de Pata");
        dish.setPrice(28);
        dish.setWaiter("Waiter D");
        order.addDish(dish);

        order = table4.getInstance();
        dish = new Dish();
        dish.setName("Quesadilla Chicharron");
        dish.setPrice(18);
        dish.setWaiter("Waiter A");
        order.addDish(dish);

        order = table4.getInstance();
        dish = new Dish();
        dish.setName("Tostada de Pata");
        dish.setPrice(28);
        dish.setWaiter("Waiter D");
        order.addDish(dish);

        order = table1.getInstance();
        order.printCheck();

        order = table4.getInstance();
        order.printCheck();

        table4.clearOrder();

        order = table4.getInstance();
        dish= new Dish();
        dish.setName("Quesadilla Rajas");
        dish.setPrice(18);
        dish.setWaiter("Waiter E");
        order.addDish(dish);

        order.printCheck();
    }
}

