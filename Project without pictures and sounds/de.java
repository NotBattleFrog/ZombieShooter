import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class de here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class de extends Actor
{
    /**
     * Act - do whatever the de wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int n;
    GreenfootImage left = new GreenfootImage("left.png");
     GreenfootImage right = new GreenfootImage("right.png");

     
    public de(int n){
        this.n=n;
        if(n==1){
          setImage(right);  
        }
         if(n==-1){
          setImage(left);  
        }
        
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)&&mainmenu.x!=n){
           mainmenu.gg.hi.chn = true;
            mainmenu.x+=n;
        }
    }       
}
