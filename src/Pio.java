import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pio {

    public static void main(String[] args) {
        Game game = new Game();
        Player player = new PlayerComp();
        game.addPlayer(new PlayerComp("Janusz"));
        game.addPlayer(new PlayerComp("Ziuta"));
        game.addPlayer(new PlayerComp("Ziuta"));
        game.addPlayer(new PlayerComp("Ziuta"));
        game.addPlayer(new PlayerComp("Ziuta"));
        game.addPlayer(new PlayerComp("Ziuta"));
        //game.play();
        //game.removePlayers("Ziuta");
        game.printPlayers();


    }
}
