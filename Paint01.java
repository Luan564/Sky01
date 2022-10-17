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
    ArrayList<Boat> boats = new ArrayList<Boat>();
    ArrayList<Ovni> ovnis = new ArrayList<Ovni>();

    Point pSun = new Point(Config.SUN_POSX,Config.SUN_POSY);
    public Paint01 (){
    setPreferredSize(new Dimension(Config.WINDOW_W,Config.WINDOW_H));
    setBackground(Config.COLOR_BG);    
    Timer timer = new Timer(80, this); 
    timer.start();
    cars.add(new Car(400,190,-5,0,Color.BLUE,72,18));
    cars.add(new Car(90,210,5,0,Color.MAGENTA,72,18));
    cars.add(new Car(0,210,3,0,Color.ORANGE,72,18));

    planes.add(new Plane(30,80,6,-1,Color.gray,64,14));
    planes.add(new Plane(30,60,7,-2,Color.black,58,14));
    planes.add(new Plane(0,110,9,-1,Color.WHITE,58,14));

    boats.add(new Boat(20, 260, 2, 0, Color.yellow, 54, 36));
    boats.add(new Boat(40, 270, 4, 0, Color.BLUE, 54, 36));
    boats.add(new Boat(60, 290, 6, 0, Color.PINK, 54, 36));


    ovnis.add(new Ovni(458, 80, -10, -3, Color.WHITE , 34, 16));
    ovnis.add(new Ovni(480, 140, -15, 0, Color.DARK_GRAY , 34, 16));
    ovnis.add(new Ovni(-30, 40, 10, -1, Color.PINK  , 34, 16));
    
    }

    
    @Override //Siempre va existir este metodo
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Paintbrush paintbrush = new Paintbrush(g);
        paintbrush.drawSky();
        paintbrush.drawSun(pSun);
        paintbrush.drawMountains();
        paintbrush.drawTree();  
        paintbrush.drawHighway();
        paintbrush.drawLake();
        
        for(Car c : cars){
            c.move();
            c.drawCar(g);
        }
        for(Plane p : planes){
            p.move();
            p.drawPlane(g);
        }
        for(Boat b : boats){
            b.move();
            b.drawBoat(g);
        }
        for(Ovni o : ovnis){
            o.move();
            o.drawOvni(g);
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


