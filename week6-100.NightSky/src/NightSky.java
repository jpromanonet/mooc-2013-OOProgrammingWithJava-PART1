import java.util.*;

public class NightSky {                     // do we need "void" and "static" ?
    private double skyDensity;
    private int skyWidth;
    private int skyHeight;
    private int starsInLastPrint;

    public NightSky(double density) {
        this(density, 20, 10);
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public NightSky(double density, int width, int height) {
        this.skyDensity = density;
        this.skyWidth = width;
        this.skyHeight = height;
        this.starsInLastPrint = 0;
    }

    public void printLine() {

        for (int counter = 0; counter < this.skyWidth; counter++){       // loop it this.skyWidth many times
            Random random = new Random();
            double randNum = random.nextDouble();

            if (randNum <= this.skyDensity) {          // if random is at or below this.skyDensity, print a star

                System.out.print("*");
                this.starsInLastPrint++;      // 100.3: count a star when you print a star on this.starsInLastPrint
            } else {
                System.out.print(" ");     // white space
            }
        }
    }

    public void print() {                         // 100.2
        this.starsInLastPrint = 0;

        for (int countHigh = 0; countHigh < this.skyHeight; countHigh++) {
            this.printLine();
            System.out.println("");
        }
    }

    public int starsInLastPrint() {               // 100.3
        return this.starsInLastPrint;
    }
}