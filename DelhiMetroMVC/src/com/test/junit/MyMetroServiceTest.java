package com.test.junit;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.metro.DTO.CardTrx;
import com.metro.DTO.SmartCard;
import com.metro.DTO.Station;
import com.metro.DTO.Traveller;
import com.metro.exception.InsufficientCardBalance;
import com.metro.exception.MinimumCardBalanceException;
import com.metro.service.MetroService;

public class MyMetroServiceTest {

	private MetroService metroService = new MetroService();
    private SmartCard card;
    @Before
    public void setUp() throws Exception {
        card = new SmartCard();
        Traveller t = new Traveller();
		t.setId(1);
		t.setName("khushbu");
        card.setId(1);
        card.setBalance(100);
        card.setTraveller(t);
    }
    @Test
    public void testCalculateFootFallForStation() throws Exception {
        metroService.swipeIn(card, Station.A1, LocalDateTime.of(2016, Month.APRIL, 8, 18, 25));
        metroService.swipeOut(card, Station.A6, LocalDateTime.of(2016, Month.APRIL, 8, 18, 35));
        metroService.swipeIn(card, Station.A6, LocalDateTime.of(2016, Month.APRIL, 10, 19, 05));
        metroService.swipeOut(card, Station.A10, LocalDateTime.of(2016, Month.APRIL, 10, 19, 15));
        assertEquals("FootFall for station A6 should be 2", metroService.calculateFootFall(Station.A6), 2);
        assertEquals("FootFall for station A1 should be 1", metroService.calculateFootFall(Station.A1), 1);
        assertEquals("FootFall for station A10 should be 1", metroService.calculateFootFall(Station.A10), 1);
    }
    @Test
    public void testCardReport() throws Exception {
        metroService.swipeIn(card, Station.A1, LocalDateTime.of(2016, Month.APRIL, 8, 18, 25));
        metroService.swipeOut(card, Station.A6, LocalDateTime.of(2016, Month.APRIL, 8, 18, 35));
        metroService.swipeIn(card, Station.A6, LocalDateTime.of(2016, Month.APRIL, 10, 19, 05));
        metroService.swipeOut(card, Station.A10, LocalDateTime.of(2016, Month.APRIL, 10, 19, 15));
        final List<CardTrx> trxs = metroService.cardReport(card);
        assertEquals("There should be 2 trxs for this card", trxs.size(), 2);
   
    }
    @Test(expected = MinimumCardBalanceException.class)
    public void testMinimumBalanceAtSwipeIn() throws Exception {
        card.setBalance(1);
        metroService.swipeIn(card, Station.A1, LocalDateTime.of(2016, Month.APRIL, 8, 18, 25));
    }
    @Test(expected = InsufficientCardBalance.class)
    public void testSufficientBalanceAtSwipeOut() throws Exception {
        card.setBalance(10);
        metroService.swipeIn(card, Station.A1, LocalDateTime.of(2016, Month.APRIL, 8, 18, 25));
        metroService.swipeOut(card, Station.A6, LocalDateTime.of(2016, Month.APRIL, 8, 18, 35));
    }

}
