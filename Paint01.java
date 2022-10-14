import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.Timer;

import javax.swing.JPanel;


public class Paint01 extends JPanel implements KeyListener, ActionListener{
    ArrayList<Car> cars = new ArrayList<Car>();
    ArrayList<Plane> planes = new ArrayList<Plane>();

    Point pSun = new Point(Config.SUN_POSX,Config.SUN_POSY);
    public Paint01 (){
    setPreferredSize(new Dimension(Config.WINDOW_W,Config.WINDOW_H));
    setBackground(Config.COLOR_BG);    
    Timer timer = new Timer(80, this); 
    timer.start();
    cars.add(new Car(30,220,2,0,Color.BLUE,80,20));
    cars.add(new Car(370,270,-4,0,Color.MAGENTA,80,20));
    planes.add(new Plane(30,80,6,-1,Color.gray,64,14));
    
    }

    
    @Override //Siempre va existir este metodo
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Paintbrush paintbrush = new Paintbrush(g);
        paintbrush.drawSky();
        paintbrush.drawSun(pSun);
        paintbrush.drawMountains();
        paintbrush.drawTree();  
        
        for(Car c : cars){
            c.move();
            c.drawCar(g);
        }
        for(Plane p : planes){
            p.move();
            p.drawPlane(g);
        }
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int x = pSun.getX();
        x = x+2;
        pSun.setX(x);
        int y = pSun.getY();
        if(x < 193 ){
        y = y-1;
        pSun.setY(y);
        }
        else if(x > 207){
        y = y+1;
        pSun.setY(y);
        }
        repaint();
        
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode(); 
        if(key == KeyEvent.VK_UP){
            pSun.setY(pSun.getY()-Config.SUN_STEP);
        }

        if(key == KeyEvent.VK_DOWN){
            pSun.setY(pSun.getY()+Config.SUN_STEP);
        }

        if(key == KeyEvent.VK_RIGHT){
            pSun.setX(pSun.getX()+Config.SUN_STEP);
        }

        if(key == KeyEvent.VK_LEFT){
            pSun.setX(pSun.getX()-Config.SUN_STEP);
        }

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
        }
    

    }


