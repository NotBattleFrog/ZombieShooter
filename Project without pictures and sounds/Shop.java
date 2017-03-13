import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shop extends Actor
{
    /**
     * Act - do whatever the Shop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int gg;
public Shop(){
    gg=15;
}
    public void act() 
    {
        buy();
        gg++;
    }    
    public void buy(){

              if(Greenfoot.isKeyDown("1")&&gg>=15){
                   if(MyWorld.money>=1000){
                       getWorld().showText("Item bought!!!!" ,getWorld().getWidth()/2,getWorld().getHeight()/2);
                   MyWorld.x.dmg++;
                   MyWorld.money-=1000;
                     gg=0;
                    }
                          else{
                    getWorld().showText("Not enough money!!" ,getWorld().getWidth()/2,getWorld().getHeight()/2);
                     gg=0;
                }
        }
              if(Greenfoot.isKeyDown("2")&&gg>=15){
                   if(MyWorld.money>=500){
                       getWorld().showText("Item bought!!!!" ,getWorld().getWidth()/2,getWorld().getHeight()/2);
                   MyWorld.x.Usp.totalmag++;
                  MyWorld.money-=200;
                    gg=0;
                }
                         else{
                    getWorld().showText("Not enough money!!" ,getWorld().getWidth()/2,getWorld().getHeight()/2);
                     gg=0;
                }
        }
               if(Greenfoot.isKeyDown("3")&&gg>=15){
                   if(MyWorld.money>=200){
                       if(MyWorld.x.Med!=MyWorld.x.Medmax){
                       getWorld().showText("Item bought!!!!" ,getWorld().getWidth()/2,getWorld().getHeight()/2);
                   MyWorld.x.Med++;
                   MyWorld.money-=200;
                     gg=0;
                    }
                    else{
                         getWorld().showText("Med's storage is Full." ,getWorld().getWidth()/2,getWorld().getHeight()/2);
                     gg=0;
                    }
                    }
                          else{
                    getWorld().showText("Not enough money!!" ,getWorld().getWidth()/2,getWorld().getHeight()/2);
                     gg=0;
                }
        }
              if(Greenfoot.isKeyDown("4")&&gg>=15){
                  if(MyWorld.money>=100){
                      if(MyWorld.x.Usp.mag!=MyWorld.x.Usp.totalmag){
                      getWorld().showText("Item bought!!!!" ,getWorld().getWidth()/2,getWorld().getHeight()/2);
                     MyWorld.x.Usp.mag++;
                  MyWorld.money-=100;
                    gg=0;
                }
                else{
                     getWorld().showText("Max ammo." ,getWorld().getWidth()/2,getWorld().getHeight()/2);
                     gg=0;
                }
                }
                    else{
                    getWorld().showText("Not enough money!!" ,getWorld().getWidth()/2,getWorld().getHeight()/2);
                     gg=0;
                }
        }

    }
}
