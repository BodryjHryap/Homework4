public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1() {
        System.out.println("Задание 1");
        int age = 8;
        if (age >= 18) {
            System.out.println("Вам " + age + " лет. Вы совершеннолетний!");
        }else{
            System.out.println("Вам " + age + " лет. Вы несовершеннолетний, нужно немного подождать.");
        }
    }
    public static void task2() {
        System.out.println("Задание 2");
        int airTemperature = 4;
        if (airTemperature < 5) {
            System.out.println("На улице " + airTemperature + " градусов, нужно надеть шапку.");
        }else{
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки.");
        }
    }
    public static void task3() {
        System.out.println("Задание 3");
        int vehicleSpeed = 80;
        if (vehicleSpeed > 60) {
            System.out.println("Если скорость " + vehicleSpeed + " км/ч, то приедтся заплатить штраф.");
        }else{
            System.out.println("Если скорость " + vehicleSpeed + " км/ч, то можно ездить спокойно.");
        }
    }
    public static void task4() {
        System.out.println("Задание 4");
        int age = 65;
        if (age < 2) {
            System.out.println("Тебе " + age + " лет. Тебе пора спать.");
        } else if (age >= 2 && age <= 6) {
            System.out.println("Тебе " + age + " лет. Тебе нужно ходить в детский сад.");
        } else if (age > 7 && age <= 18) {
            System.out.println("Тебе " + age + " лет. Тебе нужно ходить в школу.");
        } else if (age > 18 && age <= 24) {
            System.out.println("Тебе " + age + " лет. Твое место в университете.");
        } else if (age > 24 && age < 60) {
            System.out.println("Тебе " + age + " лет. Тебе пора ходить на работу.");
        } else {
            System.out.println("Тебе " + age + " лет. Тебе пора отдохнуть.");
        }
    }
    public static void task5() {
        System.out.println("Задание 5");
        int age = 5;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " лет, то ему нельзя кататься на аттракционе.");
        }
        if (age >= 5 && age < 14){
            System.out.println("Если возраст ребенка равен " + age + " лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        if (age >= 14){
            System.out.println("Если возраст ребенка равен " + age + " лет, то он может кататься без сопровождения взрослого");
        }
    }
    public static void task6(){
        System.out.println("Задание 6");
        int passengerCount = 59;
        int seatPlaces = 60;
        int wagonCapacity = 102;
        if (passengerCount >= wagonCapacity){
            System.out.println("Количество пассажиров равно " + passengerCount + " человек. Вагон полностью забит.");
        }else if(passengerCount < wagonCapacity && passengerCount >= seatPlaces){
                System.out.println("Количество пассажиров равно " + passengerCount + " человек. В вагоне остались только стоячие места.");
        }else{
                System.out.println("Количество пассажиров равно " + passengerCount + " человек. В вагоне есть сидячие места.");
        }
    }
    public static void task7() {
        System.out.println("Задание 7");
        int one = 1;
        int two = 11;
        int three = 11;
        if (one > two) {
            if (one > three) {
                System.out.println("Максимальное число one: " + one);
            } else if (one < three){
                System.out.println("Максимальное число three: " + three);
            } else if (one == three) {
                System.out.println("Максимальное число one и three: " + one + ' ' + three);
            }
        } else if (one < two) {
            if (two > three) {
                System.out.println("Максимальное число two: " + two);
            } else if (two < three) {
                System.out.println("Максимальное число three: " + three);
            } else if (two == three) {
                System.out.println("Максимальное число two и three: " + two + ' ' + three);
            }
        } else if (one == two) {
            if (two > three) {
                System.out.println("Максимальное число one и two: " + one + ' ' + two);
            } else if (two < three) {
                System.out.println("Максимальное число three: " + three);
            } else {
                System.out.println("Числа: one, two, three - равны: " + one + ' ' + two + ' ' + three);
            }
        }
    }
}