import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

class Test {
    BufferedImage ie;
    int width;
    int height;
    private int [][] ma;
    public Test(BufferedImage io) {
        ie = io;
        width = io.getWidth();
        height = io.getHeight();
        ma = new int[height][width];
        int v=0;
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                Color c = new Color(io.getRGB(j, i));
                ma[i][j]=(c.getRed()+c.getGreen()+c.getBlue())/3;;
            }
        }
    }
    
    public boolean isBlack(int r, int c)
    {
        if(ma[r][c]<39)
            return false;
        else
            return true;
    }

    public double getPercent(int[][]m)
    {
        double a=0.0;
        ma = m;
        double b=m.length*m[0].length;
        for(int i=0;i<m.length;i++)
        {
            for(int c=0;c<m[0].length;c++)
            {
                if(isBlack(i,c))
                    a+=1.0;
            }
        }
        double ca=(a/b)*100.0;
        return ca;
    }
    public int[][] mat1(BufferedImage a)
    {

        ie = a;
        width =ie.getWidth();
        height = ie.getHeight();
                int[][] mato= new int[height][width];
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                Color c = new Color(ie.getRGB(j, i));
                if((c.getRed()+c.getGreen()+c.getBlue()/3)<39)
                mato[i][j]=0;
                else
                mato[i][j]=1;
            }
        }
        return mato;
    }
    public int getValue(int r, int c)
    {
        int v=0;
       
        
        return v;
    }
    public String toString() {
        String result = "";
        result+=Double.toString(getPercent(ma));
        /*  for(int i=0;i<mat.length;i++)
        {
        for(int c=0;c<mat[0].length;c++)
        {
        result+="Pixel RGB: " + Integer.toString(mat[i][c]) + "\n";
        }
        } */
        return result;
    }
}

