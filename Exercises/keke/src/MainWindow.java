import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Main window class
 * @author Vasya Pupkin
 */
public class MainWindow extends JFrame {

    private View view;

    public MainWindow()
    {
        try
        {
            setSize(800, 600);
            setLocationByPlatform(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            view = new View();
            JScrollPane pane = new JScrollPane(view);
            add(pane);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

}
