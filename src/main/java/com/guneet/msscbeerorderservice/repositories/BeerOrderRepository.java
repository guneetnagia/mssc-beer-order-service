package com.guneet.msscbeerorderservice.repositories;

import com.guneet.msscbeerorderservice.domain.BeerOrder;
import com.guneet.msscbeerorderservice.domain.Customer;
import com.guneet.msscbeerorderservice.domain.OrderStatusEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface BeerOrderRepository extends JpaRepository<BeerOrder, UUID> {

    Page<BeerOrder> findAllByCustomer(Customer customer,Pageable pageable);

    List<BeerOrder> findAllByOrderStatus(OrderStatusEnum orderStatusEnum);
}
