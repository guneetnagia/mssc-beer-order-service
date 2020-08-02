package com.guneet.msscbeerorderservice.services;

import com.guneet.msscbeerorderservice.web.model.BeerOrderDto;
import com.guneet.msscbeerorderservice.web.model.BeerOrderPagedList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerOrderServiceImpl implements BeerOrderService {



    @Override
    public BeerOrderPagedList listOrders(UUID customerId, Pageable pageable) {
        return null;
    }

    @Override
    public BeerOrderDto placeOrder(UUID customerId, BeerOrderDto beerOrderDto) {
        return null;
    }

    @Override
    public BeerOrderDto getOrderById(UUID customerId, UUID orderId) {
        return null;
    }

    @Override
    public void pickupOrder(UUID customerId, UUID orderId) {

    }
}
