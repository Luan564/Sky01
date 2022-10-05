import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.JPanel;


public class Paint01 extends JPanel implements KeyListener, ActionListener{

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
        car.drawCar();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyPressed(KeyEvent event) {
        int key = event.getKeyCode(); 
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


