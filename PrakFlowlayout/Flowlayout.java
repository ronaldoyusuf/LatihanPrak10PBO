/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PrakFlowlayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;
/**
 *
 * @author Ronaldo Yusuf
 */
public class Flowlayout extends JFrame {

public Flowlayout() {
    FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 5, 10);
    
    Container container = getContentPane();
    
    container.setLayout(flowLayout);
    
    container.add(new JButton("Tombol 1"));
    container.add(new JButton("Tombol 2"));
    container.add(new JButton("Tombol 3"));
    container.add(new JButton("Tombol 4"));
    container.add(new JButton("Tombol 5"));
}

    public static void main(String[] args) {
    Flowlayout jendela = new Flowlayout();
   jendela.setTitle("Kelas DemoFlowLayout");
   jendela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   jendela.setSize(390, 120);
   jendela.setVisible(true);
}
}
