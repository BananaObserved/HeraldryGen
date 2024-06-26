package heraldrygen;

import java.awt.geom.Path2D;

public class HeraldicLine {
    private Path2D linePath;
    private String name;

    public HeraldicLine(Path2D linePath, String name){
        this.linePath = linePath;
        this.name = name;
    }

    public Path2D getLinePath(){
        return linePath;
    }

    public String getName(){
        return name;
    }
}
