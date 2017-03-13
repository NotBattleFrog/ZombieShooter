import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
 
    int X[] = {0,1500};
    int Y[] = {0,850};
             int a[] = {1300,1000,250,430,600,80};
         int b[] ={800,800,55,55,55,800};
    static int time;
    int shop;
    int wve;
    int nextW;
    int Hp;
    int Speed;
    int spti;
    int leve;
    double chn;
    int gain;
    static boolean red;
     Shop kk ;
 static Soldier x;
 static int money;
 static int drop;
 static int score;
 GreenfootSound dead = new GreenfootSound("dead.mp3");
  GreenfootSound inc = new GreenfootSound("horde.mp3");
    GreenfootSound zs = new GreenfootSound("zs.mp3");
    public MyWorld(int diff)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 850, 1); 

        red = true;
        spti = 0;
        score=0;
          time=0;
        wve =1;
         nextW=0;
         shop=0;
         money=0;
         check(diff);
         leve = diff;
         addObject(new main(),1200,55);
          addObject(new Restart(),1400,55);
          new Animation().set();
          
               for(int i =0;i<a.length;i++){
         addObject(new GG(i+1),a[i],b[i]);
        }
                    } 
    
    public void act(){
          Nextw(gain);
           showText("Wave  "+wve,850,55);
    }
        public void Gameover(){
            dead.play();
            x.setImage("blood.png");
            x.ggg = true;
            if(getObjects(ScoreBoard.class).isEmpty()){
            addObject(new ScoreBoard(score),getWidth()/2,getHeight()/2);
        }
        }
    
    public void wave(int n){
        if(time/60<30){
           if(getObjects(Enemy.class).isEmpty()&&time/60<30){
            spwnMelee(n);
            
        }
        if(time%240==0){
             // zs.play();
        }
        Supp();
        time++;
       spti++;
    
    }
    else{
            spti=0;
       if(getObjects(Enemy.class).isEmpty()){
                         showText("Shop time  "+(shop/60),500,250);
           show();
           shop++; 
        }
                      showText("",500,250);
    } 
    }
    
    public void show(){   
        if(getObjects(Shop.class).isEmpty()){
               x.Hp = x.Fullhp;
            addObject(kk = new Shop(),100,500); 
        }
               if(shop/60>=10){
                    removeObject(kk);
                    shop=0;
                    time=0;
                    wve++;
                 
                    red=true;
                }    
    }
    
    public void Nextw(int n){
        if(red){
        if(nextW<=120){
             showText("Wave "+wve+" Incoming." ,getWidth()/2,getHeight()/2);
             inc.play();
        }
        else{
               showText(" " ,getWidth()/2,getHeight()/2);
          
            red=false;
             nextW=0; 
        }
          nextW++;
    }
    else{
          wave(n);
    }
        
      
    }
    
    
    public void spwnMelee(int n){
    int s = wve+n%2;
    int r = wve+n/2;
        for(int i=0;i<n;i++){
        addObject(new Enemy(wve+Hp,wve+Speed,chn),X[Greenfoot.getRandomNumber(2)],100+((i+1)*200));
    }
    for(int i=0;i<r;i++){
         addObject(new Runner(wve+Hp-1,wve+Speed+2,chn),X[Greenfoot.getRandomNumber(2)],100+Greenfoot.getRandomNumber(850));
        }
        for(int i=0;i<s;i++){
         addObject(new Spitter(wve+Hp-1,wve+Speed-1,chn),(getWidth()/2)+Greenfoot.getRandomNumber(100),Y[Greenfoot.getRandomNumber(2)]);
        }
    }
    
    public void Supp(){
        if(spti>=240){
            if(Greenfoot.getRandomNumber(2)==1){
            addObject(new SupplyCrate(),Greenfoot.getRandomNumber(1500),Greenfoot.getRandomNumber(850));
        }
            spti=0;
        }
    }
    
    
    public void check(int diff){
        if(diff==-1){
            easy();
        }
        if(diff==-0){
           normal(); 
        }
        if(diff==1){
            hard();
        }
    }
    
    
    public void easy(){
        Hp=2;
        Speed=2;
        gain =3;
          nextW=0;
        drop=50;
        chn=0.1;
        addObject(x = new Soldier(8,6,4),(getWidth()/2),getHeight()/2);
    }
    
    public void normal(){
            Hp=3;
        Speed=2;
           gain =5;
          nextW=0;
        addObject(x = new Soldier(7,6,3),(getWidth()/2),getHeight()/2);
        chn=0.05;
        drop=70;
    }
    
    public void hard(){
            Hp=3;
        Speed=3;
          gain =7;
        addObject(x = new Soldier(6,5,2),(getWidth()/2),getHeight()/2);
          chn=0.05;
        drop=80;
    }
    
}
