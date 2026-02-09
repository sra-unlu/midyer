import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class spells here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class spells extends Actor
{
    /**
     * Act - do whatever the spells wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
    */
   public String name;
   public int damage;
   public boolean isAquired;
   public npc npcAttachedTo;
   public spells(int which){
       MyWorld myworld = (MyWorld)getWorld();
       isAquired = false; 
       if(which == 1){
            name = "pencilAttack";
            damage = 100;
            npcAttachedTo = myworld.hannah;
        } else if(which == 2){
            name = "bcaWifi";
            damage = 100;
            npcAttachedTo = myworld.nanami;
        } else if(which == 3){
            name = "chemTest";
            damage = 100;
            npcAttachedTo = myworld.migs;
        } else if(which == 4){
            name = "cleaningUpUpUp";
            damage = 100;
            npcAttachedTo = myworld.pranav;
        } else if(which == 5){
            name = "showerAttack";
            damage = 100;
            npcAttachedTo = myworld.migt;
        } else if(which == 6){
            name = "polymorphisimUnit";
            damage = 100;
            npcAttachedTo = myworld.andrewg;
        }
    }
    public void act()
    {
        // Add your action code here.
    }
   
    
}
