package Coding_Problems.ZohoThirdRound_Practice.Railway_Reservation_Booking;

import jdk.jshell.spi.SPIResolutionException;

import java.awt.print.Pageable;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class TicketBooking {

    private static int berthlimit = 3;
    private static int raclimit = 2;
    private static int waitingListlimit = 2;

    private static int upperSeatNumber = 1;
    private static int middleSeatNumber = 2;
    private static int lowerSeatNumber = 3;

    static ArrayList<Passenger> confirmedlist = new ArrayList<Passenger>();

    static ArrayList<Passenger> upperlist = new ArrayList<Passenger>();
    static ArrayList<Passenger> middlelist = new ArrayList<Passenger>();
    static ArrayList<Passenger> lowerlist = new ArrayList<Passenger>();

    static Queue<Passenger> racQueue = new LinkedList<Passenger>();
    static Queue<Passenger> waitingQueue = new LinkedList<Passenger>();

    public static void bookticket(Passenger p)
    {
        if(upperlist.size()==berthlimit && middlelist.size()==berthlimit && lowerlist.size()==berthlimit)
        {
            if(updateRacQueue(p))
            {
                System.out.println("Ticket Booked Successfully.");
            }
            else if (updateWaitingQueue(p))
            {
                System.out.println("Ticket Booked Successfully.");
            }
            else {
                p.setid(p.getid()-1);
                System.out.println("No Tickets Available");
            }
        }
        else if (checkAvailability(p))
        {
            System.out.println("Booking Confirmed, \n Your Ticket ID : "+p.getid());
            p.setTickettype("berth");
            confirmedlist.add(p);
        }
        else
        {
            System.out.println(p.getPreference()+" is not available.");
            p.setid(p.getid()-1);
            availablelist();
        }
    }

    public static void availablelist()
    {
        System.out.println("CheckOut the Number of seats available");
        System.out.println("Upper Berth - "+(berthlimit-upperlist.size()));
        System.out.println("Middle Berth - "+(berthlimit-middlelist.size()));
        System.out.println("Lower Berth - "+(berthlimit-lowerlist.size()));
    }

    public static void displayTickets()
    {
        System.out.println("-----------------------------------------");
        for (Passenger p : confirmedlist)
        {
            System.out.println(p.toString());
            System.out.println("-----------------------------------------");
        }
    }

    public static boolean checkAvailability(Passenger p)
    {
        Map<Integer,Character> map = TicketCancelling.getSeatNumberWithBerth();
        if(p.getPreference()=='U')
        {
            if(upperlist.size()<berthlimit)
            {
                if(!checkCancelledSeatsAvailable(map,p))
                {
                    p.setSeatnumber(upperSeatNumber);
                    upperSeatNumber += 3;
                }
                upperlist.add(p);
                return true;
            }
        }
        else if (p.getPreference()=='M')
        {
            if(middlelist.size()<berthlimit)
            {
                if(!checkCancelledSeatsAvailable(map,p))
                {
                    p.setSeatnumber(middleSeatNumber);
                    middleSeatNumber += 3;
                }
                middlelist.add(p);
                return true;
            }
        }
        else if (p.getPreference()=='L')
        {
            if(lowerlist.size()<berthlimit)
            {
                if(!checkCancelledSeatsAvailable(map,p))
                {
                    p.setSeatnumber(lowerSeatNumber);
                    lowerSeatNumber += 3;
                }
                lowerlist.add(p);
                return true;
            }
        }

        return false;
    }

    public static boolean checkCancelledSeatsAvailable(Map<Integer,Character> map,Passenger p)
    {
        int seatnumber = checkForPreferenceAvailability(map,p.getPreference());
        if(seatnumber!=0)
        {
            p.setSeatnumber(seatnumber);
            map.remove(seatnumber);
            return true;
        }
        return false;

    }

    public static int checkForPreferenceAvailability(Map<Integer,Character> map,char preference) {
        int seatnumber = 0;
        for (Map.Entry<Integer, Character> entry : map.entrySet())
        {
            if(entry.getValue()==(char) preference)
            {
                seatnumber = (int) entry.getKey();
                break;
            }
        }
        return seatnumber;
    }

    public static void getseatdetails(Map<Integer,Character> map,Passenger p)
    {
//        int seatnumber = getseatnumber();
    }

    public static boolean updateRacQueue(Passenger p)
    {
        if(racQueue.size()<raclimit)
        {
            p.setTickettype("rac");
            racQueue.add(p);
            return true;
        }
        return false;
    }

    public static boolean updateWaitingQueue(Passenger p)
    {
        if(waitingQueue.size()<waitingListlimit)
        {
            p.setTickettype("waitingList");
            waitingQueue.add(p);
            return true;
        }
        return false;
    }


}
