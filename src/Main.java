public class Main {
    public static void main(String[] args) {


        //задача 1
        System.out.println( " задача 1");
        int age = 21;
        if (age >=18) {
            System.out.println(" поздравляем вас с совершеннолетием !");
        }
        if (age < 18) {
            System.out.println(" совершеннолетие еще не настулило и нужно подождать");
        }


         //задача 2
        System.out.println( " задача 2");
        int temperature = 4;
        if (temperature < 5) {
            System.out.println(" на улице холодно, нужно надеть шапку ");
        }
        if (temperature > 5) {
            System.out.println(" сегодня тепло можно идти без шапки");
        }


        //задача 3
        System.out.println( " задача 3");
        int speed = 50;
        if (speed > 60) {
            System.out.println(" скорость привышена если она больше 60 км/ч");
        }
        if (speed < 60) {
            System.out.println(" привышения скорости нет, если она меньше 60 км/ч");
        }



        //задача 4
        System.out.println( " задача 4");
        int yearsOld = 13;
        if ( yearsOld >= 2 && yearsOld <= 6) {
            System.out.println(" если возраст человека равен  "+ yearsOld + " то ему нужно ходить в детский сад");
        } else if ( yearsOld >=6 && yearsOld <=18 ){
            System.out.println(" если возраст человека равен "+  yearsOld  + " то ему нужно ходить в школу ");
        }else if (  yearsOld >= 18 &&  yearsOld <= 24 ) {
            System.out.println(" если возраст человека равен " + yearsOld + " то ему нужно ходить в университет");
        }else if (  yearsOld >24 ){
            System.out.println( " если возраст человека равен "+  yearsOld +" то ему нужно идти на работу");
        }


        //задача 5
        System.out.println( " задача 5");
        if ( yearsOld <5 ){
            System.out.println( " ребенок не может кататься на атракционах ");
        }else if (yearsOld <14  ){
            System.out.println( " ребенок может кататься только в сопровождении взрослого ");
        }else if ( yearsOld >=14){
            System.out.println( " ребенок может кататься ");
        }


        System.out.println("задача 6");
        int capacity = 102;
        int sedantary = 60;
        int otherCount =capacity- sedantary;// стоячих мест

        int sedantaryUsed = 59;
         int otherUsed = 43;
         if ( sedantaryUsed < sedantary){
             System.out.println( " есть еще "+ (sedantary-sedantaryUsed)+ "сидячих мест ");
         }else {
             System.out.println( " сидячих мест нет !");
         }
         if ( otherUsed < otherCount){
             System.out.println( " есть еще "+ ( otherUsed-otherCount)+ "стоячих мест" );
         }else {
             System.out.println(" стоячих мест нет!");
         }


        System.out.println("задача 7");
        int one = 20;
        int two = 40;
        int three = 60;
        if ( one > two ){
        if ( one > three ){
            System.out.println( " максимальное число - " +one );
        }else {
            System.out.println( " максимальное число - " + three );
        }
        }else if( two> one){
            if (two>= three ){
                System.out.println( "максимальное число - " +two );
            }else {
                System.out.println( " максимальное число -"+three );
            }
        }else {
            if (one >three ){
                System.out.println( "максимальное число - " +one);
            }else if (three > one ){
                System.out.println( " максимальное число -"+three);
            }else {
                System.out.println( " все 3 числа равны ");
            }
        }


        }
    }

































