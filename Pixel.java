import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
class Pixel {

    int width;
    int height;
    private int [][][] mat;
    private ArrayList<BufferedImage>ba;
    public Pixel(ArrayList a) {
        ba=a;
        ArrayList<BufferedImage>alp=a;
        width = 500;
        height = 560;
        mat = new int[alp.size()][height][width];
        for(int ji=0;ji<alp.size();ji++)
        {
            for(int i=0; i<height; i++){
                for(int j=0; j<width; j++){
                    Color c = new Color(alp.get(ji).getRGB(j, i));
                    mat[ji][i][j]=(c.getRed()+c.getGreen()+c.getBlue())/3;;
                }
            }
        }
    }

    public boolean isBlack(int p, int r, int c)
    {
        if(mat[p][r][c]<39)
            return true;
        else
            return false;
    }

    public int[][][] mat2(ArrayList baj)
    {

        ArrayList<BufferedImage> alpha = baj;

        width =500;
        height = 560;
        int[][][] mato= new int[alpha.size()][height][width];
        for(int al=0;al<alpha.size();al++)
        {
            for(int i=0; i<height; i++){
                for(int j=0; j<width; j++){
                    Color c = new Color(alpha.get(al).getRGB(j, i));
                    if((c.getRed()+c.getGreen()+c.getBlue()/3)<39)
                        mato[al][i][j]=1;
                    else
                        mato[al][i][j]=0;
                }
            }
        }
        return mato;
    }
}

