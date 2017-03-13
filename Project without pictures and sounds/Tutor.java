import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutor extends World
{

    /**
     * Constructor for objects of class Tutor.
     * 
     */
    GreenfootImage t1 = new GreenfootImage("tu.jpg");
   GreenfootImage t2 = new GreenfootImage("t2.png");
   int j;
   boolean k;
    public Tutor()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
    super(1500, 850, 1); 
    addObject(new main(),1300,100);
    setBackground(t1);
    j=30;
    k=true;
    }
    public void act(){
        if(j>=30){
          if(Greenfoot.mouseClicked(null)){
          k=!k;   
               if(!k){
                   setBackground(t2);
                }
                if(k){
                   setBackground(t1); 
                }
            }
           
        }
        j++;
    }
}
