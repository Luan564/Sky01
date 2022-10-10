import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.Timer;

import javax.swing.JPanel;


public class Paint01 extends JPanel implements KeyListener, ActionListener{

    Point pSun = new Point(Config.WINDOW_W/2,Config.WINDOW_H/2);
    public Paint01 (){
    setPreferredSize(new Dimension(Config.WINDOW_W,Config.WINDOW_H));
    setBackground(Config.COLOR_BG);    
    Timer timer = new Timer(100, this); 
    timer.start();
    }

    
    @Override //Siempre va existir este metodo
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Paintbrush paintbrush = new Paintbrush(g);
        paintbrush.drawSky();
        paintbrush.drawMountains();
        paintbrush.drawTree();  
        paintbrush.drawSun(pSun);
        paintbrush.drawCar(100,50,Color.BLUE);
        paintbrush.drawCar();
        paintbrush.drawCar(300, 200, Color.ORANGE);
        
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int x = pSun.getX();
        x = x;
        pSun.setX(x);
        int y = pSun.getY();
        y = y+1;
        pSun.setY(y);
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


