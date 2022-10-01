import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.plaf.ColorUIResource;

public class Paintbrush {
    
    private Graphics g;
    public Paintbrush (Graphics g){
        this.g = g;
    }

    public void drakSky(){
        g.setColor(new Color (127,233,245));
        g.fillRect(0, 0, 400, 100);
        g.setColor(Color.YELLOW);
        g.fillOval(40, 40, 20, 20);
    }

    public void drawMountains(){
        Polygon mountain01 =  new Polygon();
        mountain01.addPoint(16, 140);
        mountain01.addPoint(101, 59);
        mountain01.addPoint(181, 140);
        g.setColor(new Color (99, 55, 45));
        g.fillPolygon(mountain01);
        
        Polygon mountain02 =  new Polygon();
        mountain02.addPoint(100, 143);
        mountain02.addPoint(320, 143);
        mountain02.addPoint(213, 64);
        g.setColor(new Color (99, 55, 45));
        g.fillPolygon(mountain02);

        Polygon mountain03 =  new Polygon();
        mountain03.addPoint(233, 170);
        mountain03.addPoint(470, 170);
        mountain03.addPoint(363, 47);
        g.setColor(new Color (99, 55, 45));
        g.fillPolygon(mountain03);
    }

    Color COLOR_TRUNK = new ColorUIResource(64, 19, 9);
    Color COLOR_TREE = new ColorUIResource(47, 148, 40);
    
    
    public void drawTree(){
        int start = 70;
        int top = 50;
        //Draw trunk
        g.setColor(COLOR_TRUNK);
        g.fillRect(start-13, top+110, 26, 40);

        //Draw Tree
        g.setColor(COLOR_TREE);
        for(int i=0; i<5; i++){
            Polygon triangle = new Polygon();
            int height = 50;
            int width = 70;
            int spacing = 15;

            triangle.addPoint(start, top+(spacing*i));
            triangle.addPoint(start - (width/2), top + height +(spacing*i));
            triangle.addPoint(start + (width/2), top + height +(spacing*i));

            g.fillPolygon(triangle);
        }    
    }   
}