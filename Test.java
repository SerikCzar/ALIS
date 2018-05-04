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
}

