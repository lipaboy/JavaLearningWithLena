

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.*;

public class View extends JPanel {

    Plotter pl;

    private static final int COORDINAT1 = 100;
    private static final int COORDINAT2 = 100;
    private static final int SIZE1 = 50;
    private static final int SIZE2 = 200;
    private static final Color color1 = Color.BLUE;




//    public View (int x, int y, int t, int z, Color color) {
//        x = COORDINAT1;
//        y = COORDINAT2;
//        t = SIZE1;
//        z = SIZE2;
//        color = color1;
//    }

    public View() throws Exception {
        super();
        pl = new Plotter();
        // advice: don't forget about repaint() and revalidate()



        MouseAdapter m = new MouseAdapter() {

            @Override
            public void mouseDragged(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {

                // 1) Нарисовать линию длиной 100 пикселей (горизонтально)

                // 2) Нарисовать прямоугольник
                int n = COORDINAT1;
                int s = COORDINAT2;
                drawRect(50, 50,200, 200, Color.BLUE);
                drawRect(50 + 200,50 + 200, 200, 200, Color.GREEN);

            }

        };
        addMouseListener(m);
        addMouseMotionListener(m);
    }

    public void drawRect (int x, int y, int width, int height, Color color){

        int t = x;

        for(int i = 0; i < height ;i++) {
            for (int j = 0; j < width ;j++) {
                pl.draw(x, y, color);
                x++;
                repaint();
            }
            y++;
            x = t;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        g.drawImage(pl.getImage(), 0, 0, pl.getImage().getWidth(), pl.getImage().getHeight(),
                0, 0, pl.getImage().getWidth(), pl.getImage().getHeight(), null);
    }
    }