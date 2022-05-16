import greenfoot.*; 

public class ElephantButton extends Actor
{
    public void act()
    {
        GreenfootImage image = getImage();
        
        if(Greenfoot.mouseMoved(this)){
            image.setTransparency(150);
        } else if(Greenfoot.mouseMoved(getWorld())){
            image.setTransparency(255);
        }

    }
}
