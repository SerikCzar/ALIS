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
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class lib
{
    // instance variables - replace the example below with your own
    private Scanner f;
    private ArrayList<String>list = new ArrayList<String>();;
    public lib(Scanner b)
    {
        f=b;
    }

    public ArrayList<BufferedImage> choices()
    {
        ArrayList<BufferedImage> p = new ArrayList<BufferedImage>();
        BufferedImage temp=null;
        BufferedImage t=null;
        try
        {
            for(String item:list)
            {
                temp=new BufferedImage(500,560, BufferedImage.TYPE_INT_ARGB);
                temp=ImageIO.read(new File(item));
                p.add(temp);
            }
            
           /*File a=null;
           a=new File("losslessA.png");
           temp= new BufferedImage(500,560,BufferedImage.TYPE_INT_ARGB);
           temp = ImageIO.read(a);
           p.add(temp);
           File b=null;
           b=new File("losslessB.png");
           t=new BufferedImage(500,560,BufferedImage.TYPE_INT_ARGB);
           t=ImageIO.read(b);
           p.add(t);
           */
        }
        catch(IOException e)
        {
            System.out.println("error");
        }
        return p;
    }
}
