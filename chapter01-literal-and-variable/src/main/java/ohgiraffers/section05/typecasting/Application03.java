package ohgiraffers.section05.typecasting;

public class Application03 {
    public static void main(String[] args) {
        /*
        * 자동형변환과 강제혀연환을 이용한 다른 자료형끼리의 연산
        * 다른 자료형끼리 연산은 큰 자료형으로 자동 형변환 후 연산 처리된다.


        int inum = 10;
        long lnum = 100;

        int isum = inum + (int)lnum; // over flow 발생
        int isum = (int)(inum + lnum); // 결과는 같지만, 차이가 있다.

        byte byteNum1 = 1;
        byte byteNum2 = 2;
        short shortNum1 = 1;
        short shortNum2 = 2;

        int result = byteNum1 + byteNum2;
        /*
        * 자바의 기본 연산 단위는 int
        * byte 연산일 경우 Java에서는
        *
        * byte =
        * */
        // int result = shortNum1 + shortNum2;


    }
}
