package theme7.task3;

public class Task {

    //Определить иерархию домашней техники.
    //● Включить некоторые в розетку.
    //● Рассчитать потребляемую мощность.
    //● Провести сортировку приборов в квартире на основе одного
    //из параметров.
    //● Найти кухонный прибор в квартире, соответствующий
    //заданному диапазону параметров.


    public void sortTechnique(Technique... techniques) {
        for (int i = 0; i < techniques.length - 1; i++) {
            for (int j = 0; j < techniques.length - i - 1; j++) {
                if (techniques[j + 1].getPrice() < techniques[j].getPrice()) {
                    Technique tmp = techniques[j];
                    techniques[j] = techniques[j + 1];
                    techniques[j + 1] = tmp;
                }
            }
        }

        for (Technique technique : techniques) {
            System.out.println(technique.getName());
        }
    }

    public void printTechnique(Technique... techniques) {
        for (Technique technique : techniques) {
            if (technique.calculatePower() < 20000 && technique.calculatePower() > 10000) {
                System.out.println(technique.getName());
            }
        }
    }
}
