import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GG extends Actor
{
    /**
     * Act - do whatever the GG wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int n;
    GreenfootImage ammo = new GreenfootImage("sniper.png");
       GreenfootImage mag = new GreenfootImage("As.png");
       GreenfootImage med = new GreenfootImage("medkit.png");
       GreenfootImage Mo = new GreenfootImage("Mon.png");
          GreenfootImage cl = new GreenfootImage("clock.png");
              GreenfootImage he = new GreenfootImage("Hea.png");
    public GG(int n){
        if(n==1){
            setImage(ammo);
        }
         if(n==2){
             setImage(mag);
    }
    if(n==3){
        setImage(med);
    }
     if(n==4){
        setImage(Mo);
    }
         if(n==5){
        setImage(cl);
    }
    if(n==6){
        setImage(he);
    }
}
    public void act() 
    {
       getWorld().showText("X "+  MyWorld.x.Usp.bull+"/"+MyWorld.x.Usp.totalbull,1425,800); 
        getWorld().showText("X "+  MyWorld.x.Usp.mag+"/"+MyWorld.x.Usp.totalmag,1050,800);
         getWorld().showText("X "+  MyWorld.x.Hp+"/"+MyWorld.x.Fullhp,150,800);
       getWorld().showText("X "+ MyWorld.x.Med+"/"+MyWorld.x.Medmax ,330,55);
            getWorld().showText("X "+ MyWorld.money,490,55);
             getWorld().showText(": "+ (30-(MyWorld.time/60)),670,55);
    }    
}
