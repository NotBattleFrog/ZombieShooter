import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dead here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dead extends Animation
{
    /**
     * Act - do whatever the Dead wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  
     int pic;
     int time;
     public  Dead(int n){
         setRotation(n);
            time=0;
            pic=0;
        }
    public void act() 
    {
       ani();
       if( pic==dead.length-1){
          getWorld().removeObject(this);
        }
    } 
    public void ani(){
        pic=(pic+1)%dead.length;
        setImage(dead[pic]);
    }
    
}
