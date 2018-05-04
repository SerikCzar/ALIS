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
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
public class imgImportRunner extends JFrame
{

    public static void main(String args[]) throws IOException
    {
        String s="lossie.txt";
        lib library = new lib(s);
        BufferedImage iag=null;
        File a = null;
        a= new File("a.png");
        iag=new BufferedImage(500,560,BufferedImage.TYPE_INT_ARGB);
        iag = ImageIO.read(a);

        Pixel ii = new Pixel(library.buffer());
        Test ia = new Test(iag);
        compareTo ab = new compareTo(iag,library.buffer());

        System.out.println(ab);
    }
}
