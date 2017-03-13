import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class goo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class goo extends Actor
{
    /**
     * Act - do whatever the goo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int time;
    boolean ok;
    public goo(int n){
        setRotation(n);
        time = 0;
        ok=true;
    }
    public void act() 
    {
         splash();
        remove();
        if(ok){
            move(10);
        }
    time++;
    }  
    public void remove(){
         if(time/60>=2){
            getWorld().removeObject(this);
        } 
    }
    public void splash(){
              if(time/60>=1||isTouching(Soldier.class)||isAtEdge()){
            setImage("oklol.png");
            ok=false;
        } 
                  
    }
}
