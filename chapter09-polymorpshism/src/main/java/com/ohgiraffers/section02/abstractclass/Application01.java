package com.ohgiraffers.section02.abstractclass;

public class Application01 {

    public static void main(String[] args) {

        /*
        * 추상클래스와 추상 메서드
        * 추상메서드를 6개 이상 포함하는 클ㄹ래스를 추상클래스라 정의
        * 추상클래스는 인스턴스 생성 불가
        * 추상 클래스를 사용하려면 추상클래슬르 상속 받은 하위 클래스를 이용하여 인스턴스 생성 해야함
        * 이 때 추상클래스는 상위 타입으로 상용될 수 있으며 다형성 이용 가능
        *
        * 추상클랫에 작성된 추상메서드는 반드시 후손 오버라이딩 해서 작성해야 함
        * 후손 클래스의 메서드들의 공통 인터페이스로의 역할 수정 가능
        * 추상클래스에 작성한 메서드를 호출하게 되면 실제 후손 타입의 인스턴스가 가지는 메서드는
        * 다형성이 적용되어 동적 바인딩에 의해 다양한 응답을 할 수 있게 된다.
        *
        * 추상크랠스를 상속받아 구현할 때에는 extands 키워드 사용
        * 자바에서 extands로 클래스를 상속받을 시 하나의 부모 클래스로만 가질 수 있다.(단일 상속)
        *
        * 주상메서드란
        * 메서드의 선언부만 있고 구현부가 없는 메서드를 추상 메서드라고 한다.
        * 추상 메서드의 경우 반드시 abstract 키워드를 메서드 헤드에 작성해야 함
        * public abstract void extands Product(){
        *   public abstract void method();
        * }
        *
        */

      //  Product pro = new Product(); 추상클래스는 인스턴스 생성 불가
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.printSmartPhone();
        smartPhone.absMethod();


        Product product = new SmartPhone();
        product.absMethod();
        product.nonStatidMethod();


    }

}
