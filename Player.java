package textbased;

//Player class used to control karel the robot
public class Player extends Entity
{
    
    char direction; //karels direction icon

    private int previousX = 0;  //These 2 variables 
    private int previousY = 0;  //are currently unused
    
    //Constructor - set Karel north
    public Player(int x,int y)
    {
        super(x,y);
        this.direction = '^';
    }
    
    //updates karels position
    public void move(int x, int y) 
    {
        int newX = this.GetX() + GetX();
        int newY = this.GetY() + GetY();
        this.SetX(newX);
        this.SetY(newY);
    }
    
    public char GetDirection()
    {
        return this.direction;
    }
    
    public void SetDirection(char newDirection)
    {
        this.direction = newDirection;
    }
}
