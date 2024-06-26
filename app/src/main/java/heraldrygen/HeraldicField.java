package heraldrygen;

import java.awt.Graphics;
import java.awt.Paint;
import java.awt.Shape;

public abstract class HeraldicField {
    protected Shape fieldRegion;
    protected Ornament ornamentation = null;

    public Shape getRegion(){
        return fieldRegion;
    }

    public void addOrnament(Ornament o){
        this.ornamentation = o;
    }

    public abstract String getName();

    public abstract void draw();

    public String blazon(){
        return this.getName() + (ornamentation != null ? ", " + ornamentation.getFullName() : "");
    }
}