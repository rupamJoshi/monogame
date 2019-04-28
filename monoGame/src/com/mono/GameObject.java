package com.mono;
import java.awt.Graphics;
public abstract class GameObject
{
protected int x,y;
protected Id id;
protected int velx,vely;
public GameObject(int x, int y, Id id)
{
this.x=x;
this.y=y;
this.id=id;
}
public abstract  void tick();
public abstract void render(Graphics g);
public void setX(int x)
{
this.x=x;
}
public int getX()
{
return x;
}
public void setY(int y)
{
this.y=y;
}
public int getY()
{
return y;
}
public void setId(Id id)
{
this.id=id;
}
public Id getId()
{
return id;
}
public void setVelx(int velx)
{
this.velx=velx;
}
public int getVelx()
{
return velx;
}
public void setVely(int vely)
{
this.vely=vely;
}
public int getVely()
{
return vely;
}
}