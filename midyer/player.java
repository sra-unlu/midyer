import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    
    /**
     * Act - do whatever the person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage backOne;
    private GreenfootImage backTwo;
    private GreenfootImage frontOne;
    private GreenfootImage frontTwo;
    private GreenfootImage idle;
    private GreenfootImage scared;
    private int walkCounter = 50;
    public boolean isVillian = false;
    public String[] spells = new String[6];
    public int health = 100;
    private int actCycle = 0;
    private int actCycleScared = 0;
    
    public player() {
        //walk frames
        backOne = new GreenfootImage("pbw1.png");
        backOne.scale(150, 140);
        backTwo = new GreenfootImage("pbw2.png");
        backTwo.scale(150, 140);
        
        frontOne = new GreenfootImage("pfw1.png");
        frontOne.scale(150, 140);
        frontTwo = new GreenfootImage("pfw2.png");
        frontTwo.scale(150, 140);
        
        idle = getImage();
        idle.scale(150, 140);
        setImage(idle);
    }
    
    public void act()
    {
        actCycle++;
        move();
        if(isVillian){
            if(actCycleScared == 0){
                setImage(scared);
                actCycleScared = actCycle;
            } else if (actCycleScared == actCycle - 75){
                setImage(idle);
            }
        }
        
        if(getX() > 959){
            // once we fight the villian, set isVillian to false and remove from here
            isVillian = false;
            actCycleScared = 0;
            MyWorld world = (MyWorld) getWorld();
            world.nextWorld();
            setLocation(40, 300);
        }
    }
    
    private void move(){
        int px = getX();
        int py = getY();
        MyWorld world = (MyWorld) getWorld();
        
        walkCounter -= 1;
        
        if (Greenfoot.isKeyDown("right")){
            frontWalk();
            setLocation(px + 5, py);
        }
        else if (Greenfoot.isKeyDown("left")){
            frontWalk();
            setLocation(px - 5, py);
        }
        else if (Greenfoot.isKeyDown("up")){
            backWalk();
            setLocation(px, py - 5);
        }
        else if (Greenfoot.isKeyDown("down")){
            frontWalk();
            setLocation(px, py + 5);
        } else {
            setImage(idle);
        }
    }
    
    private void backWalk() {
        if (walkCounter <= 50 && walkCounter > 25) {
            setImage(backOne);
        } else if (walkCounter <= 25 && walkCounter > 0) {
            setImage(backTwo);
        } else {
            walkCounter = 50;
        }
    }
    
    private void frontWalk() {
        if (walkCounter <= 50 && walkCounter > 25) {
            setImage(frontOne);
        } else if (walkCounter <= 25 && walkCounter > 0) {
            setImage(frontTwo);
        } else {
            walkCounter = 50;
        }
    }
    
    public void attack(){
        MyWorld mw = (MyWorld)getWorld();
        if(Greenfoot.isKeyDown("1")){
            mw.addMe(1);
        }else if(Greenfoot.isKeyDown("2")){
            mw.addMe(2);
        }else if(Greenfoot.isKeyDown("3")){
            mw.addMe(3);
        }else if(Greenfoot.isKeyDown("4")){
            mw.addMe(4);
        }else if(Greenfoot.isKeyDown("5")){
            mw.addMe(5);
        }else if(Greenfoot.isKeyDown("6")){
            mw.addMe(6);
        }
    }
}


