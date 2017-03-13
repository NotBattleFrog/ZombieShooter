import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runner extends Enemy
{
    /**
     * Act - do whatever the Runner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int cpic;
       public Runner(int hp,int speed,double dd){
      super(hp,speed,dd);
       time =60;
    
        cpic=0;
    }
    public void act() 
    {
          turnTowards(MyWorld.x.getX(),MyWorld.x.getY());
      still();
        time++;
        anima();
    }    
       public void anima(){
       cpic = (cpic+1)%spit.length;
       setImage(run[cpic]);
        
    }
}
