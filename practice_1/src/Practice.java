public class Practice {

    public static int add(int x, int y) { // 범용 정적 메모리에 인스턴스 정수형 변수 x, y를 선언한다.
        //
        int sum = x + y; // 정수 변수 sum에 x, y의 합한 값을 초기화 한다.
        return sum; // sum을 반환한다.

    }

    public static void main(String[] args) {  // 범용 정적 메모리 공간에

        int sum1 = add(5,6); // 정수 변수 sum에 x, y의 합한 값을 초기화 한다.
        System.out.println("add 함수 이용한 x, y 합산 결과 출력");
        System.out.println("결과 : " + sum1); // sum을 반환한다.
    }
}
