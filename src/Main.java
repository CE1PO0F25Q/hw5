public class Main {
    public static void main(String[] args) {


        System.out.println(" задача 1");
        int age = 18;
        if (age > 18) {
            System.out.println(" если возраст человека равен " + age + " то он совершеннолетний ");
        }
        if (age < 18) {
            System.out.println(" совершеннолетие еще не настулило и нужно подождать");
        }
        System.out.println(" если возраст человека равен  18 , то он совершеннолетний/ он не достиг совершеннолетия нужно подождать .");

        System.out.println(" задача 2");
        int temperature = 5;
        if (temperature > 5) {
            System.out.println(" на улице холодно, нужно надеть шапку ");
        }
        if (temperature < 5) {
            System.out.println(" сегодня тепло можно идти без шапки");
        }
        System.out.println(" на улице мельше 5 градусов ,нужно надеть шапку / можно идти без шапки.");

        System.out.println("задача 3");
        int speed = 50;
        if (speed > 60) {
            System.out.println(" скорость привышена если она больше 60 км/ч");
        }
        if (speed < 60) {
            System.out.println(" привышения скорости нет, если она меньше 60 км/ч");
        }
        System.out.println(" если скороть " + speed + " км/ч ,то придется заплатить штраф  / можно ездить спокойно  ");


        System.out.println("задача 4");

        int age1 = 6;
        if (age1 >= 2 || age1 >= 6) {
            System.out.println(" возраст подходит для сада ");
        } else {
            System.out.println(" возраст не подходит для сада");
        }
        System.out.println(" если возраст человека равен " + age1 + " то ему нужно ходить в детский сад");

        int age2 = 18;
        if (age2 >= 7 || age >= 18) {
            System.out.println(" возраст подходит для школы ");
        } else {
            System.out.println(" возраст не подходит для школы");
        }
        System.out.println(" если возраст человека меньше " + age2 + " то ему нужно ходить в школу ");

        int age3 = 24;
        if (age3 <= 18 || age3 >= 24) {
            System.out.println(" его место на работе ");
        } else {
            System.out.println(" его возраст не подходит для работы");
        }
        System.out.println(" если возраст человека меньше  " + age3 + " то ему нужно ходить на работу ");

        int age4 = 24;
        if (age4 <= 24) {
            System.out.println(" ему пора ходить на работу");
        } else {
            System.out.println(" еще рано ходить на работу");
        }
        System.out.println(" если возраст человека больше " + age4 + " то ему пора на работу ");


        System.out.println("задача 5");
        int toKid = 4;
        int toKid2 = 13;
        int toKid3 = 15;
        boolean soitableFonAttraction = toKid < 5 && toKid > 14;

        if (toKid < 5) {
            System.out.println(" если возраст ребенка " + toKid + " года, кататься на атракционах нельзя .");
        }
        if (toKid2 > 5 && toKid2 < 14) {
            System.out.println(" если возраст ребенка " + toKid2 + " лет, можно кататься на атракционах в сопровождении взрослых .");
        } else {
            System.out.println(" кататься на атрационе в возрасте " + toKid2 + " лет , без сопровождения взрослых нельзя .");
            if (toKid3 > 14) ;
            System.out.println(" если возраст " + toKid3 + " лет, то нельзя кататься на атракционе без сопровождения совершеннолетнего.");
        }
        if (soitableFonAttraction) {
            System.out.println(" он может кататься без сопровождения взрослого.");
        }
        System.out.println(" если возраст человека равен меньше 5 лет, то ему нельзя кататься на атракционах , если ребенку меньше 14 лет то он может кататься на атракционах в сопровождении взрослого, если старше 14 то можно кататься ");


        System.out.println("задача 6");
        int trainCar = 102;
        int sedantary = 60;
        int standing = 42;
        boolean thereAreNoSeats = sedantary >= 60 && standing >= 42;

        if (sedantary >= 60) {
            System.out.println(" то сидячих мест больше нет");
        }
        if (standing >= 42) {
            System.out.println(" то стоячих мест больше нет");
        }
        if (thereAreNoSeats) {
            System.out.println(" то вагон уже полностью забит");
        }


        System.out.println("задача 7");
        int one = 20;
        int two = 40;
        int three = 60;
        boolean more = three >= 60;

        if (one >= 20) {
            System.out.println(" то оно самое меньшее.");
        }
        if (two >= 40) {
            System.out.println(" то оно среднее число.");
        }
        if (three >= 60) {
            System.out.println("то это самое большее число.");
        }
    }
}
































