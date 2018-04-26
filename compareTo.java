import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
public class compareTo
{

    private boolean alpha;
    private BufferedImage io;
    private BufferedImage ib;
    public compareTo(BufferedImage a, BufferedImage b)
    {
        io=a;
        ib=b;
    }

    public double ab(BufferedImage one, BufferedImage two)
    {
        io=one;
        ib=two;
        Pixel pi = new Pixel(io);
        Test ti = new Test(ib);
        int [][] atom = new int[one.getHeight()][one.getWidth()];
        int[][]ab;
        ab=new int[io.getHeight()][io.getWidth()];
        int[][]ba= pi.mat2(ib);
        for(int i=0;i<atom.length;i++)
        {
            for(int c=0;c<atom[0].length;c++)
            {
                if(ab[i][c]==0&&ba[i][c]==1)
                    atom[i][c]=1;
                if(ab[i][c]==1&&ba[i][c]==0)
                    atom[i][c]=1;
                if(ab[i][c]==1&&ba[i][c]==1)
                    atom[i][c]=0;
                if(ab[i][c]==0&&ba[i][c]==0)
                    atom[i][c]=0;
            }
        }
        double adder=0;
        for(int r=0;r<atom.length;r++)
        {
            for(int c=0;c<atom[0].length;c++)
            {
                if(atom[r][c]==1)
                    adder++;
            }
        }
        double tot = (adder/atom.length*atom[0].length)*100.0;
        return tot;
    }

    public String toString()
    {
        String rn="";
        

        return rn+Double.toString(ab(io, ib));
    }
}
