import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner tb = new Scanner(System.in);
        ArrayList<Person> register = new ArrayList<>();
        int menyval;
        int födelseÅr;
        String namn;

        register.add(new Person("Anna", 1990));
        register.add(new Person("Berit",1955));
        register.add(new Person("Carl", 2005));
        register.add(new Person("David",1982));
    while (true){
        while(true){
            try 
            {
                System.out.println("Välj ett val från dessa 3 \n1. lägg till person \n2. söka efter person \n3. ta bort person via namn \n4. stäng av program"); 
                menyval = tb.nextInt();
                if(menyval > 4 || menyval < 1)
                {
                    System.out.println("större än 4 eller mindre än 1 är ej tillåtet.");
                    continue;
                }
                else
                {
                    tb.nextLine();
                    break;
                }
            } 
            catch (Exception e) 
            {
                System.out.println("får inte innehålla bokstäver");
                continue;
            }
        }
        


        switch(menyval)
        {
            case 1:
            {
                while(true){
                    try 
                    {
                        System.out.println("Ange födelseår mellan 1950 och 2008"); 
                        födelseÅr = tb.nextInt();
                        if(födelseÅr > 2008 || födelseÅr < 1950)
                        {
                            System.out.println("årtal måste vara mellan 1950 och 2008");
                            tb.nextLine();
                            continue;
                        }
                        else
                        {
                            tb.nextLine();
                            break;
                        }
                    } 
                    catch (Exception e) 
                    {
                        System.out.println("får inte innehålla bokstäver");
                        continue;
                    }
                }

                while(true)
                {

                    System.out.println("ange namn");
                    namn = tb.nextLine();
                        
                    if(namn == null || namn.trim().isEmpty())
                    {
                        System.out.println("Får inte vara tom eller innehålla bara mellanslag");
                        tb.nextLine();
                        continue;
                    }
                    else
                    {
                        break;
                    }
                        
                } 

                register.add(new Person(namn, födelseÅr));
                System.out.println("person tillagd");
                break;
            }

            case 2: 
            {
                
                while(true)
                {

                    System.out.println("ange namn för den man söker");
                    namn = tb.nextLine();
                        
                    if(namn == null || namn.trim().isEmpty())
                    {
                        System.out.println("Får inte vara tom eller innehålla bara mellanslag");
                        tb.nextLine();
                        continue;
                    }
                    else
                    {
                        break;
                    }
                        
                } 

                for( Person p : register)
                {
                    if(p.getNamn().equals(namn))
                    {
                        System.out.println("person " +p.getNamn() + " hittad " );
                    }
                }
                break;
            }

            case 3:
            {
                while(true)
                {

                    System.out.println("ange namn för den man söker");
                    namn = tb.nextLine();
                        
                    if(namn == null || namn.trim().isEmpty())
                    {
                        System.out.println("Får inte vara tom eller innehålla bara mellanslag");
                        tb.nextLine();
                        continue;
                    }
                    else
                    {
                        break;
                    }
                        
                } 

                for (int i = 0; i < register.size(); i++) 
                {
                    Person p = register.get(i);
                    if(p.getNamn().equals(namn))
                    {
                        register.remove(i);
                        System.out.println("person " + p.getNamn() + " bortagen");
                    }
                } 

                break;
            }

            case 4:
            {
                System.exit(0);
            }

        }
    }
}





}

