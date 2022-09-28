
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

public class Sky01 extends JPanel {
    public Sky01 (){
     setPreferredSize(new Dimension(400,300));
     setBackground(Color.LIGHT_GRAY); 
    }
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        //Sky
        g.setColor(new Color (127, 233, 245));
        g.fillRect(0,0,400,100);        //Crea un area para pintar con el color asignado las coordenadas x , y determinan en donde empezara dicha area

        //Sun
        g.setColor(Color.YELLOW);                       
        g.fillOval(40,40,20,20);    //crea un "circulo" empezando en las coordenadas asignadas de Largo y ancho dados
       
        //SwonMan
        g.setColor(Color.WHITE);
        g.fillOval(320, 240, 40, 40);   //Body  
        g.fillOval(327, 218, 25, 25);   //Head

        g.setColor(Color.BLACK);                    
        g.fillOval(332, 226, 5, 5); 
        g.fillOval(340, 226, 5, 5);     //eyes
    }
}

class Swing02 {
    public static void main(String args[]){
        JFrame window = new JFrame("Sky");
        Sky01 cielitoLindo = new Sky01();


        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);    //Definimos el comportamiento al cerrar nuestro programa
        window.setSize(400, 300);       //Definimos el tamaño de nuesta ventana
        window.add(cielitoLindo);                     //Añadimos nuesto objeto a la ventana
        window.pack();                                //Desconosco su uso
        window.setResizable(false);         //Impide que el usuario pueda agrandar la pantalla arruinando nuestro dibujo 
        window.setLocationRelativeTo(null);         //Al correr el programa la ventana aparecerá al centro
        window.setVisible(true);                    //Hace la ventana visible


    }
}
