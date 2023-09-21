package OOP;

import javax.xml.crypto.Data;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*
1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны
 для приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва


 Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно
  использовать не все придуманные поля и методы. Создайте несколько экземпляров
   этого класса, выведите их в консоль.

2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его
 кличка, цвет и возраст (или другие параметры на ваше усмотрение).
*/

    Cat cat1 = new Cat ("Tom" ,1,"Веслоухий","01.05.23",3,true);
    Cat cat2 = new Cat ("Жулик" ,1,"майнкун","10.12.20",3,true);
    Cat cat3 = new Cat ("Мурка" ,1,"без породная","06.05.23",3,false);

    CatCleaner cats = new CatCleaner();
    cats.checCat(cat1);
    cats.checCat(cat2);
    cats.checCat(cat3);

//    System.out.println(cat1.toString());
    }
}
