package com.ohgiraffers;

import com.ohgiraffers.order.controller.OrderController;
import com.ohgiraffers.order.dto.OrderDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        OrderController orderController = new OrderController();
        boolean order = true;
        String result = "";

        while(true){

            System.out.println("1. 주문 등록");
            System.out.println("2. 주문 삭제");
            System.out.println("3. 주문 수정");
            System.out.println("4. 주문 상세조회");
            System.out.println("5. 주문 전체조회");
            System.out.print("어떤 항목을 선택하시겠습니까?");

            int input = scan.nextInt();
            scan.nextLine();

            switch(input){
                case 1: // 주문등록
                    System.out.println("주문할 메뉴 이름을 입력하세요 : ");
                    String name = scan.nextLine();
                    System.out.println("수량을 입력해주세요 : ");
                    int quantity = scan.nextInt();
                    System.out.println("가격을 입력해주세요 : ");
                    int price = scan.nextInt();
                    OrderDTO orderDTO = new OrderDTO(name, quantity, price);

                    result = orderController.order(orderDTO);
                    break;
                case 2: // 주문삭제
                    orderController.orderCancel();
                    break;
                case 3: // 주문수정
                    orderController.orderModify();
                    break;
                case 4: // 주문 상세조회
                    orderController.orderDetail();
                    break;
                case 5: // 주문 전체조회
                    orderController.orderRead(orderDTO);

                    break;
                default:
                    System.out.println("입력이 잘못되었습니다.");
                    break;
            }

            System.out.println(result);

            System.out.println("주문을 종료하시겠습니까?");
            order = scan.nextBoolean();




        }

    }

}
