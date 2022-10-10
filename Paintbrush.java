import java.awt.Color;
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
        int top = 50;
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

    public void drawCar(){
        g.setColor(Config.COLOR_CAR);
        g.fillRect(Config.CAR_posX, Config.CAR_posY, Config.CAR_widthBody, Config.CAR_heightBody);
        Polygon car01 = new Polygon();
        car01.addPoint(Config.CAR_posX+10,Config.CAR_posY);
        car01.addPoint(Config.CAR_posX+20,Config.CAR_posY-14);
        car01.addPoint(Config.CAR_posX+20,Config.CAR_posY);
        g.setColor(Config.COLOR_CAR);
        g.fillPolygon(car01);
        g.fillRect(Config.CAR_posX+20, Config.CAR_posY-14, Config.CAR_widthBody-40,Config.CAR_heightBody-6);
        Polygon car02 = new Polygon();
        car02.addPoint(Config.CAR_posX+60,Config.CAR_posY);
        car02.addPoint(Config.CAR_posX+60,Config.CAR_posY-14);
        car02.addPoint(Config.CAR_posX+70, Config.CAR_posY);
        g.setColor(Config.COLOR_CAR);
        g.fillPolygon(car02);
        g.setColor(Config.COLOR_WHEELS);
        g.fillOval(Config.CAR_posX+12, Config.CAR_posY+16, Config.SIZE_WHEELS, Config.SIZE_WHEELS);
        g.fillOval(Config.CAR_posX+52,Config.CAR_posY+16,Config.SIZE_WHEELS, Config.SIZE_WHEELS);
    }
    
    public void drawCar(int x, int y, Color NEW_COLOR){

        g.setColor(NEW_COLOR);
        g.fillRect(x, y, Config.CAR_widthBody , Config.CAR_heightBody);
        Polygon car01 = new Polygon();
        car01.addPoint(x+10,y);
        car01.addPoint(x+20,y-14);
        car01.addPoint(x+20,y);
        g.setColor(NEW_COLOR);
        g.fillPolygon(car01);
        g.fillRect(x+20, y-14, Config.CAR_widthBody-40,Config.CAR_heightBody-6);
        Polygon car02 = new Polygon();
        car02.addPoint(x+60,y);
        car02.addPoint(x+60,y-14);
        car02.addPoint(x+70, y);
        g.setColor(NEW_COLOR);
        g.fillPolygon(car02);
        g.setColor(Config.COLOR_WHEELS);
        g.fillOval(x+12, y+16, Config.SIZE_WHEELS, Config.SIZE_WHEELS);
        g.fillOval(x+52,y+16,Config.SIZE_WHEELS,Config.SIZE_WHEELS);
    }
    
}