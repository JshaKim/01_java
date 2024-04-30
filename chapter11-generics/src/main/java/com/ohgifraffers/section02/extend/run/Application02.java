package com.ohgifraffers.section02.extend.run;

import com.ohgifraffers.section02.extend.WildCardFarm;

public class Application02 {

    public static void main(String[] args) {
        /*
        *
        * 와일드카드(WildCard)
        * 제네릭스 클래스 타입의 객체를 메서드의 매개변수로 받을 때,
        * 그 객체의 타입 변수를 제한할 수 있다.
        * <?> : 제한없음
        * <? extends Type> : 와일드카드의 상한 제한(type과 Type의 후손을 이용해서 생성한 인스턴스만 인자로 사용 가능
        * <? super Type> : 와일드 하한 제한(Type과 Type의 부모를 이용해 생성한 인스턴스만 인자로 사용 가능*/
    }
    WildCardFarm wildCardFarm = new WildCardFarm();
    //농장 생성 자체가 불가능한 것은 매개변수로 사용할 수 없다.
    //wildCardFarm.anyType(new RabbitFarm<Ma()));



}
