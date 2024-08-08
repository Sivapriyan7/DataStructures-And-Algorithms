package Coding_Problems.ZohoThirdRound_Practice.Railway_Reservation_Booking;

import java.rmi.server.RMIClassLoader;
import java.util.HashMap;
import java.util.Map;

public class TicketCancelling extends TicketBooking{

    private static int canceledseatnumber = 0;
    private static char preferencetracker = '\0';

    private static Map<Integer,Character> seatNumberWithBerth = new HashMap<>();

    public static String cancelTicket(int id)
    {
        for (Passenger p : confirmedlist)
        {
            if (p.getid()==id)
            {
                cancel(p);
            }
        }


    }

    public static void cancel(Passenger p)
    {
        if(p.getTickettype()=="berth")
        {
            canceledseatnumber = p.getSeatnumber();
            preferencetracker = p.getPreference();
            seatNumberWithBerth.put(canceledseatnumber,preferencetracker);

            deletfromAllLists(p);
            addRacToBerth(racQueue.poll());
            addWaitingToRac(waitingQueue.poll());
        }
        else if (p.getTickettype()=="rac")
        {
            racQueue.remove(p);
            addWaitingToRac(waitingQueue.poll());
        }
        else {
            waitingQueue.remove(p);

        }
    }

    public static void addRacToBerth(Passenger p)
    {
        if (p!=null)
        {
            p.setPreference(preferencetracker);
            p.setSeatnumber(canceledseatnumber);
            p.setTickettype("berth");
            if(preferencetracker=='U')
            {
                upperlist.add(p);
            }
            else if(preferencetracker=='M')
            {
                middlelist.add(p);
            }
            else if(preferencetracker=='L')
            {
                lowerlist.add(p);
            }

            confirmedlist.add(p);
            seatNumberWithBerth.remove(canceledseatnumber);
            preferencetracker='\0';
            canceledseatnumber=0;
        }
    }

    public static void addWaitingToRac(Passenger p)
    {
        if(p!=null)
        {
            racQueue.add(p);
            p.setTickettype("rac");
        }
    }

    public static void deletfromAllLists(Passenger p)
    {
        confirmedlist.remove(p);
        upperlist.remove(p);
        middlelist.remove(p);
        lowerlist.remove(p);
    }

    public static Map<Integer,Character> getSeatNumberWithBerth()
    {
        return seatNumberWithBerth;
    }
}
