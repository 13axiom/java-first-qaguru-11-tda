package guru.qa;

import java.sql.SQLOutput;

public class FirstClass {
    public static void main(String[] args) {

        byte nubmerOfChairs = 127;
        short numberOfBooksInBiblio = 32767;
        long seaDepth = 32767L;
        double priceOfAllBooksInTheCity = 18_446_744_073_709_551_000.98D;
        char literaDoma = 'A';
        System.out.println("Some not real facts:");
        System.out.println("Number of chairs == 6? " + (nubmerOfChairs == 6));
        System.out.println("Number of books in biblio >= 0? " + (numberOfBooksInBiblio >= 0));
        System.out.println("Depth of the sea < 1_000_000km ? " + (seaDepth < 1_000_000));
        System.out.println("Price of all books in the city != 1999.99rub? " + (priceOfAllBooksInTheCity != 1999.99D));
        System.out.println("Литера моего дома " + literaDoma + "\n---\n");
        System.out.println("Examples:\n");
        System.out.println("2>3:" + (2 > 3));
        System.out.println("2<3:" + (2 < 3));
        System.out.println("\nAND");
        System.out.println("2<3 and 5>2 :" + ((2 < 3) && (5 > 2)));
        System.out.println("2>3 and 5>2 :" + ((2 > 3) && (5 > 2)));
        System.out.println("2<3 and 5<2 :" + ((2 < 3) && (5 < 2)));
        System.out.println("2>3 and 5<2 :" + ((2 > 3) & (5 < 2)));
        System.out.println("\nOR");
        System.out.println("2<3 or 5>2 :" + ((2 < 3) || (5 > 2)));
        System.out.println("2>3 or 5>2 :" + ((2 > 3) || (5 > 2)));
        System.out.println("2<3 or 5<2 :" + ((2 < 3) || (5 < 2)));
        System.out.println("2>3 or 5<2 :" + ((2 > 3) || (5 < 2)));

        int a = 10;
        System.out.println("\nnow a = " + a);
        a++;
        System.out.println("a++ это a = a+1 =" + a);
        System.out.println("now a = " + a);
        int c, b = 21;
        c = a + b;
        System.out.println("c = a+b = " + c);
        System.out.println("c/2 = " + (c / 2));
        System.out.println(("остаток от деления b на a = " + b % a));
        System.out.println("now a = " + a);
        System.out.println("a+=a это a= a+a =" + (a += a));
        System.out.println("now a = " + a);
        System.out.println("a-=2 это a= a-2 =" + (a -= 2));
        System.out.println("now a = " + a);

        System.out.println("\n----\nAbout books in our shop!\n");


        Book book1 = new Book();
        book1.author = "Grisha";
        book1.countOfCopies = 10;
        book1.name = "SpecialBook";
        book1.price = 1000.99F;
        book1.newBook = true;
        book1.getInfoAboutTheBook();

        System.out.println("\n");

        Book book2 = new Book();
        book2.author = "Montenegro";
        book2.countOfCopies = 0;
        book2.name = "Rare Book";
        book2.price = 19999.97F;
        book2.newBook = false;
        book2.getInfoAboutTheBook();

        System.out.println("\nРазница в цене книги 1 и 2 = " + (book2.price - book1.price));
        System.out.println("Сумма стоимости книг 1 и 2 = " + ((book2.price * book2.countOfCopies) + (book1.price * book1.countOfCopies)));

        System.out.println("\n_____\nПереполнение");
        System.out.println("byte [-128...127");
        byte min = -128;
        byte max = 127;
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        min -= 1;
        System.out.println("now min-1 = 127; true? " + (min == 127));
        max++;
        System.out.println("now max+1 = -128; true? " + (max == -128));
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("\nСложение разных типов\n");
        int iInt = 10;
        float fFloat = 10.1f;
        System.out.println("iInt = " + iInt + "\n" + "fFloat = " + fFloat);
        iInt += fFloat;
        System.out.println("iInt = iInt+fFloat = " + iInt);
        int iIntI = 10;
        float fFloatF = 10.1f;
        System.out.println("\niIntI = " + iIntI + "\n" + "fFloatF = " + fFloatF);
        fFloatF += iIntI;
        System.out.println("fFloatF = fFloatF+iIniI = " + fFloatF);
    }
}
