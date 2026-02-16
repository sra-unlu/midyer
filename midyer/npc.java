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
    GreenfootImage hannahNPCImg = new GreenfootImage("ppl3.png");
    GreenfootImage nanamiNPCImg = new GreenfootImage("ppl3.png");
    GreenfootImage migsNPCImg = new GreenfootImage("ppl3.png");
    GreenfootImage pranavNPCImg = new GreenfootImage("ppl3.png");
    GreenfootImage migtNPCImg = new GreenfootImage("ppl3.png");
    GreenfootImage andrewgNPCImg = new GreenfootImage("ppl3.png");
    public int name;
    public int world;

    public npc(int which){
        if(which == 1){
            setImage(hannahNPCImg);
            name = 1;
            world = 1;
        } else if(which == 2){
            setImage(nanamiNPCImg);
            name = 2;
            world = 2;
        } else if(which == 3){
            setImage(migsNPCImg);
            name = 3;
            world = 3;
        } else if(which == 4){
            setImage(pranavNPCImg);
            name = 4;
            world = 4;
        } else if(which == 5){
            setImage(migtNPCImg);
            name = 5;
            world = 5;
        } else if(which == 6){
            setImage(andrewgNPCImg);
            name = 6;
            world = 6;
        }
    }
    public void act()
    {
        // Add your action code here.
    }
    
    public void giveSpell(){
        if(isTouching(player.class)){
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.getSpellAccordingToNPC(name);
        }
    }
}
