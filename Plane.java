import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Plane extends Vehicle{
    private int planeW;         //52
    private int planeH;         //14
//dot = x: 130; y: 28;
    public Plane(int x, int y, int speedX, int speedY, Color color, int planeW, int planeH){
        super(x, y, speedX, speedY, color);
        this.planeH = planeH;
        this.planeW = planeW;

    }
    
    public void drawPlane(Graphics g){
        g.setColor(getColor());
        g.fillOval(getDot().getX(),getDot().getY(),planeW, planeH);

        Polygon cola = new Polygon();
        cola.addPoint(getDot().getX()+(planeW/54*5),getDot().getY()+(planeH/14*6));
        cola.addPoint(getDot().getX()+(planeW/54*15),getDot().getY()+(planeH/14*6));
        cola.addPoint(getDot().getX()+(planeW/54*10),getDot().getY()-(planeH/14*8));
        cola.addPoint(getDot().getX()+(planeW/54*5),getDot().getY()-(planeH/14*10));
        g.setColor(getColor());
        g.fillPolygon(cola);

        Polygon ala1 = new Polygon();
        ala1.addPoint(getDot().getX()+(planeW/54*27), getDot().getY()+(planeH/14*5));
        ala1.addPoint(getDot().getX()+(planeW/54*37), getDot().getY()+(planeH/14*5));
        ala1.addPoint(getDot().getX()+(planeW/54*31), getDot().getY()-(planeH/14*11));
        ala1.addPoint(getDot().getX()+(planeW/54*27), getDot().getY()-(planeH/14*11));
        g.setColor(getColor());
        g.fillPolygon(ala1);

        Polygon ala2 = new Polygon();
        ala2.addPoint(getDot().getX()+(planeW/54*27), getDot().getY()+(planeH/14*7));
        ala2.addPoint(getDot().getX()+(planeW/54*36), getDot().getY()+(planeH/14*7));
        ala2.addPoint(getDot().getX()+(planeW/54*31), getDot().getY()+(planeH/14*23));
        ala2.addPoint(getDot().getX()+(planeW/54*27), getDot().getY()+(planeH/14*23));
        g.setColor(getColor());
        g.fillPolygon(ala2);
    }
}
