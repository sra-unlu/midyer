import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pencilAttack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pencilAttack extends spells
{
    /**
     * Act - do whatever the pencilAttack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public pencilAttack(){
        GreenfootImage pencilAttack = new GreenfootImage("pencilAttack.png");
        pencilAttack.scale(72, 90);
        setImage(pencilAttack);
    }
}
