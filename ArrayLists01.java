package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Tacettin");

        List<String> cities = new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Tacettin");

        names.removeAll(cities);//removeAll kullandığınızda sadece ilk list değişir. parantezin içindeki list değişmez.

        System.out.println(names);
        System.out.println(cities);

        List<String> myNames = new ArrayList<>();

        myNames.add("Thomas");
        myNames.add("Tahsin");

        boolean b1 = names.containsAll(myNames);
        System.out.println(b1);

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        //[Shoes, TV, Radio, Laptop, Shoes, Book, Shoes]

        //Ex 1 : "a" listinde "Shoes" elemanının ilk görünümünü siliniz.

        a.remove("Shoes");
        System.out.println(a); //[TV, Radio, Laptop, Shoes, Book, Shoes]

        //Ex 2 : "a" listinde "Shoes" elemanının tüm görünümlerini siliniz.

        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");
        a.removeAll(silinecekler);
        System.out.println(a); //[TV, Radio, Laptop, Book]

        //Ex 3 : Bir tane salary list oluşturun. Eğer salary 10000 den az ise %20
        //       10000 den çok ise %10 zam yapınız.


        List<Double> salary = new ArrayList<>();

        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);

        System.out.println(salary);

        for (Double w:salary) {
            if (w<10000){
                salary.set(salary.indexOf(w),w*1.2);
            }else {
                salary.set(salary.indexOf(w),w*1.1);
            }
        }
        System.out.println(salary);

        //Ex 4: İki ArrayList in eşit olup olmadığını kontrol eden kodu yazınız.
        // İki ArrayList in eşit olabilmesi için elemanlar eşit olmalı ve aynı elemanlar aynı indexte olmalı.

        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');
        //m.add('t');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //1. Yol

        int counter = 0;

        for (int i = 0; i < m.size(); i++) {
            if (m.size()!=n.size()){
                System.out.println("Listler Eşit Değildir");
                counter++;
                break;
            }

            else if (m.get(i) != n.get(i)){
                counter++;
                System.out.println("Listler Eşit Değildir");
                break;
            }
        }if (counter==0){
            System.out.println("Listler Eşittir");
        }

        //2.Yol
        boolean esitMi = m.equals(n);
        if (esitMi){
            System.out.println("Listler Eşit");
        }else System.out.println("Listler eşit değildir");




















    }
}
