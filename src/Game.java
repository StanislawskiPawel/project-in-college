import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Game {

    private Random rand = new Random();

    List<Player> players = new ArrayList<>();

    void printPlayers()
    {
        for(Player player : players)
        {
            System.out.println(player.getName());
        }
    }

    void removePlayers(String name)
    {
//        for(Iterator<Player> it = players.iterator(); it.hasNext();)
//        {
//            Player player = it.next();
//
//            if(player.getName().equals(name))
//            {
//                it.remove();
//            }

       // }

        players.removeIf((Player player)  -> player.getName().equals(name));
    }




    public void addPlayer(Player player)
    {int i=0;
        for(Iterator<Player> it = players.iterator(); it.hasNext();)
        {
            i++;

                   Player p = it.next();
                   if(p.getName().equals(player.getName()))
                   {

                       player.setName(player.getName() + i);
                   }

        }


        players.add(player);
    }

    public void play()
    {
        int number;
        int guess;

        boolean repeat;

        do {
            System.out.println("---------------------");

            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);


            repeat = true;
            for (Player player : players) {
                guess = player.guess(); // odgadywanie zlecamy obiektowi klasy Player
                System.out.println("Gracz " + player.getName() + ": " + guess);

                if (number != guess) {
                    System.out.println("PUDŁO!");
                } else {
                    System.out.println("BRAWO!");
                    repeat = false;
                }
            }
        }
            while (repeat);
    }
}
