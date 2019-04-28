package com.mono;
import java.awt.Canvas;
import javax.swing.*;
import java.awt.Dimension;

public class MyWindows extends Canvas
{
public MyWindows(int width,int height,String title,GameMono game)
{
JFrame frame=new JFrame(title);
frame.setPreferredSize(new Dimension(width,height));
frame.setMaximumSize(new Dimension(width,height));
frame.setMinimumSize(new Dimension(width,height));
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setResizable(false);
frame.setLocationRelativeTo(null);
frame.add(game);
frame.setVisible(true);
game.start();
}
}