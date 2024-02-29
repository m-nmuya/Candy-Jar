import java.util.ArrayList;

public class CandyTester
{
    public static void main (String [] args)
    {
        ArrayList<Candy> candyJar = new ArrayList <Candy>();
        candyJar.add(new Candy("Nerds", 63, false));
        candyJar.add(new Candy("Starburst", 160, false));
        candyJar.add(new Candy("Hershey's Milk Chocolate", 214, true));
        candyJar.add(new Candy("Crunch", 205, true));
        candyJar.add(new Candy("Trolli Sour Gummy Worms", 120, false));
        candyJar.trimToSize();
    }
    
    public static void displayInventor(ArrayList<Candy> candyJar)
    {
        for(int i = 0; i < candyJar.size(); i++)
        {
            System.out.println(candyJar.get(i));
        }
    }
    
    public static boolean linearSearch (ArrayList<Candy> candyJar, String search)
    {
        for( Candy tempCandy : candyJar)
        {
            if (tempCandy.getName().equals(search))
            return true;
        }
        return false;
    }
}