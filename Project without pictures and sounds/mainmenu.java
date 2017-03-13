import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mainmenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainmenu extends World
{

    /**
     * Constructor for objects of class mainmenu.
     * 
     */
    static GreenfootSound creep = new GreenfootSound("L4d2.wav");
    static Title gg;
    static int x;

    public mainmenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 850, 1); 

  addObject(gg =new Title(),getWidth()/2,(getHeight()/2)-100);

        creep.setVolume(50);
        x=0;
    }


    public void started(){
      
        creep.playLoop();
    }

    public void stop(){
        creep.stop();
    }


    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
}
