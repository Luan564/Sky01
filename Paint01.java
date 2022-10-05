import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
//import java.awt.event.*;

import javax.swing.JPanel;


public class Paint01 extends JPanel{

    Point pSun = new Point(Config.WINDOW_W/2,Config.WINDOW_H/2);
    public Paint01 (){
     setPreferredSize(new Dimension(Config.WINDOW_W,Config.WINDOW_H));
     setBackground(Config.COLOR_BG); 
    }

    
    @Override //Siempre va existir este metodo
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Paintbrush paintbrush = new Paintbrush(g);
        paintbrush.drawSky();
        paintbrush.drawSun(pSun);
        paintbrush.drawMountains();
        paintbrush.drawTree();  
        Car car = new Car(g);
        car.drawCar(300,200,Color.YELLOW);
    }
    
    //public void kPressed(KeyEvent e){
    //    public key = e.getKeyCode();
    //    if(key == KeyEvent.VK_UP){
    //        pSun.setY(pSun.getY()-1);
    //    }
    //faltan las demas teclas

    
    

    }


