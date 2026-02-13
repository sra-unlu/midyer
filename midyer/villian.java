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
    GreenfootImage reyyanVIL = new GreenfootImage("ppl3.png");
    GreenfootImage dharmaVIL = new GreenfootImage("ppl3.png");
    GreenfootImage thomasVIL = new GreenfootImage("ppl3.png");
    GreenfootImage zoharVIL = new GreenfootImage("ppl3.png");
    public int worldToAppearIn;
    public String name;
    public villian(int who){
        if(who == 1){
            setImage(reyyanVIL);
            worldToAppearIn = 3;
            name = "reyyan";
        } else if(who == 2){
            setImage(dharmaVIL);
            worldToAppearIn = 6;
            name = "dharma";
        } else if(who == 3){
            setImage(thomasVIL);
            name = "thomas";
        } else if(who == 4){
            setImage(zoharVIL);
            name = "zohar";
        }
    }
    
    public void act(){
        
    }
}
