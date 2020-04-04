package Clases;

import ClaseAbstracta.ClaseCC;

public class ClaseCD extends ClaseCC {

    public int x, y;

    public ClaseCD(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int suma() {
        return x+y;

    }

}
