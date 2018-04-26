import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.io.File;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class MazeR
{
    private boolean[][] bMatrix;
    private int [][] iMatrix;
    public MazeR(BufferedImage bi) {
        BufferedImage file = new BufferedImage(new File(bi));
        int rows = file.getHeight();
        int cols = bi.getWidth();
        bMatrix = new boolean[rows][cols];
        iMatrix = new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int c=0;c<cols;c++)
            {
                iMatrix[i][c]=bi.getRGB(c,i);
            }
        }
        for(int ab=0;ab<rows;ab++)
        {
            for(int ba=0;ba<cols;ba++)
            {
                if(iMatrix[ab][ba]==-1) {
                    bMatrix[ab][ba]=false;
                } else {
                    bMatrix[ab][ba]=true;
                }
            }
        }
    }
    public String toString() {
        String result = "";
        for(int ab=0;ab<bMatrix.length;ab++)
        {
            for(int ba=0;ba<bMatrix[0].length;ba++)
            {
                if(bMatrix[ab][ba]==true)
                    result+="1";
                 else 
                    result+="0";
                result+="\n";
            }
        }
        return result;
    }
}
