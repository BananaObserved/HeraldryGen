package heraldrygen;

import java.awt.Paint;

public class Tincture {
    private String name;
    private Paint coloring;

    public Tincture(String name, Paint coloring){
        this.name = name;
        this.coloring = coloring;
    }

    public String getName(){
        return name;
    }

    public Paint getColor(){
        return coloring;
    }
}
