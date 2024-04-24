package com.ohgiraffers.section02.practice;

import java.util.Scanner;
public class Practice {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            // 도서 정보를 저장할 배열
            String[][] books = {
                    {"셜록 홈즈", "아서 코난도일"},
                    {"오리엔탈 특급열차 살인사건", "에거서 크리스티"},
                    {"햄릿", "셰익스피어"},
                    // ... 기타 책들
            };
            boolean[] isRented = new boolean[books.length]; // 대여 상태 배열

            while (true) {
                System.out.println("검색하고 싶은 책 제목이나 저자 이름을 입력하세요: ");
                String searchKey = scan.nextLine().toLowerCase();
                boolean found = false;

                for (int i = 0; i < books.length; i++)
                {
                    if (books[i][0].toLowerCase().contains(searchKey) || books[i][1].toLowerCase().contains(searchKey))
                    {
                        System.out.println("책 ID: " + i + ", 제목: " + books[i][0] + ", 저자: " + books[i][1]);
                        found = true;

                        System.out.println("대여(1) 또는 반납(2)을 선택하세요: ");
                        int action = scan.nextInt();
                        scan.nextLine(); // 개행 문자 제거

                        if (action == 1)
                        {
                            if (isRented[i])
                            {
                                System.out.println("죄송합니다. 해당 책은 이미 대여 중입니다.");
                            }
                            else
                            {
                                isRented[i] = true;
                                System.out.println("책(ID: " + i + ")이 성공적으로 대여되었습니다.");
                            }
                        }
                        else if (action == 2)
                        {
                            if (!isRented[i])
                            {
                                System.out.println("이 책은 대여되지 않았습니다.");
                            }
                            else
                            {
                                isRented[i] = false;
                                System.out.println("책(ID: " + i + ")이 성공적으로 반납되었습니다.");
                            }
                        }
                        else
                        {
                            System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
                        }
                        break;
                    }
                }

                if (!found) {
                    System.out.println("검색 결과가 없습니다. 다시 시도해주세요.");
                }

                System.out.println("계속하시겠습니까? (yes: 1, no: 0): ");
                int continueRental = scan.nextInt();
                scan.nextLine(); // 개행 문자 제거

                if (continueRental != 1) {
                    break; // while 루프 종료
                }
            }

            scan.close();
            System.out.println("프로그램을 종료합니다.");
        }
    }

