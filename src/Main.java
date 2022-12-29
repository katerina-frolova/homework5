public class Main {
    public static void main(String[] args) {
        task1();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1-2");
        int clientOS=1;
        int clientDeviceYear=2014;
        if(clientOS==0&&clientDeviceYear>=2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if(clientDeviceYear<2015&&clientOS==0){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
            if(clientOS==1&&clientDeviceYear>=2015){
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        if(clientDeviceYear<2015&&clientOS==1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }

    public static void task3 () {
        System.out.println("Задача 3");
        int year=2000;
        int a=year%4;
        int b=year%100;
        int c=year%400;
        if(a==0&&b!=0||c==0){
            System.out.println(year+" год является високосным");
        } else {
            System.out.println(year+" год не является високосным");
        }

    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance=120;
        int day=1;
        if(deliveryDistance>20){
            day=day+1;
        }
        if(deliveryDistance>=20&&deliveryDistance<60){
        day=2;
        }
        if(deliveryDistance>60){
            day=day+1;
        }
        if(deliveryDistance>100) {
            System.out.println("Доставки нет");
        }else {
            System.out.println("Потребуется дней: " + day);
        }

    }

    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber=9;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Этот месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлежит к сезону лето");
                break;
            case 10:
            case 11:
            case 9:
                System.out.println("Этот месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}