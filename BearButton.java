import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BearButton extends Button
{
    
    public  void clicked(){
        Greenfoot.setWorld(new BearWorld());
    }

}
