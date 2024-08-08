package Coding_Problems.ZohoThirdRound_Practice.Railway_Reservation_Booking;

public class Passenger {
    private static int idprovider = 0;
    private int id;
    private String name;
    private int age;
    private char preference;
    private String tickettype;
    private int seatnumber;

    public Passenger(String name, int age, char preference) {
        this.id = ++idprovider;
        this.name = name;
        this.age = age;
        this.preference = preference;
    }

    public int getid()
    {
        return id;
    }
    public void setid(int id)
    {
        Passenger.idprovider = id;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    public char getPreference()
    {
        return preference;
    }
    public void setPreference(char preference)
    {
        this.preference = preference;
    }

    public String getTickettype()
    {
        return tickettype;
    }
    public void setTickettype(String tickettype)
    {
        this.tickettype = tickettype;
    }

    public int getSeatnumber()
    {
        return seatnumber;
    }
    public void setSeatnumber(int seatnumber)
    {
        this.seatnumber = seatnumber;
    }

    @Override
    public String toString()
    {
        return "Passenger ID   : "+id+"\n"+
               "Passenger Name : "+name+"\n"+
               "Age            : "+age+"\n"+
               "Seat No        : "+seatnumber+"\n"+
               "Preference     : "+preference;
    }
}


