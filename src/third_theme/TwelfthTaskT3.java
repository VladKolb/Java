package third_theme;

public class TwelfthTaskT3 {

    //Выведите на экран первые 10 членов последовательности
    //Фибоначчи

    public void printFibonacciNumbers(){
        StringBuilder fibonacciNumbersString = new StringBuilder();
        for(int i = 0; i < 11; i++){
            fibonacciNumbersString.append(fibonacciNumbers(i));
            fibonacciNumbersString.append(" ");
        }

        System.out.println(fibonacciNumbersString.toString()); //вот тут тоже idea сереньким подсвечиваем
        //System.out.println(fibonacciNumbersString); //будет работать без toString(), System.out.println сам вызывает .toString() у классов
        // курсор стоит на сереньком и нажимаешь Alt+Enter, и idea расскажет, что сделать
    }

    public int fibonacciNumbers(int pow){
        if(pow >= 3){
            return fibonacciNumbers(pow - 1) + fibonacciNumbers(pow - 2);
        } else if (pow == 2) {
            return 1;
        } else {
            return 0;
        }
    }
}
