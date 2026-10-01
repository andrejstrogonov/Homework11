public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        System.out.println(calculatorLeapYear(2024));
        System.out.println("Задача 2");
        System.out.println(calculateDeviceVersion(1,2014));
        System.out.println("Задача 3");
        System.out.println(calculateDeliveryDistance(50));
    }
    public static String calculatorLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return year + " год — високосный год";
        } else {
            return year + " год — невисокосный год";
        }
    }
    public static String calculateDeviceVersion(int operationSystemType, int clientDeviceYear) {
        if (operationSystemType == 1) {
            if (clientDeviceYear <= 2015) {
                return "Установите облегченную версию приложения для Android по ссылке";
            } else {
                return "Установите версию приложения для Android по ссылке";
            }
        } else {
            if (clientDeviceYear <= 2015) {
                return "Установите облегченную версию приложения для iOS по ссылке";
            } else {
                return "Установите версию приложения для iOS по ссылке";
            }
        }
    }

    public static String calculateDeliveryDistance(int deliveryDistance) {
        if (deliveryDistance > 20 && deliveryDistance <= 60){
            return "Потребуется дней: " + 2;
        }
        if (deliveryDistance >= 1 && deliveryDistance < 20){
            return "Потребуется дней: " + 1;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100){
            return "Потребуется дней: " +3;
        }
        if (deliveryDistance >100){
            return "Доставки нет";
        }
        return null;
    }
}