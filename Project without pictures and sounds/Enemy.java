import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Animation
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int hp;
    int speed;
    int time;
    int cpic;
     int no;
    static double dd;
    public Enemy(int hp,int speed,double dd){
       this.hp = hp;
       this.speed = speed;
       this.dd = dd;
       time =60;
       cpic=0;
       no = 30;
    }
    public void act() 
    {
        turnTowards(MyWorld.x.getX(),MyWorld.x.getY());

    still();
     anima();
        time++;
      
    }   
    public void still(){
                if(no>=30){
        move(speed);
    }
          no++;
    }
    public void hit(int damage){
        hp = hp - damage;
        if(hp<=0){
                  if(Math.random()<dd){
              getWorld().addObject(new SupplyCrate(),getX(),getY());
            }
             getWorld().addObject(new Dead(getRotation()),getX(),getY());
              MyWorld.score+=100;
        getWorld().removeObject(this);
        MyWorld.money+=MyWorld.drop;
    
    }
}
   public void anima(){
       cpic = (cpic+1)%pic.length;
       setImage(pic[cpic]);
    }
 

}
