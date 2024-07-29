package theme7.task5;

public class Task {

    //Реализовать иерархию цветов (розы, гвоздики, тюльпаны,
    //лилии и... что-то на свой вкус).
    //● Создать несколько объектов-цветов.
    //● Собрать букет и определить его стоимость (в букет может
    //входить несколько цветов одного типа)
    //● Определить все цвета, используемые в букете.
    //● Определить когда весь букет завянет

    public void printBouquetPrice(Flower... flowers) {
        int totalPrice = 0;
        for (Flower flower : flowers) {
            totalPrice += flower.getPrice();
        }

        System.out.println(totalPrice + " BYN");
    }

    public void printColorsInBouquet(Flower... flowers) {
        int arraySize = flowers.length;
        for (int i = 0; i < arraySize; i++) {
            int duplicateColorAmount = 0;
            for (int j = i + 1; j < arraySize; j++) {
                if (flowers[i].getColor().equals(flowers[j].getColor())) {
                    duplicateColorAmount++;
                }
            }
            if (duplicateColorAmount > 0) {
                for (int k = i + 1, l = k; k < arraySize; k++) {
                    if (flowers[k] != flowers[i]) {
                        flowers[l++] = flowers[k];
                    }
                }
                arraySize -= duplicateColorAmount;
            }
        }

        Flower[] flowersColorWithoutDuplicates = new Flower[arraySize];
        System.arraycopy(flowers, 0, flowersColorWithoutDuplicates, 0, arraySize);
        for (Flower flower : flowersColorWithoutDuplicates) {
            System.out.println(flower.getColor());
        }

    }

    public void printMaxLifeTime(Flower... flowers) {
        int maxLifeTime = flowers[0].getLifeTime();
        for (int i = 1; i < flowers.length; i++) {
            if (maxLifeTime < flowers[i].getLifeTime()) {
                maxLifeTime = flowers[i].getLifeTime();
            }
        }
        System.out.println(maxLifeTime + " day's");
    }
}
