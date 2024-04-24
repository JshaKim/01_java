package com.ohgiraffers.order.controller;

import com.ohgiraffers.order.dto.OrderDTO;
import com.ohgiraffers.order.service.OrderService;

public class OrderController {

    private OrderService orderService = new OrderService(); // orderService 호출

    public String order(OrderDTO orderDTO){
        if (orderDTO.getMenuName().equals("")){
            //컨트롤러 계층에서 각 기능을 수행하기 위한 필수값의 누락을 검사
            return "메뉴를 정해주세요";
        };
            if (orderDTO.getQuantity() <= 0){
                return  "수량을 입력해주세요";
            }

            // 서비스 로직으로 넘김
        String result = orderService.order(orderDTO);
        return result;
    }
    public String orderCancel(){
        return "주문 취소하기";
    }
    public String orderModify(){
        return "다시 주문하기";
    }
    public String orderDetail(){
        return "주문 상세조회";
    }
    public String orderRead(){
        return "전체 주문조회";
    }

}
