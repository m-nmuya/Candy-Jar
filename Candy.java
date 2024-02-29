public class Candy
{
    private String name;
    private int calories;
    private boolean isChoc;
    
    public Candy(String n, int c, boolean isC)
    {
        name = n;
        calories = c;
        isChoc = isC;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getCalories()
    {
        return calories;
    }
    
    public boolean chocIs()
    {
        return isChoc;
    }
    
    public String toString()
    {
        return name + " " + calories + " " + isChoc;
    }
}