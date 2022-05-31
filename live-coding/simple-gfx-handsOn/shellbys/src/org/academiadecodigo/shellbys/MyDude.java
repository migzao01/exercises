package org.academiadecodigo.shellbys;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class MyDude {

    private Picture picture;

    public MyDude(){
        this.picture = new Picture(200,100, "resources/mydude.png");
    }

    public void init() {
        picture.draw();
    }


}
