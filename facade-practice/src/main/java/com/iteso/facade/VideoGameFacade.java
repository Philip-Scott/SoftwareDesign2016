package com.iteso.facade;

import com.iteso.facade.impl.*;
import com.iteso.facade.impl.impl.PS3Game;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 8:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class VideoGameFacade {
    TV tv;
    GameConsole console;
    GameController controller;
    SoundSystem soundSystem;
    Router router;
    Lights lights;
    VideoGame game;

    public VideoGameFacade(TV tv,
                           GameConsole console,
                           GameController controller,
                           SoundSystem soundSystem,
                           Router router,
                           Lights lights){
        this.tv = tv;
        this.console = console;
        this.controller = controller;
        this.soundSystem = soundSystem;
        this.router = router;
        this.lights = lights;
    }


    public String playOnlineGame(String gameName){
        String out = "";
        System.out.println("Turning the system ON, this may take some time");
        System.out.println();

        out += tv.on() + "\n";
        out += tv.toHDMI() + "\n";
        out += console.on() + "\n";
        out += controller.on() + "\n";
        game = new PS3Game(gameName);
        out += console.insertGame(game) + "\n";

        out += soundSystem.on() + "\n";
        out += soundSystem.toOpticalEntry() + "\n";
        out += router.on() + "\n";
        out += router.checkInternet() + "\n";

        out += lights.off() + "\n";

        out += game.setOnlineMode() + "\n";
        out += game.play() + "\n";
        System.out.println(out);
        return out;
    }

    public String stopPlayingGame(){
        String out ="";
        System.out.println();
        System.out.println("Turning the system OFF, this may take some time");
        System.out.println();
        out += lights.on() + "\n";;
        out += tv.off() + "\n";
        out += controller.off() + "\n";
        out += console.off() + "\n";
        out += soundSystem.off() + "\n";
        out += router.off() + "\n";
        System.out.println(out);
        return out;
    }


}
