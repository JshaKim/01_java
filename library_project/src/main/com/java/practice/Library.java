package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        // 변경해야됨
        ArrayList books = new ArrayList();

        Scanner scan = new Scanner(System.in);

        // 인사말
        System.out.println("==== 안녕하세요! 도서관에 오신 것을 환영합니다! ====");

        // 회원정보 입력
        System.out.println("이름을 입력하세요 : ");
        String memberName = scan.nextLine();
        System.out.println("지역을 입력하세요 : ");
        String memberArea = scan.nextLine();
        System.out.println("전화번호를 입력하세요 : ");
        String memberPhone = scan.nextLine();

        // 입력한 회원 정보 저장
        Member user = new Member();
        user.setMembeNo(0); //
        user.setMemberName(memberName);
        user.setMemberArea(memberArea);
        user.setMemberPhone(memberPhone);

    // z컨트롤러
        // 고객 인사 메세지
        System.out.println(memberName + "(회원번호 : " + user.getMemberName() + ")님! 환영합니다! / 접속지역 :" + user.getMemberArea() + " )");
        while (true){
            // 고객 서비스 입력
            System.out.println("======== 원하는 서비스를 선택하세요. =========");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 검색");
            System.out.println("3. 도서 대여");
            System.out.println("4. 도서 반납");
            System.out.println("5. 끝내기");

            int service = scan.nextInt();
            scan.nextLine();  // consume newline left-over
            switch (service) {
                case 1:
                    // 도서 등록
                    String continueRegisterAdd = "Y";
                    while (true) {
                        if (continueRegisterAdd.equalsIgnoreCase("Y")) {
                            System.out.println(" --> 도서 장르 입력 : ");
                            String bookGenre = scan.nextLine();
                            System.out.println(" --> (" + bookGenre + ") 책 제목 입력 : ");
                            String bookTitle = scan.nextLine();
                            System.out.println(" --> (" + bookGenre + ") " + bookTitle + " 저자 입력 : ");
                            String bookAuthor = scan.nextLine();
                            System.out.println(" --> " + bookGenre + " 장르 " + bookAuthor + "의 저서 '" + bookTitle + "'를(을) 도서에 등록합니다!");

                            // 잭 정보를 저장함
                            Book book = new Book();
                            book.setBookGenre(bookGenre);
                            book.setBookTitle(bookTitle);
                            book.setBookAuthor(bookAuthor);

                            // 책정보를 등록함
                            books.add(book);
                            System.out.println("책 등록에 성공하였습니다.");
                        } else if (continueRegisterAdd.equalsIgnoreCase("N")) {
                            break;
                        } else {
                            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
                        }
                        System.out.println("도서 등록을 계속하시겠습니까? (Y/N)");
                        continueRegisterAdd = scan.nextLine();
                    }
                    break;


                case 2:
                    // 도서 검색
                    String continueRegisterSearch = "Y";
                    while (true) {
                        if (continueRegisterSearch.equalsIgnoreCase("Y")) {
                            System.out.println(books);
                        } else if (continueRegisterSearch.equalsIgnoreCase("N")) {
                            break;
                        } else {
                            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
                        }
                        System.out.println("도서 검색을 계속하시겠습니까? (Y/N)");
                        continueRegisterSearch = scan.nextLine();
                    }
                    break;


                case 3:
                    // 도서 대여
                    String continueRegisterRental = "Y";
                    while (true)
                    {
                        if (continueRegisterRental.equalsIgnoreCase("Y")) {
                            System.out.println("서비스 준비중입니다.");
                        } else if (continueRegisterRental.equalsIgnoreCase("N")) {
                            break;
                        } else {
                            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
                        }
                        System.out.println("도서 대여를 계속하시겠습니까? (Y/N)");
                        continueRegisterRental = scan.nextLine();
                    }
                    break;


                case 4:
                    //도서 반납
                    String continueRegisterReturn = "Y";
                    while (true)
                    {
                        if (continueRegisterReturn.equalsIgnoreCase("Y")) {
                            System.out.println("서비스 준비중입니다.");
                        } else if (continueRegisterReturn.equalsIgnoreCase("N")) {
                            break;
                        } else {
                            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
                        }
                        System.out.println("도서 반납을 계속하시겠습니까? (Y/N)");
                        continueRegisterReturn = scan.nextLine();
                    }
                    break;


                case 5:
                    // 끝내기
                    String continueRegisterEnd = "Y";
                    while (true) {
                        if (continueRegisterEnd.equalsIgnoreCase("Y")) {
                            System.out.println("서비스를 종료하시겠습니까? (Y/N)");
                            continueRegisterEnd = scan.nextLine();
                        } else if (continueRegisterEnd.equalsIgnoreCase("N")) {
                            break;
                        } else if (continueRegisterEnd.equalsIgnoreCase("Y")) {
                            break;
                        } else {
                            System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                        }

                    }


                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                    break;
            }
        }

    }
}

