package service;


import dto.TicketDto;

import java.util.List;

public class TicketService {

    public static final TicketService INSTANCE = new TicketService();

    private TicketService() {
    }

    public List<TicketDto>

    public static TicketService getInstance(){
        return INSTANCE;
    }
}
