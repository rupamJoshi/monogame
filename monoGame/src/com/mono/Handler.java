package com.mono;
import java.awt.Graphics;
import java.util.LinkedList;
public  class Handler
{
LinkedList<GameObject> object=new LinkedList<GameObject>();
public void tick()
{
for(int i=0;i<object.size();i++)
{
GameObject tempObject=object.get(i);
tempObject.tick();
}
}
public void render(Graphics g)
{
for(int i=0;i<object.size();i++)
{
GameObject tempObject=object.get(i);
tempObject.render(g);
}
}
public void addObject(GameObject object)
{
this.object.add(object);
}
public void removeObject(GameObject object)
{
this.object.remove(object);
}
public GameObject getObject(int i)
{
//System.out.println(object.size());
return object.get(i);
}
public int getSize()
{
return object.size();
}
}