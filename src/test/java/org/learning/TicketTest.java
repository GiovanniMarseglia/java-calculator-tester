package org.learning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketTest {
    @Test
    void Ticket(){
        Ticket ticket = new Ticket(25,15);
        assertEquals(25*0.21,ticket.totalPrice);
    }
    @Test
    void sale(){
        Ticket ticket = new Ticket(25,15);
        if(ticket.age<18){
            assertEquals(ticket.totalPrice-(ticket.totalPrice*25/100),ticket.sale());
        }else if(ticket.age>65){
            assertEquals(ticket.totalPrice-(ticket.totalPrice*40/100),ticket.sale());
        }else{
            assertEquals(0,ticket.sale());
        }
    }
}
