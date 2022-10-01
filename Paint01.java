
import javax.swing.JPanel;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

public class Paint01 extends JPanel {
    public Paint01 (){
     setPreferredSize(new Dimension(400,300));
     setBackground(Color.green); 
    }
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Paintbrush paintbrush = new Paintbrush(g);
        paintbrush.drakSky();
        paintbrush.drawMountains();
        paintbrush.drawTree();
       
    }
}

