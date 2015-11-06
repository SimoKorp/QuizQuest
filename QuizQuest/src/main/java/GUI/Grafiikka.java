/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Simo
 */
//alkutekijöissä vielä :)
public class Grafiikka extends JFrame {
//booleanit

    public boolean q1 = true;
    public boolean q2 = false;
    public boolean q3 = false;
    public boolean q4 = false;
    public boolean q5 = false;
    public boolean q6 = false;
    public boolean q7 = false;
    public boolean q8 = false;
    public boolean q9 = false;
    public boolean q10 = false;

    boolean gameStarted = false;

    //kymmenen kysymyksen quiz
    Image dbImage;
    Graphics dbg;

    Rectangle startGame = new Rectangle(300, 200, 100, 100);

    //konstruktori   
    public Grafiikka() {
        setSize(600, 400);
        setResizable(false);
        setAlwaysOnTop(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("QuizQuest_v0.001");
        setBackground(Color.BLACK);
    }

    //voidit
    public void startGame() {

    }

    public void StopGame() {

    }

    public void ResumeGame() {

    }

    @Override
    public void paint(Graphics g) {
        dbImage = createImage(getWidth(), getHeight());
        dbg = dbImage.getGraphics();
        draw(dbg);
        g.drawImage(dbImage, 0, 0, this);
    }

    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(startGame.x, startGame.y, startGame.width, startGame.height);

    }

}
