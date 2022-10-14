import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Car extends Vehicle{
    private int carW, carH;

    public Car(int x, int y, int speedX, int speedY, Color color, int carW, int carH){
        super(x, y, speedX, speedY, color);
        this.carH = carH;
        this.carW = carW;
        //Puedo proporcionar todo el objeto para que sea mas chico o mas grande
    }

    public void drawCar(Graphics g){
        g.setColor(this.getColor());
        g.fillRect(getDot().getX(), getDot().getY(), carW, carH);
        Polygon car01 = new Polygon();
        car01.addPoint(getDot().getX()+(carW/8), getDot().getY());
        car01.addPoint(getDot().getX()+(carW/4), getDot().getY()-(carH/5+carH/2));
        car01.addPoint(getDot().getX()+(carW/4), getDot().getY());
        g.setColor(this.getColor());
        g.fillPolygon(car01);
        g.fillRect(getDot().getX()+(carW/4), getDot().getY()-(carH/5+carH/2), carW-(carW/2),carH-(carH/5+carH/10));
        Polygon car02 = new Polygon();
        car02.addPoint(getDot().getX()+(carW/2+carW/4), getDot().getY());
        car02.addPoint(getDot().getX()+(carW/2+carW/4), getDot().getY()-(carH/5+carH/2));
        car02.addPoint(getDot().getX()+(carW/2+carW/4+carW/8), getDot().getY());
        g.setColor(this.getColor());
        g.fillPolygon(car02);
        g.setColor(Config.COLOR_WHEELS);
        g.fillOval(getDot().getX()+(carW/8+carW/40), getDot().getY()+(carH/10+carH/5+carH/10), (carH+carW)/5, (carH+carW)/5);
        g.fillOval(getDot().getX()+(carW/2+carW/10+carW/40), getDot().getY()+(carH/10+carH/5+carH/10), (carH+carW)/5, (carH+carW)/5);
    }

}