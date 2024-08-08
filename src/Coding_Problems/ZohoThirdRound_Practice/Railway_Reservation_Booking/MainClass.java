package Coding_Problems.ZohoThirdRound_Practice.Railway_Reservation_Booking;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        boolean loop = true;

        while (loop)
        {
            System.out.println("\nChoose any one \n " +
                                "1.Book ticket" +
                                "\n 2.Cancel ticket"+
                                "\n 3.Display Confirmed list" +
                                "\n 4.Exit");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();

            switch (n)
            {
                case 1:
                {
                    System.out.println("Enter name : ");
                    String name = s.next();
                    System.out.println("Enter age : ");
                    int age = s.nextInt();
                    System.out.println("Enter berth : ");
                    char preference = s.next().charAt(0);
                    if(preference=='U'||preference=='M'||preference=='L')
                    {
                        TicketBooking.bookticket(new Passenger(name,age,preference));
                    }
                    else {
                        System.out.println("Invalid Berth");
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("Enter your Ticket id : ");
                    int id = s.nextInt();
                    TicketCancelling.cancelTicket(id);
                    break;
                }
                case 3:
                {
                    TicketBooking.displayTickets();
                    break;
                }
                case 4:
                {
                    System.out.println("Thank you, Have a Nice Day :)!");
                    s.close();
                    loop = false;
                }
            }
        }
    }
}
