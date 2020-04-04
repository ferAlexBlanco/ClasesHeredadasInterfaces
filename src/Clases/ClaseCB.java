package Clases;

public class ClaseCB extends ClaseCA {

    public int z;

    public ClaseCB() {
        z = 0;
    }

    public ClaseCB(int z, int x, int y) {
        super(x, y);
        this.z = z;
    }

    public int suma() {
        return x + y + z;
    }

}
