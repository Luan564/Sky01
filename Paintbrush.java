import java.awt.Graphics;
import java.awt.Polygon;


public class Paintbrush {
    
    private Graphics g;
    public Paintbrush (Graphics g){
        this.g = g;
    }

    
    public void drawSky(){
        g.setColor(Config.COLOR_SKY);
        g.fillRect(0, 0, 400, 100);
    }

    public void drawSun(Point p){
        g.setColor(Config.COLOR_SUN);
        g.fillOval(p.getX() , p.getY() , Config.SUN_SIZE, Config.SUN_SIZE);
    }

    public void drawMountains(){
        Polygon mountain01 =  new Polygon();
        mountain01.addPoint(16, 140);
        mountain01.addPoint(101, 59);
        mountain01.addPoint(181, 140);
        g.setColor(Config.COLOR_MOUNTAINS);
        g.fillPolygon(mountain01);
        
        Polygon mountain02 =  new Polygon();
        mountain02.addPoint(100, 143);
        mountain02.addPoint(320, 143);
        mountain02.addPoint(213, 64);
        g.setColor(Config.COLOR_MOUNTAINS);
        g.fillPolygon(mountain02);

        Polygon mountain03 =  new Polygon();
        mountain03.addPoint(233, 170);
        mountain03.addPoint(470, 170);
        mountain03.addPoint(363, 47);
        g.setColor(Config.COLOR_MOUNTAINS);
        g.fillPolygon(mountain03);
    }  
    
    public void drawTree(){
        int start = 70;
        int top = 40;
        //Draw trunk
        g.setColor(Config.COLOR_TRUNK);
        g.fillRect(start-13, top+110, 26, 40);

        //Draw Tree
        g.setColor(Config.COLOR_TREE);
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

    public void drawLake(){
        g.setColor(Config.COLOR_LAKE);
        g.fillRect(0, 255, 400, 45);
    }

    public void drawHighway(){
        g.setColor(Config.COLOR_HIGHWAY);
        g.fillRect(0, 188, 400, 24);
        g.setColor(Config.COLOR_LINE);
        g.fillRect(0, 212, 400, 3);
        g.setColor(Config.COLOR_HIGHWAY);
        g.fillRect(0, 215, 400, 24);
    }
        
     
}