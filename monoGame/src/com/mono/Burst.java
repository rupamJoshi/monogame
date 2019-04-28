package com.mono;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
public class Burst 
{
Handler handler;
int a,b;
int score;
GameObject ball;
GameObject bricks0;
GameObject bricks1;
GameObject bricks2;
GameObject bricks3;
GameObject bricks4;
GameObject bricks5;
GameObject bricks6;
GameObject bricks7;
GameObject bricks8;
GameObject bricks9;
GameObject bricks10;
GameObject bricks11;
GameObject bricks12;
GameObject bricks13;
GameObject bricks21;
GameObject bricks14;
GameObject bricks15;
GameObject bricks16;
GameObject bricks17;
GameObject bricks18;
GameObject bricks19;
GameObject bricks20;
GameObject bricks23;
GameObject bricks22;
GameObject bricks24;
GameObject bricks25;
GameObject bricks26;
GameObject bricks27;
GameObject bricks28;
GameObject bricks29;
GameObject bricks30;
GameObject bricks31;
GameObject bricks32;

int brick0;
int brick1;
int brick2;
int brick3;
int brick4;
int brick5;
int brick6;
int brick7;
int brick8;
int brick9;
int brick10;
int brick11;
int brick12;
int brick13;
int brick14;
int brick15;
int brick16;
int brick17;
int brick18;
int brick19;
int brick20;
int brick21;
int brick22;
int brick23;
int brick24;
int brick25;
int brick26;
int brick27;
int brick28;
int brick29;
int brick30;
int brick31;
int brick32;
Clip clip;
URL url;
AudioInputStream audioIn;
public Burst (Handler handler)
{
//score=0;

this.handler=handler;
brick0=0;
 brick1=0;
brick2=0;
 brick3=0;
brick4=0;
brick5=0;
brick6=0;
 brick7=0;
brick8=0;
 brick9=0;
brick10=0;
brick21=0;
 brick11=0;
brick12=0;
 brick13=0;
brick14=0;
brick15=0;
brick16=0;
 brick17=0;
brick18=0;
 brick19=0;
brick20=0;
brick22=0;
brick23=0;
 brick24=0;
brick25=0;
brick26=0;
brick27=0;
 brick28=0;
brick29=0;
 brick30=0;
brick31=0;
brick32=0;

bricks0=handler.getObject(1);
bricks1=handler.getObject(2);
bricks2=handler.getObject(3);
bricks3=handler.getObject(4);
bricks4=handler.getObject(5);
bricks5=handler.getObject(6);
bricks6=handler.getObject(7);
bricks7=handler.getObject(8);
bricks8=handler.getObject(9);
bricks9=handler.getObject(10);
bricks10=handler.getObject(11);
bricks21=handler.getObject(22);
bricks11=handler.getObject(12);
bricks12=handler.getObject(13);
bricks13=handler.getObject(14);
bricks14=handler.getObject(15);
bricks15=handler.getObject(16);
bricks16=handler.getObject(17);
bricks17=handler.getObject(18);
bricks18=handler.getObject(19);
bricks19=handler.getObject(20);
bricks20=handler.getObject(21);
bricks22=handler.getObject(23);
bricks23=handler.getObject(24);
bricks24=handler.getObject(25);
bricks25=handler.getObject(26);
bricks26=handler.getObject(27);
bricks27=handler.getObject(28);
bricks28=handler.getObject(29);
bricks29=handler.getObject(30);
bricks30=handler.getObject(31);
bricks31=handler.getObject(32);
bricks32=handler.getObject(33);
try
{
url = this.getClass().getClassLoader().getResource("com/resources/pacman_eatfruit.wav");
 
}
catch(Exception ex)
{
}
}
public Burst()
{
}
public void audio()
{
try
{
audioIn = AudioSystem.getAudioInputStream(url);

}catch(Exception ex)
{
}
}

public void check(int a,int b,ball ball)
{
/* try
{
clip = AudioSystem.getClip();
 
clip.open(audioIn);
}catch(Exception ex)
{
}
this.ball=ball;
int z=0;
z=ball.getVely();
if(a>=10 && a<=90 && b>=50 && b<130 && brick0==0)
{
 clip.start();
//ball.setVelx(-(ball.getVelx()));
ball.setVely(-(z));
brick0=1;
handler.removeObject(bricks0);
score++;
}
if(a>=100 && a<=180 && b>=50 && b<130 && brick1==0)
{

//ball.setVelx(-(ball.getVelx()));
ball.setVely(-(z));
brick1=1;
handler.removeObject(bricks1);
 //clip.start();
score++;
}
if(a>=200 && a<=280 && b>=50 && b<130 && brick2==0)
{
//ball.setVelx(-(ball.getVelx()));
ball.setVely(-(z));
brick2=1;
handler.removeObject(bricks2);
 //clip.start();
score++;
}
if(a>=300 && a<=380 && b>=50 && b<130 && brick3==0)
{
//ball.setVelx(-(ball.getVelx()));
ball.setVely(-(z));
brick3=1;
handler.removeObject(bricks3);
//clip.start();
score++;
}
if(a>=400 && a<=480 && b>=50 && b<130 && brick4==0 )
{
//ball.setVelx(-(ball.getVelx()));
ball.setVely(-z);
brick4=1;
handler.removeObject(bricks4);
 //clip.start();
score++;
}
if(a>=500 && a<=580 && b>=50 && b<130 && brick5==0)
{
//ball.setVelx(-(ball.getVelx()));
ball.setVely(-z);
brick5=1;
handler.removeObject(bricks5);
 //clip.start();
score++;
}
if(a>=600 && a<=680 && b>=50 && b<130 && brick6==0)
{
//ball.setVelx(-(ball.getVelx())); 
ball.setVely(-z);
brick6=1;
handler.removeObject(bricks6);
 //clip.start();
score++;
}
if(a>=700 && a<=780 && b>=50 && b<130 && brick7==0)
{
//ball.setVelx(-(ball.getVelx()));
ball.setVely(-z);
brick7=1;
handler.removeObject(bricks7);
 //clip.start();
score++;
}
if(a>=800 && a<=880 && b>=50 && b<130 && brick8==0)
{
//ball.setVelx(-(ball.getVelx()));
ball.setVely(-z);
brick8=1;
handler.removeObject(bricks8);
score++;
} 
if(a>=900 && a<=980 && b>=50 && b<130 && brick9==0)
{
//ball.setVelx(-(ball.getVelx()));
ball.setVely(-z);
brick9=1;
handler.removeObject(bricks9);
 //clip.start();
score++;
}
if(a>=550 && a<=650 && b>=50 && b<130 && brick10==0)
{
//ball.setVelx(-(ball.getVelx()));
ball.setVely(-z);
brick10=1;
handler.removeObject(bricks10);
 //clip.start();
score++;
}

if(a>=10 && a<=90 && b>=150 && b<230 && brick11==0)
{
//ball.setVelx(-(ball.getVelx()));
ball.setVely(-(z));
brick11=1;
handler.removeObject(bricks11);
 //clip.start();
score++;
}
if(a>=100 && a<=180 && b>=150 && b<230 && brick12==0)
{
//ball.setVelx(-(ball.getVelx()));
ball.setVely(-(z));
brick12=1;
handler.removeObject(bricks12);
//clip.start();
score++;
}
if(a>=200 && a<=280 && b>=150 && b<230 && brick13==0)
{
if(ball.getVelx()<0)
{
ball.setVelx(-5);
}
else
{
ball.setVelx(5);
}
ball.setVely(-(z));
brick13=1;
handler.removeObject(bricks13);
 //clip.start();
score++;
}
if(a>=300 && a<=380 && b>=150 && b<230 && brick14==0)
{
if(ball.getVelx()<0)
{
ball.setVelx(-5);
}
else
{
ball.setVelx(5);
}
ball.setVely(-(z));
brick14=1;
handler.removeObject(bricks14);
 //clip.start();
score++;
}
if(a>=400 && a<=480 && b>=150 && b<230 && brick15==0 )
{
if(ball.getVelx()<0)
{
ball.setVelx(-5);
}
else
{
ball.setVelx(5);
}
ball.setVely(-z);
brick15=1;
handler.removeObject(bricks15);
 //clip.start();
score++;
}
if(a>=500 && a<=580 && b>=150 && b<230 && brick16==0)
{
if(ball.getVelx()<0)
{
ball.setVelx(-5);
}
else
{
ball.setVelx(5);
}
ball.setVely(-z);
brick16=1;
handler.removeObject(bricks16);
 //clip.start();
score++;
}
if(a>=600 && a<=680 && b>=150 && b<230 && brick17==0)
{
if(ball.getVelx()<0)
{
ball.setVelx(-5);
}
else
{
ball.setVelx(5);
}
ball.setVely(-z);
brick17=1;
handler.removeObject(bricks17);
 //clip.start();
score++;
}
if(a>=700 && a<=780 && b>=150 && b<230 && brick18==0)
{
if(ball.getVelx()<0)
{
ball.setVelx(-5);
}
else
{
ball.setVelx(5);
}
ball.setVely(-z);
brick18=1;
handler.removeObject(bricks18);
 //clip.start();
score++;
}
if(a>=800 && a<=880 && b>=150 && b<230 && brick19==0)
{
if(ball.getVelx()<0)
{
ball.setVelx(-5);
}
else
{
ball.setVelx(5);
}
ball.setVely(4);
brick19=1;
handler.removeObject(bricks19);
 //clip.start();
score++;
} 
if(a>=900 && a<=980 && b>=150 && b<230 && brick20==0)
{
if(ball.getVelx()<0)
{
ball.setVelx(-5);
}
else
{
ball.setVelx(5);
}
ball.setVely(-z);
brick20=1;
handler.removeObject(bricks20);
 //clip.start();
score++;
}
if(a>=550 && a<=650 && b>=150 && b<230 && brick21==0)
{
if(ball.getVelx()<0)
{
ball.setVelx(-5);
}
else
{
ball.setVelx(5);
}
ball.setVely(9);
brick21=1;
handler.removeObject(bricks21);
//clip.start();
score++;
}


if(a>=10 && a<=90 && b>=250 && b<330 && brick22==0)
{
if(ball.getVelx()<0)
{
ball.setVelx(-5);
}
else
{
ball.setVelx(5);
}
ball.setVely((5));
brick22=1;
handler.removeObject(bricks22);
 //clip.start();
score++;
}
if(a>=100 && a<=180 && b>=250 && b<330 && brick23==0)
{
if(ball.getVelx()<0)
{
ball.setVelx(-5);
}
else
{
ball.setVelx(5);
}
ball.setVely((6));
brick23=1;
handler.removeObject(bricks23);

 //clip.start();
score++;
}
if(a>=200 && a<=280 && b>=250 && b<330 && brick24==0)
{
if(ball.getVelx()<0)
{
ball.setVelx(-5);
}
else
{
ball.setVelx(5);
}
ball.setVely(-(z));
brick24=1;
handler.removeObject(bricks24);
 //clip.start();
score++;
}
if(a>=300 && a<=380 && b>=250 && b<330 && brick25==0)
{
if(ball.getVelx()<0)
{
ball.setVelx(-5);
}
else
{
ball.setVelx(5);
}
ball.setVely((7));
brick25=1;
handler.removeObject(bricks25);
 //clip.start();
score++;
}
if(a>=400 && a<=480 && b>=250 && b<330 && brick26==0 )
{
if(ball.getVelx()<0)
{
ball.setVelx(-5);
}
else
{
ball.setVelx(5);
}
ball.setVely(8);
brick26=1;
handler.removeObject(bricks26);
 //clip.start();
score++;
}
if(a>=500 && a<=580 && b>=250 && b<330 && brick27==0)
{
if(ball.getVelx()<0)
{
ball.setVelx(-5);
}
else
{
ball.setVelx(5);
}
ball.setVely(-z);
brick27=1;
handler.removeObject(bricks27);
 //clip.start();
score++;
}
if(a>=600 && a<=680 && b>=250 && b<330 && brick28==0)
{
if(ball.getVelx()<0)
{
ball.setVelx(-5);
}
else
{
ball.setVelx(5);
}
ball.setVely(-z);
brick28=1;
handler.removeObject(bricks28);
 //clip.start();
score++;
}
if(a>=700 && a<=780 && b>=250 && b<330 && brick29==0)
{
if(ball.getVelx()<0)
{
ball.setVelx(-5);
}
else
{
ball.setVelx(5);
}
ball.setVely(-z);
brick29=1;
handler.removeObject(bricks29);
 //clip.start();
score++;
}
if(a>=800 && a<=880 && b>=250 && b<330 && brick30==0)
{
if(ball.getVelx()<0)
{
ball.setVelx(-5);
}
else
{
ball.setVelx(5);
}
ball.setVely(6);
brick30=1;
handler.removeObject(bricks30);
 //clip.start();
score++;
} 
if(a>=900 && a<=980 && b>=250 && b<330 && brick31==0)
{
//ball.setVelx(-(ball.getVelx()));
ball.setVely(-z);
brick31=1;
handler.removeObject(bricks31);
 //clip.start();
score++;
}
if(a>=550 && a<=650 && b>=250 && b<330 && brick32==0)
{
//ball.setVelx(-(ball.getVelx()));
ball.setVely(7);
brick32=1;
handler.removeObject(bricks32);
 //clip.start();
score++;
}*/

}
public int getScore()
{
System.out.println(this.score);
return this.score;
}
}