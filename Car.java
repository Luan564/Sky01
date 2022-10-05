import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;


public class Car {
private Color COLOR_CAR = Color.LIGHT_GRAY;
private Color COLOR_WHEELS = Color.BLACK;

private int widthBody = 80;
private int heightBody = 20;
private int posX = 120;
private int posY = 220;
private int SIZE_WHEELS = 17;

    private Graphics g;
    public Car (Graphics g){
        this.g = g;
    }
    

    public void drawCar(){
        g.setColor(COLOR_CAR);
        g.fillRect(posX, posY, widthBody, heightBody);
        Polygon car01 = new Polygon();
        car01.addPoint(posX+10,posY);
        car01.addPoint(posX+20,posY-14);
        car01.addPoint(posX+20,posY);
        g.setColor(COLOR_CAR);
        g.fillPolygon(car01);
        g.fillRect(posX+20, posY-14, widthBody-40,heightBody-6);
        Polygon car02 = new Polygon();
        car02.addPoint(posX+60,posY);
        car02.addPoint(posX+60,posY-14);
        car02.addPoint(posX+70, posY);
        g.setColor(COLOR_CAR);
        g.fillPolygon(car02);
        g.setColor(COLOR_WHEELS);
        g.fillOval(posX+12, posY+16, SIZE_WHEELS, SIZE_WHEELS);
        g.fillOval(posX+52,posY+16,SIZE_WHEELS,SIZE_WHEELS);
    }

    public void drawCar(int x, int y, Color NEW_COLOR){
        this.posX=x;
        this.posY=y;
        this.COLOR_CAR=NEW_COLOR;


        g.setColor(COLOR_CAR);
        g.fillRect(posX, posY, widthBody, heightBody);
        Polygon car01 = new Polygon();
        car01.addPoint(posX+10,posY);
        car01.addPoint(posX+20,posY-14);
        car01.addPoint(posX+20,posY);
        g.setColor(COLOR_CAR);
        g.fillPolygon(car01);
        g.fillRect(posX+20, posY-14, widthBody-40,heightBody-6);
        Polygon car02 = new Polygon();
        car02.addPoint(posX+60,posY);
        car02.addPoint(posX+60,posY-14);
        car02.addPoint(posX+70, posY);
        g.setColor(COLOR_CAR);
        g.fillPolygon(car02);
        g.setColor(COLOR_WHEELS);
        g.fillOval(posX+12, posY+16, SIZE_WHEELS, SIZE_WHEELS);
        g.fillOval(posX+52,posY+16,SIZE_WHEELS,SIZE_WHEELS);
    }
    
}
