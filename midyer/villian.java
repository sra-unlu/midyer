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
    public villian(int who){
        if(who == 1){
            setImage(reyyanVIL);
            worldToAppearIn = 4;
            name = 1;
        } else if(who == 2){
            setImage(dharmaVIL);
            worldToAppearIn = 7;
            name = 2;
        } else if(who == 3){
            setImage(thomasVIL);
            name = 3;
            worldToAppearIn = 10;
        } else if(who == 4){
            setImage(zoharVIL);
            name = 3;
            worldToAppearIn = 10;
        }
    }
    
    public void act(){
        if(isAttacked){
            MyWorld mw = (MyWorld)getWorld();
            mw.attack(name);
        } if(health == 0){
            MyWorld mw = (MyWorld)getWorld();
            mw.killMe(name + 6);
        }
    }
    
}
