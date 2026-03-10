public class Person 
{
    private String namn;
    private int födelseÅr;

    public Person(String namn, int födelseÅr)
    {
        this.namn = namn;
        this.födelseÅr = födelseÅr;
    }

    public String getNamn() 
    {
        return this.namn;
    }
    
    public int getFödelseÅr() 
    {
        return this.födelseÅr;
    }

    @Override
    public String toString()
    {
        return "1. namn: " + this.namn + "\n2. födelseÅr: " + this.födelseÅr;
    }
}
