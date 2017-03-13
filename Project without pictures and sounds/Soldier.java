import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Soldier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Soldier extends Actor
{
    /**
     * Act - do whatever the Soldier wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  int Hp ;
  int Fullhp;
    int speed;
    int delay;
    int rel;
    int dmg;
     int time;
     int in;
     int gg;
     int Med;
     int Medmax;
     int hh;
     boolean still = false;
     boolean re = false;
     boolean ggg;
    Gun Usp ;
    MouseInfo   mo;
   GreenfootSound walk1 = new GreenfootSound("footstep1.mp3");
   GreenfootSound walk2 = new GreenfootSound("footstep3.mp3");
      GreenfootSound bl = new GreenfootSound("hit.mp3");
   GreenfootImage pl = new GreenfootImage("player.png");
     int step;
    public Soldier(int Hp,int speed,int Med){
        this.Hp = Fullhp=Hp;
        
         this.speed = speed;
          this.Med = Med;
            setImage(pl);
            ggg=false;
          Medmax=4;
         step=1;
         rel=180;
         time=0;
         dmg=1;
         in = 180;
         gg=120;
          walk1.setVolume(80);
           walk2.setVolume(80);
          try{
          getWorld().addObject( Usp =new Gun(5,12,12,5),getX(),getY());
        }catch(IllegalStateException e){
            
        }
    }
    public void act() 
    {
             getWorld().showText("Dmg "+ dmg ,1300,760);

              if(!ggg){
                fire();
                Movekey();
                getHit();
                inv();
                rel++;
            in++;
            gg++;
        }
    }   
       public void getHit(){
           if(isTouching(Enemy.class)|isTouching(goo.class)&&in>=60){
               bl.play();
               Hp--;
               in=0;
               gg=0;
            }
        if(Hp<=0){
               ((MyWorld)getWorld()).Gameover();
        }
    }
    public void inv(){
        if(gg<=60){
            if(gg%5==0){
        pl.setTransparency(255);
    }
    else {
          pl.setTransparency(0);
        }
        }
    }
    public void useMed(){
        if(Med!=0&&Hp!=Fullhp){
            Hp++;
            Med--;
        }
    }

    public void Movekey(){
        if(Greenfoot.isKeyDown("w")){
            checkStep();
            setLocation(getX(), getY() - speed);
            step++;
        }
        if(Greenfoot.isKeyDown("s")){
               checkStep();
            setLocation(getX(), getY() + speed);
     step++;
          
        }
        if(Greenfoot.isKeyDown("a")){
            checkStep();
            setLocation(getX() -speed , getY());
               step++;
   
        }

        if(Greenfoot.isKeyDown("d")){
         checkStep();
            setLocation(getX() + speed, getY());
               step++;
            }
        
        if(Greenfoot.isKeyDown("r")){
           if(rel/60>=1){
            Usp.reload();
            rel=0;
        }
        }
               if(Greenfoot.isKeyDown("q")){
                   if(Med>0&&rel/60>=1){
                   useMed();
                   rel=0;
                }
            }

}

    public void checkStep(){
        if(step==1){
            walk1.play();
        }
        else{
             walk2.play();
        }
        if(step>2){
            step =1;
        }
    }
    public void fire(){
          mo = Greenfoot.getMouseInfo(); 
        if(mo!=null){
             turnTowards(mo.getX(),mo.getY());
        if(mo.getButton()==1&&Greenfoot.mousePressed(null)){
            Usp.Fire();
            if(Usp.bull>0){
            shooter gg;
            getWorld().addObject(gg =new shooter(dmg,100,getRotation()),getX(),getY());
    }
}
        
    }
}

}
