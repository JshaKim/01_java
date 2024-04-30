package com.ohgifraffers.section02.extend.run;

import com.ohgifraffers.section02.extend.Rabbit;
import com.ohgifraffers.section02.extend.RabbitFarm;

import java.util.Random;

public class Application01 {

    public static void main(String[] args) {

        // <t extends Rabbit>을 기준으로
        // 애니멀 클래스는 조상이라서 타입이 안 맞고
        // 마말은 클래스는 부모라서 타입이 안 맞다.

        // Rabbit은 Rabbit과 같은 타입으로 제네릭스 타입 지정 가능
        RabbitFarm<Rabbit> farm = new RabbitFarm();

    }
}
