

public class Main {

    public static void main(String[] args) {


        System.out.println( "Задание 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println( "Задание 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println( "Задание 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println( "Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println( "Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10 / 3.5 + 4;
        System.out.println(frog);

        System.out.println( "Задание 6");
        var weightBoxerOne = 78.2;
        System.out.println(weightBoxerOne);
        var weightBoxerTwo = 82.7;
        System.out.println(weightBoxerTwo);
        var liftingCapacity = weightBoxerOne + weightBoxerTwo;
        System.out.println( "Общий вес боксёров  " +  liftingCapacity);
        var capacityLeft = weightBoxerTwo - weightBoxerOne;
        System.out.println("Разница в весе " + capacityLeft );

        System.out.println( "Задание 7");
        var totalWeight = weightBoxerTwo % weightBoxerOne;
        System.out.println("Разница в весе " + totalWeight + "кг !");

        System.out.println( "Задание 8");
        var totalWorkTime = 640;
        var workTimeOnePeople = 8;
        var worker = totalWorkTime / workTimeOnePeople;
        System.out.println("Всего работников " + worker + " человек! ");
var workerCompanyTwo = worker + 94;
System.out.println("Если в компании работает " + workerCompanyTwo + " человека, то всего " + (workerCompanyTwo * 8) + " часов работы может быть поделено между сотрудниками. ");




    }
}
