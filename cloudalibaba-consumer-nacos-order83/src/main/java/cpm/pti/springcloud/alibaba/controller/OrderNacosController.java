package cpm.pti.springcloud.alibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


@RestController
@Slf4j
public class OrderNacosController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping(value = "/consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(serverURL + "/payment/nacos/" + id,String.class);
    }


    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 13; i++) {
            map.put(i + "", i + "");
        }
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("-----------------");

        Map<String, String> map2 = new HashMap<>();
        for (int i = 8; i < 15; i++) {
            map2.put(i + "", i + "");
        }
        for (String key : map2.keySet()) {
            System.out.println(key);
        }


        /*String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);

        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s3 == s4);

        System.out.println(s1 == s3);

        System.out.println(s1.equals(s3));

        Integer i1 = 123;
        Integer i2 = 123;
        System.out.println(i1 == i2);

        int i3 = 123;
        System.out.println(i1 == i3);


        String s5 = new String("ABCD");
        String s6 = new String("DCBA");
        System.out.println(s5.compareTo(s6));

        System.out.println("-----------------");*/

        /*Map map1 = new HashMap<>();
        map1.put("d","111");
        map1.put("a","5555");
        map1.put("c","789");
        map1.put("b","2232");

        Set<String> set = map1.keySet();
        for(String str : set){
            System.out.println("key:" + str + " val:" + map1.get(str));
        }

        System.out.println("-----------------");

        Map map2 = new HashMap<>();
        map2.put("3","111");
        map2.put("2","5555");
        map2.put("4","789");
        map2.put("1","2232");

        Set<String> set2 = map2.keySet();
        for(String str : set2){
            System.out.println("key:" + str + " val:" + map2.get(str));
        }

        System.out.println("-----------------");

        Map map3 = new HashMap<>();
        map3.put("33","111");
        map3.put("22","5555");
        map3.put("44","789");
        map3.put("11","2232");

        Set<String> set3 = map3.keySet();
        for(String str : set3){
            System.out.println("key:" + str + " val:" + map3.get(str));
        }

        System.out.println("-----------------");

        Map map4 = new HashMap<>();
        map4.put("dd","111");
        map4.put("aa","5555");
        map4.put("cc","789");
        map4.put("bb","2232");

        Set<String> set4 = map4.keySet();
        for(String str : set4){
            System.out.println("key:" + str + " val:" + map4.get(str));
        }

        System.out.println("-----------------");

        Map map5 = new HashMap<>();
        for(int i=0;i<100;i++){
            map5.put("dd"+i,"111");
        }

        Set<String> set5 = map5.keySet();
        for(String str : set5){
            System.out.println("key:" + str + " val:" + map5.get(str));
        }*/


    }


}
