package com.metro.DTO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class InMemoryCardTrxRepository {
    private ConcurrentMap<SmartCard, CardTrx> transientTrxStore = new ConcurrentHashMap<>();
    private ConcurrentMap<SmartCard, List<CardTrx>> completedTrxStore = new ConcurrentHashMap<>();
    public void addCompletedTrx(SmartCard card, CardTrx trx){
        completedTrxStore.putIfAbsent(card, new ArrayList<>());
        completedTrxStore.get(card).add(trx);
    }
    public void addTransientTrx(SmartCard card, CardTrx trx){
        transientTrxStore.put(card, trx);
    }
    public CardTrx getTransientTrx(SmartCard card) {
        return transientTrxStore.remove(card);
    }
    public List<CardTrx> getCompletedTrxs(SmartCard card) {
        return completedTrxStore.getOrDefault(card, Collections.emptyList());
    }
}