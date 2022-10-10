import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Swing02 {
        public static void main(String args[]){
            JFrame window = new JFrame("Sky");
            Paint01 cielitoLindo = new Paint01();
    
    
            window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);    //Definimos el comportamiento al cerrar nuestro programa
            window.setSize(Config.WINDOW_W, Config.WINDOW_H);       //Definimos el tamaño de nuesta ventana
            window.add(cielitoLindo);                     //Añadimos nuesto objeto a la ventana
            window.pack();                                //Desconosco su uso
            window.setResizable(false);         //Impide que el usuario pueda agrandar la pantalla arruinando nuestro dibujo 
            window.setLocationRelativeTo(null);         //Al correr el programa la ventana aparecerá al centro
            window.setVisible(true);                    //Hace la ventana visible
            window.addKeyListener(cielitoLindo);
        }
    }
