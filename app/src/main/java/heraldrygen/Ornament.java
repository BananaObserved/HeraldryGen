package heraldrygen;

import java.awt.Shape;

public class Ornament {
    private Shape ornShape;
    private Tincture ornColor;
    private String name;

    public Ornament (Shape ornShape, Tincture ornColor, String name){
        this.ornShape = ornShape;
        this.ornColor = ornColor;
        this.name = name;
    }

    public String getFullName(){
        return name + " " + ornColor.getName();
    }

    public void draw(){
        HeraldryGen.compGraph.setPaint(ornColor.getColor());
        HeraldryGen.compGraph.fill(ornShape);
    }


}
