package com.vpdev.http.service;

import com.vpdev.http.dao.TicketDao;
import com.vpdev.http.dto.TicketDto;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class TicketService {

    private static final TicketService INSTANCE = new TicketService();

    private final TicketDao ticketDao = TicketDao.getInstance();

    private TicketService() {
    }

    public List<TicketDto> findAllByFlightId(Long flightId) {
        return ticketDao.findAllByFlightId(flightId).stream()
                .map(ticket -> TicketDto.builder().id(ticket.getId()).flightId(ticket.getFlightId())
                        .seatNo(ticket.getSeatNo()).build()

                )
                .collect(toList());
    }

    public static TicketService getInstance() {
        return INSTANCE;
    }
}