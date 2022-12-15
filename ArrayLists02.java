package day17arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists02 {
    public static void main(String[] args) {

        //Ex 1: Verilen bir listteki elemanları tekrarsız olarak yazınız.

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);

        List<Integer> yeni = new ArrayList<>();

        for (Integer w:a ) {
            if (!yeni.contains(w)){
                yeni.add(w);
            }

        }
        System.out.println(yeni);

        //Kullanıcıdan bir harf alınız. Harf sizdeki listin içinde varsa o harfi "Bulundu" ya çeviriniz.
        // Yoksa o harfi List e ekleyiniz. [A, K, R, S] ==> R ==> [A, K, Bulundu, S]
        //                                 [A, K, R, S] ==> P ==> [A, K, R, S, P]

        Scanner scan = new Scanner(System.in);
        String harf = "";
        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");

        do {
            System.out.println("Lütfen Bir Harf Giriniz");
            harf = scan.next().substring(0, 1);

            if (c.contains(harf)) {
                c.set(c.indexOf(harf), "Bulundu");
            } else if(!harf.equals("Q")){
                c.add(harf);
            }
        }while (!harf.equals("Q"));
        System.out.println(c);










    }
}
