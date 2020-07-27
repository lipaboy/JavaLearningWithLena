

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

    View() throws Exception {
        super();
        pl = new Plotter();
        // advice: don't forget about repaint() and revalidate()

        MouseAdapter m = new MouseAdapter() {

            @Override
            public void mouseDragged(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                pl.draw(1 , 1, Color.RED);
                repaint();
            }
        };
        addMouseListener(m);
        addMouseMotionListener(m);
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
