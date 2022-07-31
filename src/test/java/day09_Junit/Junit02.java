package day09_Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//todo
/*
   Öncelikle @Before annotasion olan setup(), çalışır
   Daha sonra çalıştırmak istediğimiz testimiz çalışır
   En sonda @After annotasion olan fix() methodumuz çalışır.
 */

public class Junit02 {
    @Test
    public void test01(){
        System.out.println("1. TEST01 ÇALIŞTI");
    }
    @Test
    public void test02(){
        System.out.println("2. TEST02 ÇALIŞMAYA BAŞLADI.");
    }


    @Before
    public void setup(){
        System.out.println("SİSTEM IS STARTING TO WORK");
    }

    @After
    public void fix(){
        System.out.println("SYSTEM IS TRYING TO MAKE THINGS WORK.");
    }

}
