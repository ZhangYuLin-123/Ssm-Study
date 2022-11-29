package org.example.dao;

import org.example.domain.Order;

import java.util.List;

public interface OrderMapper {

    List<Order> findAll();

}
