import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.io.File;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import java.awt.*;
import java.io.*;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
public class imgImportRunner extends JFrame
{
    public static void main(String args[]) throws IOException
    {
       /*JFrame frame = new JFrame("Main");
       frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
       ImageIcon ii=new ImageIcon("aupper3.jpg");
       JLabel lable = new JLabel(ii);
       JScrollPane jsp = new JScrollPane(lable);
       frame.getContentPane().add(jsp);
       frame.setSize(1000,700);
       JButton button = new JButton();
       button.setSize(new Dimension(50,50));
       button.setLocation(500,350);
       frame.getContentPane().add(button);
       frame.setVisible(true);
       */
      BufferedImage image = null;
      File f = null;
      f = new File("losslessA.png");
      
      BufferedImage iag=null;

      File a = null;
      a= new File("losslessA.png");
      
      image = new BufferedImage(500,560, BufferedImage.TYPE_INT_ARGB);
      iag=new BufferedImage(500,560,BufferedImage.TYPE_INT_ARGB);
      image = ImageIO.read(f);
      iag = ImageIO.read(a);
      
      Pixel ii = new Pixel(image);
      Test ia = new Test(iag);
      //compareTo ab = new compareTo(image, iag);
      
      System.out.println(ia + "\n" + ii);
    }
}
