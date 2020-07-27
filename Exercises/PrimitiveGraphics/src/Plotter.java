
import java.awt.*;
import java.awt.image.BufferedImage;
import java.nio.Buffer;
import java.util.Stack;

/**
 * Created by 1 on 16.02.2017.
 */
public class Plotter {

    BufferedImage image;

    Plotter() {
        this.image = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = image.createGraphics();
        g.setBackground(Color.WHITE);
        g.clearRect(0, 0, image.getWidth(), image.getHeight());
    }

    void draw(int x, int y, Color color) {
        image.setRGB(x, y, color.getRGB());
    }

    BufferedImage getImage() {
        return image;
    }


}


