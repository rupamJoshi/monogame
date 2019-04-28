package com.mono;
import java.awt.Graphics;
import java.awt.Color;
import java.util.*;
public class Player extends GameObject
{
private Random r=new Random();
public Player(int x,int y,Id id)
{
super(x,y,id);
velx=0;
vely=0;
}
public void tick()
{
x +=velx;
y +=vely;
}
public void render(Graphics g)
{
if(x>=990 && x<=1000 && y>=0 && y<=810)
{
//this.setVelx(0);
//this.setVely(0);
}
if(x>=0 && x<=10 && y>=0 && y<=810)
{
//this.setVelx(0);
//this.setVely(0);
}
g.setColor(Color.white);
g.fillRect(x,y,150,20);
}
}