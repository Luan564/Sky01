
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

public class Sky01 extends JPanel {
    public Sky01 (){
     setPreferredSize(new Dimension(400,300));
     setBackground(Color.GRAY); 
    }   
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        
        g.setColor(new Color (127, 233, 245));
        g.fillRect(0,0,400,100);

        
        g.setColor(Color.YELLOW);
        g.fillOval(40,40,20,20);
    }
}

class Swing02 {
    public static void main(String args[]){
        JFrame window = new JFrame("Sky");
        Sky01 cielitoLindo = new Sky01();


        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(400, 300);
        window.add(cielitoLindo);
        window.pack();
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setVisible(true);


    }
}