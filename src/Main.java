import first_theme.FirstTask;
import first_theme.SecondTask;
import fourth_theme.*;
import second_theme.*;
import theme5.Fraction;
import theme5.Phone;
import theme7.task2.Ball;
import theme7.task2.Cube;
import theme7.task3.Fridge;
import theme7.task3.Lamp;
import theme7.task3.TV;
import theme7.task3.Task;
import theme7.task5.*;
import third_theme.*;

public class Main {
    public static void main(String[] args) {

        FirstTask firstTask1 = new FirstTask();
        SecondTask secondTask1 = new SecondTask();

        FirstTaskT2 firstTaskT2 = new FirstTaskT2();
        SecondTaskT2 secondTaskT2 = new SecondTaskT2();
        ThirdTaskT2 thirdTaskT2 = new ThirdTaskT2();
        FourthTaskT2 fourthTaskT2 = new FourthTaskT2();
        FifthTaskT2 fifthTaskT2 = new FifthTaskT2();
        SixthTaskT2 sixthTaskT2 = new SixthTaskT2();
        SeventhTaskT2 seventhTaskT2 = new SeventhTaskT2();
        EighthTaskT2 eighthTaskT2 = new EighthTaskT2();
        NinthTaskT2 ninthTaskT2 = new NinthTaskT2();

        FirstTestT3 firstTestT3 = new FirstTestT3();
        SecondTaskT3 secondTaskT3 = new SecondTaskT3();
        ThirdTaskT3 thirdTaskT3 = new ThirdTaskT3();
        FourthTaskT3 fourthTaskT3 = new FourthTaskT3();
        FifthTaskT3 fifthTaskT3 = new FifthTaskT3();
        SixthTaskT3 sixthTaskT3 = new SixthTaskT3();
        SeventhTaskT3 seventhTaskT3 = new SeventhTaskT3();
        EighthTaskT3 eighthTaskT3 = new EighthTaskT3();
        NinthTaskT3 ninthTaskT3 = new NinthTaskT3();
        TenthTaskT3 tenthTaskT3 = new TenthTaskT3();
        EleventhTaskT3 eleventhTaskT3 = new EleventhTaskT3();
        TwelfthTaskT3 twelfthTaskT3 = new TwelfthTaskT3();

        FirstTaskT4 firstTaskT4 = new FirstTaskT4();
        SecondTaskT4 secondTaskT4 = new SecondTaskT4();
        ThirdTaskT4 thirdTaskT4 = new ThirdTaskT4();
        FourthTaskT4 fourthTaskT4 = new FourthTaskT4();
        FifthTaskT4 fifthTaskT4 = new FifthTaskT4();
        SixthTaskT4 sixthTaskT4 = new SixthTaskT4();
        SeventhTaskT4 seventhTaskT4 = new SeventhTaskT4();
        EighthTaskT4 eighthTaskT4 = new EighthTaskT4();
        NinthTaskT4 ninthTaskT4 = new NinthTaskT4();
        TenthTaskT4 tenthTaskT4 = new TenthTaskT4();
        EleventhTaskT4 eleventhTaskT4 = new EleventhTaskT4();
        TwelfthTaskT4 twelfthTaskT4 = new TwelfthTaskT4();
        ThirteenthTaskT4 thirteenthTaskT4 = new ThirteenthTaskT4();

        Fraction fraction = new Fraction(1, 2);
        Phone phone1 = new Phone("+375(44)111-11-11", "Iphone 15", 0.245);
        Phone phone2 = new Phone("+375(44)222-22-22", "Iphone 16", 0.325);
        Phone phone3 = new Phone("+375(44)333-33-33", "Iphone 14", 0.177);

        Cube cube = new Cube(2);
        Ball ball = new Ball(2);

        Fridge fridge1 = new Fridge("Atlant", "ATLANT XM 4208-000", 100, true, 900,
                false, 2);
        Fridge fridge2 = new Fridge("LG", "LG GA-B509CQWL", 83, false, 2700,
                true, 4);
        TV tv1 = new TV("Samsung", "UE50AU7002UXRU", 50, true, 1600, 50);
        Lamp lamp1 = new Lamp("INhome", "CCO 08", 15, false, 50, "White");
        Task task3 = new Task();

        Carnation carnation = new Carnation("Beautiful carnation", "Red", 50, 40, 3,
                "Sweet", true);
        Gypsophila gypsophila = new Gypsophila("Beautiful gypsophila", "White", 23, 50, 10,
                2);
        Lily lily = new Lily("Beautiful lily", "Yellow", 20, 30, 4, 2);
        Rose rose = new Rose("Beautiful rose", "White", 40, 60, 7, "GoodRose",
                true);
        Tulip tulip = new Tulip("Beautiful tulip", "Yellow", 10, 15, 6, "Barhat",
                10);
        theme7.task5.Task task5 = new theme7.task5.Task();

        //firstTask1.solution();
        //secondTask1.solution();

        //firstTaskT2.findMiddle(firstTaskT2.enterNumber(), firstTaskT2.enterNumber(), firstTaskT2.enterNumber());
        //secondTaskT2.isEven(secondTaskT2.enterNumber());
        //thirdTaskT2.finger(thirdTaskT2.enterNumber());
        //fourthTaskT2.weekDay(fourthTaskT2.enterNumber());
        //fifthTaskT2.timeTranslator(fifthTaskT2.enterNumber());
        //sixthTaskT2.nextDay(sixthTaskT2.enterNumber(), sixthTaskT2.enterNumber(), sixthTaskT2.enterNumber());
        //seventhTaskT2.runTheSolution();
        /* System.out.println("Enter a, b, c");
        eighthTaskT2.findRoots(eighthTaskT2.enterNumber(), eighthTaskT2.enterNumber(), eighthTaskT2.enterNumber());*/
        //ninthTaskT2.restOfTime(ninthTaskT2.enterNumber());

        //firstTestT3.multiplicationTable();
        //secondTaskT3.geometricProgression();
        //thirdTaskT3.printStars();
        //fourthTaskT3.printStars();
        //fifthTaskT3.sumAndProd(fifthTaskT3.enterNumber());
        //sixthTaskT3.findMax(sixthTaskT3.enterNumber());
        //System.out.println(seventhTaskT3.factorial(seventhTaskT3.enterNumber()));
        eighthTaskT3.numbersAmount();
        //ninthTaskT3.luckyTickets();
        //tenthTaskT3.labelAmount();
        //eleventhTaskT3.symmetricalAmount();
        //twelfthTaskT3.printFibonacciNumbers();

        //firstTaskT4.findMaxValue();
        //secondTaskT4.findMinValue();
        //thirdTaskT4.findSum();
        //fourthTaskT4.findMaxValue();
        //fifthTaskT4.findMinValue();
        //sixthTaskT4.filter();
        //seventhTaskT4.findMinAndMaxValuesIndexes();
        //eighthTaskT4.mergingArrays();
        //ninthTaskT4.deleteDuplicates();
        //tenthTaskT4.findStringWithMaxSum();
        //eleventhTaskT4.transposition();
        //twelfthTaskT4.reverseArray();
        //thirteenthTaskT4.competeTask();

        //fraction.printFraction();
        //fraction.addingFractions(3, 100);
        //fraction.multiplyingOnDouble(0.1);
       /* phone1.printValues();
        phone2.printValues();
        phone3.printValues();*/

        /*phone1.receiveCall("Влад", phone1.getNumber());
        phone2.receiveCall("Вова", phone2.getNumber());
        phone3.receiveCall("Миша", phone3.getNumber());*/
        //thirteenthTaskT4.competeTask();
    }

        //phone1.sendMessage(phone2.getNumber(), phone3.getNumber());

        //System.out.println(ball.getVolume());

        //task3.printTechnique(lamp1, tv1, fridge1, fridge2);
        //task5.printColorsInBouquet(carnation, lily, gypsophila, rose, tulip);
        //task5.printMaxLifeTime(carnation, lily, tulip, rose, gypsophila);
        //task5.printBouquetPrice(tulip, tulip, rose, gypsophila, lily, carnation, carnation);

    }
}