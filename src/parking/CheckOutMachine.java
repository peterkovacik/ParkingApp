/**
 * The CheckOutMachine class represents the check out machine.
 */

package parking;

import parking.receiptViewer.ViewLostTicketReceipt;
import parking.receiptViewer.ViewMinMaxReceipt;
import parking.receiptViewer.ViewReceipt;
import parking.receiptViewer.ViewSpecialEventReceipt;

import static parking.TicketType.MinMax;
import static parking.TicketType.SpecialEvent;

public class CheckOutMachine {


    public Ticket processTicket(Ticket ticket) {
        ProcessCheckOutTicket processCheckOutTicket = new ProcessCheckOutTicket(ticket);
        return processCheckOutTicket.processTicket();
    }

    public void printReceipt(Ticket ticket) {
        ViewReceipt receipt;
        if (ticket.getTicketType() == MinMax)
            receipt = new ViewMinMaxReceipt();
        else if (ticket.getTicketType() == SpecialEvent)
            receipt = new ViewSpecialEventReceipt();
        else
            receipt = new ViewLostTicketReceipt();

        receipt.displayReceipt(ticket);
        System.out.println();
    }

}

