import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class compareTo
{
    private boolean alpha;
    private BufferedImage io;
    //private lib library;
    private Scanner aa;
    private ArrayList<BufferedImage>jad;
    public compareTo(BufferedImage a,ArrayList cid)
    {
        io=a;
        jad=cid;
    }

    public double []ab(BufferedImage one, ArrayList cad)
    {
        io=one;
        ArrayList<BufferedImage>bf=cad;
        Pixel pi = new Pixel(cad);
        Test ti = new Test(io);

        int [][][] atom = new int[bf.size()][one.getHeight()][one.getWidth()];
        int[][]ab;
        ab=ti.mat1(io);
        int[][][]ba= pi.mat2(cad);
        double lw=one.getHeight()*one.getWidth();    

        for(int a=0;a<bf.size();a++)
        {
            for(int i=0;i<ab.length;i++)
            {
                for(int c=0;c<ab[0].length;c++)
                {
                    if(ab[i][c]==0&&ba[a][i][c]==1)
                        atom[a][i][c]=1;
                    if(ab[i][c]==1&&ba[a][i][c]==0)
                        atom[a][i][c]=1;
                    if(ab[i][c]==1&&ba[a][i][c]==1)
                        atom[a][i][c]=0;
                    if(ab[i][c]==0&&ba[a][i][c]==0)
                        atom[a][i][c]=0;
                }
            }
        }

        int checkUp=1;
        int[]art=new int[bf.size()];
        for(int p=0;p<bf.size();p++)
        {
            checkUp=0;
            for(int r=0;r<ab.length;r++)
            {
                for(int c=0;c<ab[0].length;c++)
                {
                    if(atom[p][r][c]==1)
                        art[p]=checkUp++;
                }
            }

        }

        double [] yes=new double[bf.size()];
        for(int a=0;a<bf.size();a++)
        {
            yes[a]=((art[a])/lw)*100.0;
        }

        return yes;
    }

    public String toString()
    {
        String rn="";
        double []ac=ab(io, jad);
        double max = ac[0];
        int c=0;
        for(int i=0;i<ac.length;i++)
        {
            if(ac[i]>max)
            {
                max=ac[i];
                c=i;
            }
        }
        String[]alpha = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

        return (int)ac[c]+"%\nThe letter is: "+alpha[c];
    }
}
