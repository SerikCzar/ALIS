import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

class Pixel {
    BufferedImage image;
    int width;
    int height;
    private int [][] mat;
    public Pixel(BufferedImage io) {
        image = io;
        width = io.getWidth();
        height = io.getHeight();
        mat = new int[height][width];
        int v=0;
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                Color c = new Color(io.getRGB(j, i));
                mat[i][j]=(c.getRed()+c.getGreen()+c.getBlue())/3;;
            }
        }
    }
    public int getC()
    {
        return mat.length;
    }
    public int getR()
    {
        return mat[0].length;
    }
    public boolean isBlack(int r, int c)
    {
        if(mat[r][c]<39)
            return true;
        else
            return false;
    }

    public double getPercent(int[][]m)
    {
        double a=0.0;
        mat = m;
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
    public int[][] mat2(BufferedImage d)
    {
        image = d;
        width =image.getWidth();
        height = image.getHeight();
        int[][] mato= new int[height][width];
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                Color c = new Color(image.getRGB(j, i));
                if((c.getRed()+c.getGreen()+c.getBlue()/3)<39)
                mato[i][j]=1;
                else
                mato[i][j]=0;
            }
        }
        return mato;
    }
    public String toString() {
        String result = "";
        result+=Double.toString(getPercent(mat));
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

