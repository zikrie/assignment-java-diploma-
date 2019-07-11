public class Event
{

    private int id;
    private String name;
    private String vanue;
    private String date;
    private double cost;
    private String sponName;


    public Event()
    {
        id       = 0 ;
        name     = "" ;
        vanue    = "" ;
        date     = "" ;
        cost     = 0.00 ;
        sponName = "" ;
    }


    public void setEvent(int a,String b,String c,String d,double e,String f)
    {
        id        = a ;
        name      = b ;
        vanue     = c ;
        date      = d ;
        cost      = e ;
        sponName  = f ;
    }
    
    public void setId(int a)
    {
         id=a;
    }
    
    public void setSponName(String b)
    {
        sponName = b;
    }
   
    
    public int getId()
    {  
         return id;
    }
    
    public String getName()
    {
         return name; 
    }
    
    public String getVanue()
    {
         return vanue;
    }
    
    public String getDate()
    {
         return date;
    }
    
    public double getCost()
    { 
         return cost;
    }
    
    public String getSponName()
    {
         return sponName;
    } 
}

