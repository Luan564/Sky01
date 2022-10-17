import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Boat extends Vehicle{
    private int boatW;  //80
    private int boatH;  //60

    public Boat(int x , int y, int speedX, int speedY, Color color, int boatW, int boatH){
        super(x, y, speedX, speedY, color);
        this.boatW = boatW;
        this.boatH = boatH;
    }

    public void drawBoat(Graphics g){
        Polygon base = new Polygon();
        //x=240;  y=220;
        base.addPoint(getDot().getX(), getDot().getY());
        base.addPoint(getDot().getX()+(boatW/4),getDot().getY()+(boatH/3));
        base.addPoint(getDot().getX()+(boatW/2+boatW/4),getDot().getY()+(boatH/3));
        base.addPoint(getDot().getX()+(boatW),getDot().getY());
        g.setColor(getColor());
        g.fillPolygon(base);
        
        g.setColor(getColor());
        g.fillRect(getDot().getX()+(boatW/2-boatW/40), getDot().getY()-(boatH/3+boatH/3), boatW/20, boatH/3+boatH/3);

        Polygon vela = new Polygon();
        vela.addPoint(getDot().getX()+(boatW/2), getDot().getY()-(boatH/3+boatH/3));
        vela.addPoint(getDot().getX()+(boatW/2+boatW/4), getDot().getY()-(boatH/2));
        vela.addPoint(getDot().getX()+(boatW/2), getDot().getY()-(boatH/3));
        g.setColor(getColor());
        g.fillPolygon(vela);

    }
}

