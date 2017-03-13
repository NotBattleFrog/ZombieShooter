import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        GreenfootImage ez = new GreenfootImage("easy.png");
     GreenfootImage no = new GreenfootImage("normal.png");
     GreenfootImage ha = new GreenfootImage("hard.png");
     static boolean chn;
     public Start(){
         chn= true;
        }
     public void act() 
    {
        if(chn){
        if(mainmenu.x==-1){
            setImage(ez); 
        }
        if(mainmenu.x==0){
              setImage(no);
        }
        if(mainmenu.x==1){
             setImage(ha); 
        }
         chn=!chn;
    }
   if(Greenfoot.mouseClicked(this)){
        getWorld().addObject(new black(),getWorld().getWidth()/2,getWorld().getHeight()/2);
    }
    }    
}
