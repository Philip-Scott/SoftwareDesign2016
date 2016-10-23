package mx.iteso.singleton.tables;

import mx.iteso.singleton.TableOrder;

import java.util.ArrayList;

public class Table {

    public String tableName;

    private TableOrder order_instance;

    public Table(String name){
        tableName = name;
    }

    public TableOrder getInstance(){
        if(order_instance== null){
            order_instance = new TableOrder();
            order_instance.tableName = tableName;
        }

        return order_instance;
    }

    public void clearOrder(){
        order_instance = null;
    }
}

