package com.ohgiraffers.order.service;

import com.ohgiraffers.order.dao.OrderRepository;
import com.ohgiraffers.order.dto.OrderDTO;

public class OrderService {

    private final OrderRepository orderRepository = new OrderRepository();


    //서비스 계층
    //비지니스 로직 수행 및 데이터베이스의 대한 리소스를 관리한다.

    public String order(OrderDTO orderDTO) {
        if (orderDTO.getMenuName().equals("아메리카노")){
            return "주문 성공";
        }
        if (orderDTO.getPrice() <=0){
            return "땅 파서 장사하냐?";
        }

        String result = orderRepository.order(orderDTO);
        return result;
    }

}
