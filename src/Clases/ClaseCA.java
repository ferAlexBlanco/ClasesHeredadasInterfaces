package Clases;

import Interfaces.IA;
import Interfaces.IB;
import Interfaces.IC;

public class ClaseCA implements IA,IB,IC,Comparable<ClaseCA>{

    public int x, y;

    public ClaseCA() {
        x = 0;
        y = 0;

    }

    public ClaseCA(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int sumar() {
        return x + y;
    }

    @Override
    public int suma() {
        return x+y;
    }

    @Override
    public int multi() {
        return x*y;
        
    }

    @Override
    public int mayor() {
      return Math.max(x, y);
    }

    @Override
    public int compareTo(ClaseCA t) {
        return x==t.x?1:x>t.x?-1:0;
    }

}
