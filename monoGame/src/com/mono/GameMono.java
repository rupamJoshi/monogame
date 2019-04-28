package com.mono;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
 public class GameMono extends Canvas implements Runnable
{
public static final int WIDTH=1000, HEIGHT=WIDTH/12*9;
private Thread thread;
private Boolean running;
private Handler handler;
private Random r;
Clip clip2;
URL url2;
AudioInputStream audioIn2;
public GameMono()
{
r=new Random();
handler=new Handler();
new MyWindows(WIDTH,HEIGHT,"A Game",this);
this.addKeyListener(new KeyInput(handler));
handler.addObject(new Player(45,450,Id.player));
handler.addObject(new ball(35,430,Id.ball,handler));
handler.addObject(new Bricks(10,50,Id.bricks,handler,Color.yellow));
handler.addObject(new Bricks(100,50,Id.bricks,handler,Color.red));
handler.addObject(new Bricks(200,50,Id.bricks,handler,Color.green));
handler.addObject(new Bricks(300,50,Id.bricks,handler,Color.yellow));
handler.addObject(new Bricks(400,50,Id.bricks,handler,Color.white));
handler.addObject(new Bricks(500,50,Id.bricks,handler,Color.blue));
handler.addObject(new Bricks(600,50,Id.bricks,handler,Color.red));
handler.addObject(new Bricks(700,50,Id.bricks,handler,Color.orange));
handler.addObject(new Bricks(800,50,Id.bricks,handler,Color.blue));
handler.addObject(new Bricks(900,50,Id.bricks,handler,Color.yellow));
handler.addObject(new Bricks(1000,50,Id.bricks,handler,Color.white));
handler.addObject(new Bricks(10,150,Id.bricks,handler,Color.yellow));
handler.addObject(new Bricks(100,150,Id.bricks,handler,Color.red));
handler.addObject(new Bricks(200,150,Id.bricks,handler,Color.green));
handler.addObject(new Bricks(300,150,Id.bricks,handler,Color.yellow));
handler.addObject(new Bricks(400,150,Id.bricks,handler,Color.white));
handler.addObject(new Bricks(500,150,Id.bricks,handler,Color.blue));
handler.addObject(new Bricks(600,150,Id.bricks,handler,Color.red));
handler.addObject(new Bricks(700,150,Id.bricks,handler,Color.orange));
handler.addObject(new Bricks(800,150,Id.bricks,handler,Color.blue));
handler.addObject(new Bricks(900,150,Id.bricks,handler,Color.yellow));
handler.addObject(new Bricks(1000,150,Id.bricks,handler,Color.white));
handler.addObject(new Bricks(10,250,Id.bricks,handler,Color.yellow));
handler.addObject(new Bricks(100,250,Id.bricks,handler,Color.red));
handler.addObject(new Bricks(200,250,Id.bricks,handler,Color.green));
handler.addObject(new Bricks(300,250,Id.bricks,handler,Color.yellow));
handler.addObject(new Bricks(400,250,Id.bricks,handler,Color.white));
handler.addObject(new Bricks(500,250,Id.bricks,handler,Color.blue));
handler.addObject(new Bricks(600,250,Id.bricks,handler,Color.red));
handler.addObject(new Bricks(700,250,Id.bricks,handler,Color.orange));
handler.addObject(new Bricks(800,250,Id.bricks,handler,Color.blue));
handler.addObject(new Bricks(900,250,Id.bricks,handler,Color.yellow));
handler.addObject(new Bricks(1000,250,Id.bricks,handler,Color.white));
try
{
url2= this.getClass().getClassLoader().getResource("com/resources/got.wav");
audioIn2 = AudioSystem.getAudioInputStream(url2);
clip2= AudioSystem.getClip();
clip2.open(audioIn2);
clip2.start();
}catch(Exception e)
{
}
}
public synchronized void start()
{
thread=new Thread(this);
thread.start();
//System.out.println("start");
running=true;
}
public synchronized void stop()
{
try
{
thread.join();
running=false;
}
catch(Exception ex)
{
System.out.println("failed");
}
}
public void run()
{
long lastTime=System.nanoTime();
double amountOfTicks=0.0060;
double ns =1000000000/ amountOfTicks;
double delta =0;
long timer=System.currentTimeMillis();
int frames=0;
while(running)
{
long now =System.nanoTime();
delta +=(now -lastTime)/ns;
while(delta>=1)
{
tick();
delta--;
}
if(running)
{ 
render();
}
frames++;
if(System.currentTimeMillis()-timer>1000)
{
timer +=1000;
//System.out.println(frames);
frames=0;
}
}
stop();
}
private void render()
{
BufferStrategy bs=this.getBufferStrategy();
if(bs==null)
{
this.createBufferStrategy(4);
return;
}
Graphics g=bs.getDrawGraphics();
g.setColor(Color.black);
g.fillRect(0,0,WIDTH,HEIGHT);
g.setColor(Color.white);
g.fillRect(990,0,10,800);
g.setColor(Color.white);
g.fillRect(0,0,0,800);
g.setColor(Color.white);
g.fillRect(0,500,1000,10);
Font currentFont = g.getFont();
Font newFont = currentFont.deriveFont(currentFont.getSize() * 5F);
g.setFont(newFont);
g.setColor(Color.yellow);
g.drawString("BREAKOUT",260,600);
g.drawString("SCORE - ",250,700);
g.drawString(String.valueOf(35-handler.getSize()),550,700);
handler.render(g);

g.dispose();
bs.show();
}
private void tick()
{
handler.tick();
}
}