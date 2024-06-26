package heraldrygen;

import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;

public class TinctureMap {
    public static HashMap<String, Paint> tinctMap = initMap();

    static Color colorFromHex(String s){
        // Given a six digit string of the form RRGGBB,
        // with R, G, and B representing hexadecimal digits
        // showing the associated color values, create a Color.
        int r = Integer.parseInt(s, 0, 2, 16);
        int g = Integer.parseInt(s, 2, 4, 16);
        int b = Integer.parseInt(s, 4, 6, 16);
        return new Color(r, g, b);
    }

    private static HashMap<String, Paint> initMap(){
        HashMap<String, Paint> tmap = new HashMap<String, Paint>();

        //Metals
        tmap.put("argent", colorFromHex("FAFAFA"));
        tmap.put("or", colorFromHex("FFD700"));

        //Colors
        tmap.put("sable", colorFromHex("000000"));
        tmap.put("gules", colorFromHex("FF3737"));
        tmap.put("vert", colorFromHex("00A800"));
        tmap.put("azure", colorFromHex("4040FF"));
        tmap.put("purpure", colorFromHex("7C4B88"));

        //Stains
        tmap.put("sanguine", colorFromHex("F80000"));
        tmap.put("murrey", colorFromHex("8C3663"));
        tmap.put("tenné", colorFromHex("CD5700"));



        return tmap;

    }
}
