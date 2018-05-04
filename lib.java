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
    private Scanner f;
    private String s;
    private ArrayList<String>list;

    public lib (String n) throws IOException
    {
        s=n;
    }

    public ArrayList<String>lister(String n) throws IOException
    {
        s=n;
        Scanner gi = new Scanner(new File(n));
        ArrayList<String>list = new ArrayList<String>();
        int count=gi.nextInt();
        gi.nextLine();
        for(int i=0;i<count;i++)
        {
            String sen = gi.nextLine();
            list.add(sen);
        }
        gi.close();

        return list;
    }

    public ArrayList<BufferedImage>buffer() throws IOException
    {
        ArrayList<String>g=lister(s);
        ArrayList<BufferedImage>bi = new ArrayList<BufferedImage>();
        try{
            for(int i=0;i<g.size();i++)
            {
                File path=new File(g.get(i));
                BufferedImage temp=new BufferedImage(500,560, BufferedImage.TYPE_INT_ARGB);
                temp=ImageIO.read(path);
                bi.add(temp);
            }
        } catch(IOException e)
        {
            System.out.println("error");
        }
        return bi;
    }
}
