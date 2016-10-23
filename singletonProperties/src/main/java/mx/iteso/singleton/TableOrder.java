package mx.iteso.singleton;

import java.util.ArrayList;

public class TableOrder {
    public ArrayList dishes;
    public ArrayList drinks;
    public String tableName;

    public TableOrder () {
        drinks = new ArrayList();
        dishes = new ArrayList();
    }

    public void clearDrinks(){
        drinks.clear();
    }

    public void clearDishes(){
        dishes.clear();
    }

    public void addDrink (Drink drink) {
        drinks.add(drink);
    }
    public void addDish (Dish dish) {
        dishes.add(dish);
    }

    public String printCheck(){
        String out = "";
        float total = 0;
        Drink dr;
        Dish ds;
        int i;
        out += ("Check for " + tableName+ "\n");
        out +=("Drinks:"+ "\n");

        for (i = 0; i < drinks.size(); i++){
            dr = (Drink) drinks.get(i);
            out += (dr.getWaiter() + ": " + dr.getName()+ " " + dr.getPrice()) + "\n";
            total += dr.getPrice();
        }

        out += "Dishes:" + "\n";
        for (i = 0; i < dishes.size(); i++){
            ds = (Dish) dishes.get(i);
            out += (ds.getWaiter() + ": " + ds.getName()+ " " + ds.getPrice());
            total += ds.getPrice();
        }

        out += ("Total: $" + total);
        System.out.println(out);

        return out;
    }
}

