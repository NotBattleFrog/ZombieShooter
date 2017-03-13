import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SupplyCrate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SupplyCrate extends Actor
{
    /**
     * Act - do whatever the SupplyCrate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int a;
    int b;
    public void act() 
    {
        if(isTouching(Soldier.class)&&MyWorld.x.Usp.mag<MyWorld.x.Usp.totalmag){
            MyWorld.x.Usp.mag+=  1;
            getWorld().removeObject(this);
        }
    }    
}
