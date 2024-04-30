package com.ohgiraffers.section03.interfaceimplments;
    /*
    * extand
    */
public class Product extends Object implements InterProduct{

    /*
    * 클래스에서 인터페이스를 상속받을 때 implements 키워드 사용
    * 또한 인터페이스는 다수 상속 가능
    * extands로 다른 클래스를 상속 받는 경우에도 그것과 별개로 인터페이스도 추가 상속 가능
    * 단 extancs키워드를 앞에 작성하고 oimplements를 뒤에 작성한다.
    *
    * */

        @Override // 메서드 또한 프로그램이 로드될 때 메모리에 할당되기 때문에 재정의가 불가함
        public void nonStaticMethod() {
            System.out.println("interProduct nonStaticMethod 오버라이딩한 메서드 호출함");
        }

        @Override // 재정의 불가, 오직 인터페이스에서만 작성 가능
        public void abstractMethod() {
            System.out.println("interProduct abstractMethod 오버라이딩한 메서드 호출함");
        }

    }
