import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class black here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class black extends Actor
{
    /**
     * Act - do whatever the black wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        GreenfootImage fade = new GreenfootImage("black.png");
        int time;
        public black(){
            setImage(fade);
            fade.setTransparency(0);
            time=0;
        }
    public void act() 
    {
        fadeOut();
        if(fade.getTransparency()>=255){
                    ((mainmenu)getWorld()).stop();
         Greenfoot.setWorld(new MyWorld(mainmenu.x));
         getWorld().removeObject(this);
        }
    }    
    
            public void fadeOut(){
       fade.setTransparency(0+time);
       time++;
    }
}
