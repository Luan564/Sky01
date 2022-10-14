import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Car extends Vehicle{

    
    

    public Car(int x, int y, int speedX, int speedY, Color color) {
        super(x, y, speedX, speedY, color);
        
        
    }

    public void drawCar(Graphics g){
        g.setColor(this.getColor());
        g.fillRect(getDot().getX(), getDot().getY(), Config.CAR_widthBody, Config.CAR_heightBody);
        Polygon car01 = new Polygon();
        car01.addPoint(getDot().getX()+10, getDot().getY());
        car01.addPoint(getDot().getX()+20, getDot().getY()-14);
        car01.addPoint(getDot().getX()+20, getDot().getY());
        g.setColor(this.getColor());
        g.fillPolygon(car01);
        g.fillRect(getDot().getX()+20, getDot().getY()-14, Config.CAR_widthBody-40,Config.CAR_heightBody-6);
        Polygon car02 = new Polygon();
        car02.addPoint(getDot().getX()+60, getDot().getY());
        car02.addPoint(getDot().getX()+60, getDot().getY()-14);
        car02.addPoint(getDot().getX()+70, getDot().getY());
        g.setColor(this.getColor());
        g.fillPolygon(car02);
        g.setColor(Config.COLOR_WHEELS);
        g.fillOval(getDot().getX()+12, getDot().getY()+16, Config.SIZE_WHEELS, Config.SIZE_WHEELS);
        g.fillOval(getDot().getX()+52, getDot().getY()+16,Config.SIZE_WHEELS, Config.SIZE_WHEELS);
    }

}