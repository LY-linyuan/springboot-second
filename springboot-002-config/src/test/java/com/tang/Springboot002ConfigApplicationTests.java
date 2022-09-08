package com.tang;

import com.tang.pojo.Cat;
import com.tang.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot002ConfigApplicationTests {

    @Autowired
    private Cat cat;
    @Autowired
    private Person person;

    @Test
    void contextLoads() {

        /**
         * Cat{name='旺财', age=3}
         * Person{name='T', age=17, happy=true, birth=null, maps={k1=v1, k2=v2}, lists=[code, music, cat], cat=Cat{name='旺财', age=3}}
         */

        System.out.println(cat);
        System.out.println(person);

    }

}
