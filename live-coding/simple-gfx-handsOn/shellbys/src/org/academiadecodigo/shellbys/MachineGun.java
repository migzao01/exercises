package org.academiadecodigo.shellbys;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class MachineGun implements KeyboardHandler {

    private Picture picture;

    public MachineGun() {
        this.picture = new Picture(100,100,"resources/machinegun.png");
    }

    public void init () {
        picture.draw();
        keyboardInit();
    }

    private void keyboardInit() {


        Keyboard keyboard = new Keyboard(this);

        //RIGHT KEY
        KeyboardEvent rightKeyPressed = new KeyboardEvent();
        rightKeyPressed.setKey(KeyboardEvent.KEY_RIGHT);
        rightKeyPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(rightKeyPressed);


        //LEFT KEY
        KeyboardEvent leftKeyPressed = new KeyboardEvent();
        leftKeyPressed.setKey(KeyboardEvent.KEY_LEFT);
        leftKeyPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(leftKeyPressed);

        //UP KEY
        KeyboardEvent upKeyPressed = new KeyboardEvent();
        upKeyPressed.setKey(KeyboardEvent.KEY_UP);
        upKeyPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(upKeyPressed);

        //DOWN KEY
        KeyboardEvent downKeyPressed = new KeyboardEvent();
        downKeyPressed.setKey(KeyboardEvent.KEY_DOWN);
        downKeyPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(downKeyPressed);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if( keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT) {
            picture.translate(-35,0);
        }

        if(keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT) {
            picture.translate(35,0);
        }

        if(keyboardEvent.getKey() == KeyboardEvent.KEY_UP) {
            picture.translate(0,-35);
        }

        if(keyboardEvent.getKey() == KeyboardEvent.KEY_DOWN) {
            picture.translate(0,35);
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        //nao me apetece, até amanhã amigos
    }
}
