/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package image_processing;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class App {
    private static final String folderPath = "../image/";

    public static void main(String[] args) {
        int height = 500;
        int width = 500;

        BufferedImage image = null;
        try {
            File input_file = new File(folderPath, "blue.png");
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            image = ImageIO.read(input_file);
            System.out.println("read complete");

            int p = image.getRGB(0, 0);
            // get alpha
            int a = (p >> 24) & 0xff;

            // get red
            int r = (p >> 16) & 0xff;

            // get green
            int g = (p >> 8) & 0xff;

            // get blue
            int b = p & 0xff;

            System.out.println(p);
            System.out.println("alpha: " + a);
            System.out.println("red: " + r);
            System.out.println("green: " + g);
            System.out.println("blue: " + b);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File out = new File(folderPath, "copyed.png");
            ImageIO.write(image, "png", out);
            System.out.println("write complete");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}