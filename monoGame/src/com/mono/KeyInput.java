package com.mono;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class KeyInput extends KeyAdapter
{
private Handler handler;
public KeyInput(Handler handler)
{
this.handler=handler;

}
public void keyPressed(KeyEvent e)
{
int key=e.getKeyCode();
GameObject tempObject=handler.getObject(0);
if(key==KeyEvent.VK_D)
{
tempObject.setVelx(10);
}
if(key==KeyEvent.VK_W)
{
tempObject.setVely(0);
}
if(key==KeyEvent.VK_S)
{
tempObject.setVely(0);
}
if(key==KeyEvent.VK_A)
{
tempObject.setVelx(-10);
}
}
public void keyReleased(KeyEvent e)
{
int key=e.getKeyCode();
GameObject tempObject=handler.getObject(0);
if(key==KeyEvent.VK_D)
{
tempObject.setVelx(0);
}
if(key==KeyEvent.VK_W)
{
tempObject.setVely(0);
}
if(key==KeyEvent.VK_S)
{
tempObject.setVely(0);
}
if(key==KeyEvent.VK_A)
{
tempObject.setVelx(0);
}
}
}