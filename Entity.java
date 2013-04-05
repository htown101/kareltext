package textbased;

//Primary class for all objects 
//that will appear in world

import java.util.*;

public class Entity 
{
    //object coordinates
    //change x back to private and update collision
    public int x;
    public int y;
    
    //constructor sets object position
    public Entity(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    // Get the x coordinate
    public int GetX()
    {
        return this.x;
    }
    // get the y coordinate 
    public int GetY()
    {
        return this.y;
    }
    
    // set x coordinate
    public void SetX(int x)
    {
        this.x = x; 
    }
    
    // set y coordinate
    public void SetY(int y)
    {
        this.y = y; 
    }
    
    //Handles all collisions that are not game ending
    public boolean isWallCollision(int x, int y, ArrayList walls)
    {
        Wall tempWall;
        
       for (int i = 0; i < walls.size(); i++)
       {
           tempWall = (Wall) walls.get(i);
           
            if(tempWall.x == x && tempWall.y == y)
            {
                return true;
            }
       }
       return false;
    }
    
    //Collision detection for home square at 0 gems left
    public boolean isHomeCollision(Entity entity)
    {
        //No collision
        return false;
    }
    
}
