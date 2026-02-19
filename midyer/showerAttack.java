import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class showerAttack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class showerAttack extends spells
{
    /**
     * Act - do whatever the showerAttack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public showerAttack(){
        GreenfootImage showerAttack = new GreenfootImage("showerAttack.png");
        showerAttack.scale(72, 90);
        setImage(showerAttack);
    }
}
