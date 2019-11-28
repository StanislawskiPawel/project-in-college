import java.util.Random;

public class PlayerComp extends Player {
    // mózg gracza odgadujący liczby
    private Random brain = new Random();

    public PlayerComp() {}

    public PlayerComp(String name) {
        super(name);
    }

    @Override
    public int guess() {
        return brain.nextInt(6) + 1;
    }

}







//        List<String> list = new ArrayList<String>();
//        list.add("raz");
//        list.add("dwa");
//        list.add("trzy");
//        System.out.println(list);
//
//        System.out.println("-------------------------------------");
//        for(int i = 0 ; i<list.size(); ++i)
//        {
//            System.out.println(list.get(i));
//        }
//        System.out.println("-------------------------------------");
//
//        for(String e : list)
//        {
//            System.out.println(e);
//        }
//
//        System.out.println("-------------------------------------");
//
//
//
//        for(Iterator<String> it = list.iterator();it.hasNext();)
//        {
//            System.out.println(it.next());
//        }