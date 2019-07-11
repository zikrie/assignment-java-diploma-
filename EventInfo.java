import java.util.*;
import java.util.ArrayList;

public class EventInfo
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        ArrayList EventAl = new ArrayList();
        ArrayList AqiqahEvAl = new ArrayList();

        System.out.println("Enter 10 Records of Event Particular's : ");
        
        for(int i=0 ; i<10 ; i++)
        {
            System.out.print("Enter Event Id : ");
            int id = a.nextInt();
            System.out.print("Enter Event Name : ");
            String name = a.next(); 
            System.out.print("Enter Even Vanue : ");
            String vanue = a.next(); 
            System.out.print("Enter Event Date  : ");
            String date = a.next();    
            System.out.print("Enter AppCost  : RM ");
            double cost = a.nextDouble(); 
            System.out.print("Enter SponName  : ");
            String sponName = a.next();
            
            System.out.println("");
            
            Event z = new Event();
            z.setEvent(id, name,vanue,date,cost,sponName);
            EventAl.add(z);
        }
        System.out.println("");
      
        int count=0;
        for(int i=0 ; i<EventAl.size() ; i++)
        {
            Event z=(Event)EventAl.get(i);
            if(z.getDate().substring(6,10).equalsIgnoreCase("2015"))
            {
                count++;
                System.out.println("Event Name : " + z.getName());
                System.out.println("Event Date : " + z.getDate());
            }
        }
        System.out.println("Number of Event : " + count);
        System.out.println("");
     
        for(int i=0 ; i<EventAl.size() ; i++)
        {
            Event z=(Event)EventAl.get(i);
            if(z.getId()==181)
            {
                z.setSponName("Sola D’Couture");
                EventAl.set(i,z);
                System.out.println("Sponsor Name for Event Id 181 is : " + z.getSponName());
            }        
        }
        System.out.println("");
 
        for(int i=0 ; i<EventAl.size() ; i++)
        {
            Event z=(Event)EventAl.get(i);
            if(z.getSponName().equalsIgnoreCase("Anakku"))
            {
               AqiqahEvAl.add(z);
            }
        }
        
        for(int i=0 ; i<AqiqahEvAl.size() ; i++)
        {
            Event z=(Event)AqiqahEvAl.get(i);
            System.out.println("ID : " + z.getId());
            System.out.println("Name : " + z.getName());
            System.out.println("Vanue : " + z.getVanue());
            System.out.println("Date : "+ z.getDate());
            System.out.println("Cost : RM " + z.getCost());
            System.out.println("Sponsor name : " + z.getSponName());
        }
        
        System.out.println("");
        System.out.println("");
        
        double totalCost  = 0.0 ;
        double highCost = 0.0 ;
        for(int i=0 ; i<EventAl.size() ; i++)
        {
            Event z=(Event)EventAl.get(i);
            if((z.getSponName().equalsIgnoreCase("Johnson's"))&&( z.getDate().substring(6,10).equalsIgnoreCase("2014")))
            {
                if(z.getCost()>highCost)
                {
                  highCost   = z.getCost();
                  int index = i;     
                }
            }   
            if((z.getSponName().equalsIgnoreCase("Johnson's"))&&( z.getDate().substring(6,10).equalsIgnoreCase("2014")))
            {   
                totalCost = totalCost + z.getCost();     
            }
        }
        System.out.println("Total Cost : RM " + totalCost);
        System.out.println("High Cost : RM " + highCost);
    }
}
   