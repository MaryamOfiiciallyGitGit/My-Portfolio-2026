import java.util.Scanner;

public class tickets {

        public static void main(String[] args) {
            System.out.println("Tickets Program");
            Scanner inputBuff0bj = new Scanner(System.in);


            String[] ticketsInfo = new String[3];
            System.out.println("Tickets Program");


            // create tickets

            for (int currentTicket = 0; currentTicket < 3; currentTicket++) {
                System.out.println("---Ticket"+ currentTicket +"---");

                System.out.println("id:");
                String id = inputBuff0bj.nextLine();

                System.out.println("title:");
                String title = inputBuff0bj.nextLine();

                System.out.println("description:");
                String description = inputBuff0bj.nextLine();

                System.out.println("status:");
                String status = inputBuff0bj.nextLine();

                ticketsInfo[currentTicket] = id +"|"  + title +"|" + description +"|" + status;

            }

            //list ticket
            for (int currentTicket = 0; currentTicket < 3; currentTicket++) {
                System.out.println("Ticket number"+ currentTicket +":" + ticketsInfo[currentTicket]);

            }


            // update ticket

            System.out.println("Enter the ticket number that you want to update:");
            int numberTicketUpdate = inputBuff0bj.nextInt();

            System.out.println("---Ticket"+ numberTicketUpdate +" updated---");
            System.out.println("id:");
            String idNew = inputBuff0bj.nextLine();


            System.out.println("title:");
            String titleNew = inputBuff0bj.nextLine();

            System.out.println("description:");
            String descriptionNew = inputBuff0bj.nextLine();

            System.out.println("status:");
            String statusNew = inputBuff0bj.nextLine();

            ticketsInfo[numberTicketUpdate] = idNew +"|" + titleNew +"|" + descriptionNew +"|" + statusNew;

            //list tickets after update
            for (int currentTicket = 0; currentTicket < 3; currentTicket++) {
                System.out.println("Ticket number"+ currentTicket +":" + ticketsInfo[currentTicket]);

            }


            // delete ticket

            System.out.println("Enter the ticket number that you want to delete:");
            int numberTicketDelete = inputBuff0bj.nextInt();
            ticketsInfo[numberTicketUpdate] = "";

            //list tickets after delete
            for (int currentTicket = 0; currentTicket < 3; currentTicket++) {
                System.out.println("Ticket number"+ currentTicket +":" + ticketsInfo[currentTicket]);

            }


        }
    }


