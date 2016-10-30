package com.iteso.facade;

import com.iteso.facade.impl.*;
import com.iteso.facade.impl.impl.PS3Game;

/**
 * Created by Diego on 27/10/2016.
 */
public class MovieFacade {
    TV tv;
    GameConsole console;
    GameController controller;
    SoundSystem soundSystem;
    Router router;
    Lights lights;
    VideoGame game;

    public MovieFacade(TV tv,GameConsole console, GameController controller, SoundSystem soundSystem, Router router, Lights lights){
        this.tv = tv;
        this.console = console;
        this.controller = controller;
        this.soundSystem = soundSystem;
        this.router = router;
        this.lights = lights;
    }

    public String MovieFacadeON(String FacadeName){
        String out = "";
        System.out.println("Starting the system ON, this may take some time");
        System.out.println();
        out += tv.on() + "\n";
        out += tv.toHDMI() + "\n";
        out += console.on() + "\n";
        out += controller.on() + "\n";
        game = new PS3Game(FacadeName);
        out += console.insertGame(game) + "\n";
        out += soundSystem.on() + "\n";
        out += soundSystem.toOpticalEntry() + "\n";
        out += lights.off() + "\n";
        System.out.println(out);
        return out;
    }
    public String MovieFacadeOFF(){
        String out = "";
        System.out.println();
        System.out.println("Turning the movie OFF, this may take some time");
        System.out.println();
        out += lights.on() + "\n";;
        out += tv.off() + "\n";
        out += controller.off() + "\n";
        out += console.off() + "\n";
        out += soundSystem.off() + "\n";
        System.out.println(out);
        return out;
    }
}
