import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class npc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class npc extends Actor
{
    /**
     * Act - do whatever the npc wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage hannahNPCImg;
    GreenfootImage nanamiNPCImg;
    GreenfootImage migsNPCImg;
    GreenfootImage pranavNPCImg;
    GreenfootImage migtNPCImg;
    GreenfootImage andrewgNPCImg;
    public String name;
    public int world;
    public npc(int which){
        if(which == 1){
            setImage(hannahNPCImg);
            name = "hannah";
            world = 1;
        } else if(which == 2){
            setImage(nanamiNPCImg);
            name = "nanami";
            world = 2;
        } else if(which == 3){
            setImage(migsNPCImg);
            name = "migs";
            world = 3;
        } else if(which == 4){
            setImage(pranavNPCImg);
            name = "pranav";
            world = 4;
        } else if(which == 5){
            setImage(migtNPCImg);
            name = "migt";
            world = 5;
        } else if(which == 6){
            setImage(andrewgNPCImg);
            name = "andrewg";
            world = 6;
        }
    }
    public void act()
    {
        // Add your action code here.
    }
    
    public void giveSpell(){
        
    }
}
