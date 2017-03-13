import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spitter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spitter extends Enemy
{
    /**
     * Act - do whatever the Spitter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int de;
    int cpic;
         public Spitter(int hp,int speed,double dd){
      super(hp,speed,dd);
       time =60;
   
        cpic=0;
        setImage(pic[cpic]);
       de=120;
    }
    public void act() 
    {
           turnTowards(MyWorld.x.getX(),MyWorld.x.getY());
      still();
        time++;
        if(de>=120){
        spit();
        de=0;
    }
    anima();
    de++;
    }    
    public void spit(){
        getWorld().addObject(new goo(getRotation()),getX(),getY());
    }
           public void anima(){
       cpic = (cpic+1)%spit.length;
       setImage(spit[cpic]);
        
    }
}
