import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Animation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animation extends Actor
{
    /**
     * Act - do whatever the Animation wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static GreenfootImage pic [] = new GreenfootImage[8];
     static GreenfootImage run [] = new GreenfootImage[8];
    static GreenfootImage spit [] = new GreenfootImage[8];
     static GreenfootImage dead [] = new GreenfootImage[5];
        public void set(){
             for(int i=0;i<pic.length;i++){
           pic[i]=new GreenfootImage("walk"+(i*2)+".png");
        }
           for(int i=0;i<run.length;i++){
          run[i] = new GreenfootImage(i+".png");
        }
                 for(int i=0;i<spit.length;i++){
           spit[i] = new GreenfootImage("saunter"+(i*2)+".png");
        }
                 for(int i=0;i<dead.length;i++){
             dead[i] = new GreenfootImage("death02_000"+(i*2)+".png");
            }
    }
}
