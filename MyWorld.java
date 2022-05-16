import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ElephantButton elephantButton = new ElephantButton();
        addObject(elephantButton,175,144);
        elephantButton.setLocation(223,120);
        Bear bear = new Bear();
        addObject(bear,222,194);
        Canguro canguro = new Canguro();
        addObject(canguro,229,271);
        Turtle turtle = new Turtle();
        addObject(turtle,353,269);
        bear.setLocation(347,123);
        turtle.setLocation(349,269);
    }
}
