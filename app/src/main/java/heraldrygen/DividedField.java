package heraldrygen;

import java.awt.Shape;

public class DividedField extends HeraldicField {
    HeraldicField field1;
    HeraldicField field2;
    HeraldicLine divisionLine;

    public DividedField(Tincture tinct1, Tincture tinct2, HeraldicLine divLine, Shape fieldRegion){
        this.divisionLine = divLine;
        Shape[] dividedRegion = divideFieldByLine(fieldRegion, divLine);
        field1 = new SimpleField(tinct1, dividedRegion[0]);
        field2 = new SimpleField(tinct2, dividedRegion[1]);
    }

    private Shape[] divideFieldByLine(Shape hField, HeraldicLine hLine){
        // Using the Path2D from within the HeraldicLine, and the fieldRegion,
        // return an array of two Shapes made by splitting the Shape in two.
        return null;
    }

    @Override
    public void draw(){
        field1.draw();
        field2.draw();
    }

    @Override
    public String getName(){
        return "per " + divisionLine.getName() + " " + field1.getName() + " and " + field2.getName();
    }
}
