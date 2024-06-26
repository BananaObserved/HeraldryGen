package heraldrygen;

import java.awt.Shape;
import java.awt.Graphics2D;

public class SimpleField extends HeraldicField {
    private Tincture tinct;

    public SimpleField(Tincture tinct, Shape fieldRegion){
        this.tinct = tinct;
        this.fieldRegion = fieldRegion;
    }

    @Override
    public String getName(){
        return tinct.getName();
    }

    @Override
    public void draw(){
        HeraldryGen.compGraph.setPaint(tinct.getColor());
        HeraldryGen.compGraph.fill(fieldRegion);
    }
}
