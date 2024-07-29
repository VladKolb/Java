package theme7.task4;

public class Task {

    //Авиакомпания.
    //● Определить иерархию самолетов, вертолетов,
    //квадрокоптеров и т.д.
    //● Создать авиакомпанию.
    //● Посчитать общую вместимость и грузоподъемность.
    //● Провести сортировку летных средств компании по
    //дальности полета.
    //● Найти самолет в компании, соответствующий заданному
    //диапазону параметров.

    public void printTotalCapacity(FlyingVehicles... flyingVehicles) {
        int totalCapacity = 0;
        for (FlyingVehicles flyingVehicle : flyingVehicles) {
            totalCapacity += flyingVehicle.getCapacity();
        }

        System.out.println(totalCapacity);
    }

    public void printTotalLoadCapacity(FlyingVehicles... flyingVehicles) {
        int totalLoadCapacity = 0;
        for (FlyingVehicles flyingVehicle : flyingVehicles) {
            totalLoadCapacity += flyingVehicle.getLoadCapacity();
        }

        System.out.println(totalLoadCapacity + " kg");
    }

    public void sortFlyingVehicles(FlyingVehicles... flyingVehicles) {
        for (int i = 0; i < flyingVehicles.length - 1; i++) {
            for (int j = 0; j < flyingVehicles.length - i - 1; j++) {
                if (flyingVehicles[j + 1].getRangeOfFlight() < flyingVehicles[j].getRangeOfFlight()) {
                    FlyingVehicles tmp = flyingVehicles[j];
                    flyingVehicles[j] = flyingVehicles[j + 1];
                    flyingVehicles[j + 1] = tmp;
                }
            }
        }

        for (FlyingVehicles flyingVehicle : flyingVehicles) {
            System.out.println(flyingVehicle.getName());
        }
    }

    public void printFlyingVehicles(FlyingVehicles... flyingVehicles) {
        for (FlyingVehicles flyingVehicle : flyingVehicles) {
            if (flyingVehicle.getCapacity() < 1000 && flyingVehicle.getCapacity() > 100) {
                System.out.println(flyingVehicle.getName());
            }
        }
    }

}
