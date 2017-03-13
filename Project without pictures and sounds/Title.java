import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends Actor
{
    /**
     * Act - do whatever the Title wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage ok = new GreenfootImage("Res.png");
    int time;
     Start hi;
   public Title(){
       time=0;
       setImage(ok);
       ok.setTransparency(0);
    }
    public void act() 
    {
         fadeOut();
        if(time==254){
        getWorld().addObject( hi =new Start(), getWorld().getWidth()/2, (getWorld().getHeight()/2)+200);
         getWorld().addObject(new de(1),( getWorld().getWidth()/2)+200, (getWorld().getHeight()/2)+200);
         getWorld().addObject(new de(-1),( getWorld().getWidth()/2)-200, (getWorld().getHeight()/2)+200);
           getWorld(). addObject(new info(),100,800);
         time=-1;
        }
    }    
           public void fadeOut(){
      
       if(time<255&&time>=0){
            ok.setTransparency(0+time);
       time++;
    }
    }
}
