package kg.securityexam.service;

import kg.securityexam.entity.Ticket;
import kg.securityexam.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;
    @Override
    public Ticket create(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
}
