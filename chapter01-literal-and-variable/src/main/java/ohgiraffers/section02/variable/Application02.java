package ohgiraffers.section02.variable;

public class Application02 {
    public static void main(String[] args) {
        /*
        * 자료형
        * 다양한 값의 혀태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 컴파일러와 약속한 키워드.
        * 예) 앞으로 사용한 int 자료형 정수를 4byte 만큼 읽어서 하나의 값으로 취급하겠다는 약속이다.
        * 이러한 자료형은 기본자료형과 참조자료형으로 나뉘어진다.
        * 그 중 기본자료형 8가지 살펴본다
        * */

        //정수를 취급하는 자료형은 4가지

        byte bnum; // 1byte
        short snum; // 2byte
        int inum; // 4byte
        long lnum; // 8byte

        //실수를 취급하는 자료형은 2가지
        float fnum; // 4byte
        double dnum; // 8byte

        //문자를 취급하는 자료형
        char ch; // 2byte

        // 논리형을 취급하는 자료형
        boolean isTrue; // 1byte

        // 문자열을 취급하는 자료형-----문자열은 기본자료형이 아님
        String str; // 4byte

        // 변수 초기화하기
        bnum = 1;
        snum = 2;
        inum = 3;
        lnum = 4l;
        System.out.println(bnum);
        System.out.println(snum);
        System.out.println(inum);
        System.out.println(lnum);

        // 실수에 값을 초기화 하기
        fnum = 0.3f;
        dnum = 0.4;

        // 논리를 취급하는 자료형
        isTrue = true;
        isTrue = false;

        // 문자 자료형
        ch = 'A';
        ch = 97;
        System.out.println(ch);

        // 믄자열을 취급하는 자료형에 값 대입
        str = "hello";


    }
}
