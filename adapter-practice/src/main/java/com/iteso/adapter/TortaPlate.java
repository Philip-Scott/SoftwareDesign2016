package com.iteso.adapter;

import java.util.ArrayList;

/**
 * Created by felipe.
 */
public class TortaPlate {
    private ArrayList<Torta> tortas;

    public TortaPlate(){
        tortas = new ArrayList<Torta>();
    }

    public void add(Torta torta){
       tortas.add(torta);
   }

    public String servePlate(){
        String out = "";
        for (int i = 0; i < tortas.size(); i++){
            Torta torta = tortas.get(i);
            out += torta.cutByHalf ();
            out += torta.fill ();
            out += torta.cover ();
            out += torta.printDescription ();
        }

        return out;
    }
}
