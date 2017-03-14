import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gun extends Actor
{
    /**
     * Act - do whatever the Bullets wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
   static int mag;
    int totalmag;
    int bull;
   static int totalbull;
    public Gun(int mag,int bull,int totalbull,int totalmag){
         this.mag=mag;
          this.bull=bull;
           this.totalbull=totalbull;
           this.totalmag=totalmag;
    }// dd your action code here.
    public void reload(){
        if(bull!=totalbull&&mag>0){
            bull=totalbull;
            mag--;
            Greenfoot.playSound("Reload.wav");
        }
        else{
             Greenfoot.playSound("off.mp3");
        }
    }
    public void Fire(){
        if(bull>0){
            Greenfoot.playSound("shot.wav");
           bull--;   
        }
        else{
         Greenfoot.playSound("Nob.mp3"); 
        }
    }
   
    }    

