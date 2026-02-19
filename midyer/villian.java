import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class villian here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class villian extends Actor
{
    /**
     * Act - do whatever the villian wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage reyyanVIL = new GreenfootImage("Reyyan.png");
    GreenfootImage dharmaVIL = new GreenfootImage("ppl3.png");
    GreenfootImage thomasVIL = new GreenfootImage("ppl3.png");
    GreenfootImage zoharVIL = new GreenfootImage("ppl3.png");
    public int worldToAppearIn;
    public int name;
    public int health = 100;
    public boolean isAttacked = false;
    public int speak;
    public int actCycle = 0; 
    public villian(int who){
        if(who == 1){
            reyyanVIL.scale(150, 140);
            setImage(reyyanVIL);
            worldToAppearIn = 3;
            name = 1;
        } else if(who == 2){
            dharmaVIL.scale(150, 140);
            setImage(dharmaVIL);
            worldToAppearIn = 6;
            name = 2;
        } else if(who == 3){
            thomasVIL.scale(150, 140);
            setImage(thomasVIL);
            name = 3;
            worldToAppearIn = 9;
        } else if(who == 4){
            zoharVIL.scale(150, 140);
            setImage(zoharVIL);
            name = 3;
            worldToAppearIn = 9;
        }
    }
    
    public void act(){
        actCycle++;
        if(actCycle - 375 == speak){
            MyWorld myworld = (MyWorld)getWorld();
            myworld.removeText(name + 6);
        }
        if(isAttacked){
            MyWorld mw = (MyWorld)getWorld();
            mw.attack(name);
            isAttacked = false;
        } if(health == 0){
            MyWorld mw = (MyWorld)getWorld();
            mw.killMe(name);
            mw.killMe(name + 6);
        }
    }
    
    public void setSpeak(){
        speak = actCycle;
    }
    
    public void attacked(){
        isAttacked = true;
    }
}
