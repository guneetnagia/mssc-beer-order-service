package com.guneet.msscbeerorderservice.web.controllers;

import com.guneet.msscbeerorderservice.services.BeerOrderService;
import com.guneet.msscbeerorderservice.web.model.BeerOrderPagedList;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/customers/{customerId}/")
@RestController
public class BeerOrderController {
    private static final Integer DEFAULT_PAGE_NUMBER = 0;
    private static final Integer DEFAULT_PAGE_SIZE = 25;

    private BeerOrderService beerOrderService;

    public BeerOrderController(BeerOrderService beerOrderService){
        this.beerOrderService = beerOrderService;
    }

    @GetMapping("orders")
    public BeerOrderPagedList listOrders(@PathVariable("customerId") UUID customerId,
                                         @RequestParam(value="pageNumber", required=false) Integer pageNumber,
                                         @RequestParam(value="pageSize", required=false) Integer pageSize
                                         ){
        if(pageNumber == null || pageNumber <0){
            pageNumber = DEFAULT_PAGE_NUMBER;
        }
        if(pageSize == null || pageSize < 1){
            pageSize = DEFAULT_PAGE_SIZE;
        }
        return null;//beerOrderService.listOrders;
    }
}
