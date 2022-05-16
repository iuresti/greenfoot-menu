import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Canguro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Canguro extends Actor
{
    /**
     * Act - do whatever the Canguro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage image = getImage();
        
        if(Greenfoot.mouseMoved(this)){
            image.setTransparency(150);
        } else if(Greenfoot.mouseMoved(getWorld())){
            image.setTransparency(255);
        }
        
        
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new CanguroWorld());
        }
    }
}
