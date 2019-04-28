package com.mono;
import java.awt.Graphics;
import java.awt.Color;
import java.util.*;
public class ball extends GameObject
{
private Handler handler;
Burst burst ;
int z;
GameObject tempObject;
public ball(int x,int y,Id id,Handler handler)
{
super(x,y,id);
velx=5;
vely=5;
z=0;
this.handler=handler;
//burst=new Burst(handler);
//burst.audio();
 tempObject=handler.getObject(0);
}

public void tick()
{
x +=velx;
y +=vely;
}
public void render(Graphics g)
{
if(x>=tempObject.getX() && x<=tempObject.getX()+120 && y>=tempObject.getY() && y<=tempObject.getY()+50)
{
if(getVelx()<0)
{
this.setVelx(-5);
}
else
{
this.setVelx(5);
}
this.setVely(-5);
}
if(y<0)
{
if(getVelx()<0)
{
this.setVelx(-5);
}
else
{
this.setVelx(5);
}
this.setVely(5);
}
if(x>=990 && x<=1000 && y>=0 && y<=810)
{
this.setVelx(-5);

this.setVely((getVely()));
}
if(x>=0 && x<=10 && y>=0 && y<=810)
{
this.setVelx(5);
this.setVely(-(getVely()));
}
//burst.check(x,y,this);

g.setColor(Color.white);
g.fillOval(x,y,15,15);
}
}