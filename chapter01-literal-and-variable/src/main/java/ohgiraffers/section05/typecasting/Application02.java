package ohgiraffers.section05.typecasting;

public class Application02 {

    public static void main(String[] args) {
        /*
        * 강제형변환
        * 바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환 된다.
        *
        * */

        /*
        * 자동형변환 규칙의 반대상황에서 강제형변환이 필요한다.
        * 1. 강제형변환 규칙
        *  1-1. 자료에서 작은 자료형으로 변경시 강제형변환이 필요하다.
        *  1-2. 실수를 정수로 변경시 강제형변환이 필요하다.
        *  1-3. 문자형을 int 미만 크기의 변수에 저장할 때 강제형변환이 필요하다.
        *  1-4. 논리형은 강제형변환 규칙에서 제외된다.
        *
        * */

        byte num = 1;
        char chartAt = 'A'; // 문자는 정수로 변환 가능하다.
        // 자바에서 정수를 취급하는 기본 단위는 int
        // 문자는 == 정수 == int

        long lnum = 9l;
        int inum = (int)lnum; // int인데 공급 받은건 long 타입(int 붙여줘야 함)

        short snum = 200;
        byte bnum = (byte) snum;

    }
}
