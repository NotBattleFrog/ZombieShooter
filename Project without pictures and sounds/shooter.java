import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shooter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shooter extends Actor
{
    /**
     * Act - do whatever the shooter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int damage;
    int speed;
    public shooter(int damage,int speed,int rotate){
        setRotation(rotate);
      this.damage = damage;
        this.speed = speed;
       
    }
    public void act(){
        action();
        try{
        checkHit();
    }
    catch(IllegalStateException e){
        
    }
        

    }
    public void action(){
           move(speed);
        if(isAtEdge()){
           getWorld().removeObject(this);
        }
    }
       private void checkHit()
    {
        Enemy enemy = (Enemy) getOneIntersectingObject(Enemy.class);
        if (enemy != null||isAtEdge()){
            getWorld().removeObject(this);
            enemy.hit(damage);
        }
    }

}
