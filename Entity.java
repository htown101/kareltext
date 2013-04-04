package textbased;

//Primary class for all objects 
//that will appear in world
public class Entity 
{
    //object coordinates
    private int x;
    private int y; 
    
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
    public boolean isNormalCollision(Entity entity)
    {
       //No collision
       return false;
    }
    
    //Collision detection for home square at 0 gems left
    public boolean isHomeCollision(Entity entity)
    {
        //No collision
        return false;
    }
    
}
