import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NightSky night;

        System.out.println("How wide?");
        int width = Integer.parseInt(input.nextLine());

        System.out.println("How high?");
        int height = Integer.parseInt(input.nextLine());

        System.out.println("What density percentage?");
        double density = Double.parseDouble(input.nextLine());

        night = new NightSky(density, width, height);
        night.print();
    }
}