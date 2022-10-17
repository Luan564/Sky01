import java.awt.Color;
import java.awt.Graphics;

public class Ovni extends Vehicle{
    private int ovniW;  //80
    private int ovniH;  //60

    public Ovni(int x , int y, int speedX, int speedY, Color color, int ovniW, int ovniH){
        super(x, y, speedX, speedY, color);
        this.ovniW = ovniW;
        this.ovniH = ovniH;
    }

    public void drawOvni(Graphics g){
        g.setColor(getColor());
        g.fillOval(getDot().getX(), getDot().getY(), ovniW, ovniH);
        g.setColor(getColor());
        g.fillOval(getDot().getX()+(ovniW/4), getDot().getY()-(ovniH/3), ovniW/2, ovniH);
    }
}