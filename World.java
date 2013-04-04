package textbased;

import java.util.*;

/**
 * Text based version of Karel the Robot
 * @author Heather,Noel,Sam,Amber,Josh,MacsR4Luzrs
 */

public class World
{
    //gems remaining could probably be replaced with
    //a call to see if the gems arrayList is empty
    
    private int gemsRemaining = 1; //gems left in world
    private ArrayList walls = new ArrayList();//walls in world
    private ArrayList gems = new ArrayList(); //gems in world
    private boolean isRunning = true; //game ending bool
    
    //create player object for karel
    Player player;
    
    //Map
    public String level =
              "####################\n"
            + "#        $         #\n"
            + "#       $#$        #\n"
            + "#      $###$       #\n"
            + "#     $#####$      #\n"
            + "#    $#######$     #\n"
            + "#   $#########$    #\n"
            + "#  $###########$   #\n"
            + "#^ #############$  #\n"
            + "####################\n";
    
    //Constructor - Set up world
    public World()
    {
        initWorld();
    }
    
    //Reads the map and adds all objects and their coordinates to the arraylists
    public final void initWorld()
    {
        //create a wall object
        Wall wall;
        
        //variables used to keep track of coordinates during loop
        int x = 0;
        int y = 0;
        
        for (int i = 0; i < level.length(); i++)
        {
            //Grab the item in string at i
            char item = level.charAt(i);
            
            //Adjust X,Y value based on what character is at i
            //and create an item in the array list if needed
            if (item == '\n')
            {
                y += 1;
            }
            else if (item == '#')
            {
                wall = new Wall(x,y);
                walls.add(wall);
                x += 1;
            }
            else if (item == '^')
            {
                player = new Player(x,y);
                x += 1;
            }
            else if (item == ' ')
            {
                x += 1;
            }
        }
        
        //Print the original map
        System.out.print(level);
        
        //start up the game
        mController game = new mController();
    }
    
    //updates the map with karels new position
    public void update_map(int new_x, int new_y, char symbol)
    {
        
    }
    
    final class mController
    {
        public mController()
        {
            //Run the game until finished
            while (isRunning == true)
            {
                //prompt user with choices and process input
                choiceMade(choiceOptions());
                
                //Print the updated map
                System.out.println(level);
                
                //Game ending conditions
                //check_if_game_finished();
            }
        }
        
        //Prompt the user with choices
        public int choiceOptions()
        {
            System.out.println("Enter a choice:");
            System.out.println("1 - Move");
            System.out.println("2 - Turn L");
            System.out.println("3 - Turn R");
            
            Scanner in = new Scanner(System.in);
            int user_input;
            user_input = in.nextInt();

            return user_input;
        }
        
        public void choiceMade(int choice)
        {
            //Attempt to move the player
            if (choice == 1)
            {
                char direction = player.GetDirection();
                
                //if check_wall_collision():
                
                //else if check_gem_collision;
                
                //else
                //move the player by updating his coords
                switch(direction)
                {
                    case '^':
                        player.move(0, 1);
                        break;
                    case 'v':
                        player.move(0, -1);
                        break;
                    case '>':
                        player.move(1,0);
                        break;
                    case '<':
                        player.move(-1,0);
                        break;
                }
            }
            //Turn the player left
            else if (choice == 2)
            {
                char direction = player.GetDirection();
                
                switch(direction)
                {
                    case '^':
                        player.SetDirection('<');
                        break;
                    case 'v':
                        player.SetDirection('>');
                        break;
                    case '>':
                        player.SetDirection('^');
                        break;
                    case '<':
                        player.SetDirection('v');
                        break;
                }
            }
            //turn the player right
            else if (choice == 3)
            {
                char direction = player.GetDirection();
                
                switch(direction)
                {
                    case '^':
                        player.SetDirection('>');
                        break;
                    case 'v':
                        player.SetDirection('<');
                        break;
                    case '>':
                        player.SetDirection('v');
                        break;
                    case '<':
                        player.SetDirection('^');
                        break;
                }
            }
            
            //update the map with new position or direction icon
            //updateWorld(player.GetX(),player.GetY(),direction);
        }
    }
}
