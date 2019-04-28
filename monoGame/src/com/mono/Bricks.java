package com.mono;
import java.awt.Graphics;
import java.awt.Color;
import java.util.*;
import java.awt.Font;
import java.io.*;
import java.net.URL;

import javax.sound.sampled.*;
public class Bricks extends GameObject
{
Handler handler;
Clip clip;

URL url;

AudioInputStream audioIn;

Color color;
int a,b;
int z;
GameObject ball;
GameObject bricks;
Burst burst;
Font font;
int score;
public Bricks (int x,int y,Id id,Handler handler,Color color)
{
super(x,y,id);
this.color=color;
velx=0;
vely=0;
a=0;
b=0;
z=0;
score=0;
burst=new Burst();
ball=handler.getObject(1);
color=Color.white;
this.handler=handler;
try
{
url = this.getClass().getClassLoader().getResource("com/resources/pacman_eatfruit.wav");
audioIn = AudioSystem.getAudioInputStream(url);
clip = AudioSystem.getClip();
clip.open(audioIn);
}
catch(Exception ex)
{
}
}
public void tick()
{
x +=velx;
y +=vely;
a=ball.getX();
b=ball.getY();

z=ball.getVely();
if(a>=x && a<=x+80 && b>=y && b<=y+80)
{
ball.setVely(-(z));
clip.start();
handler.removeObject(this);
}
}
public void render(Graphics g)
{

g.setColor(color);
g.fill3DRect(x,y,70,80,false);

}
}