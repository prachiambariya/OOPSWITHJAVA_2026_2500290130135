public class Usecase5 {

    public static void main(String[] args) {

        TicketCounter counter = new TicketCounter();

        Thread t1 = new Thread(counter);
        Thread t2 = new Thread(counter);

        t2.setPriority(10);
        t1.setName("Counter1");
        t2.setName("Counter2");

        t1.start();
        t2.start();
    }
}

class TicketCounter implements Runnable {
    int availableTickets = 3;

    @Override
    public void run() {
        while (availableTickets > 0) {
            bookTickets();
        }
    }

    synchronized void bookTickets() {
        if (availableTickets > 0) {
            availableTickets = availableTickets - 1;
            
            System.out.println("Ticket booked by " + Thread.currentThread().getName());
            System.out.println("Left tickets are " + availableTickets);
        } else {
            System.out.println("Tickets are sold out");
        }
    }
}
