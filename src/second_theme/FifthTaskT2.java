package second_theme;

import java.util.Scanner;

public class FifthTaskT2 {

    //Напишите программу, которая будет переводить
    //секунды в форматированный вид - сутки, часы,
    //минуты, секунды учитывая окончания слов

    public int enterNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");

        if(scanner.hasNextInt()){
            return scanner.nextInt();
        }
        else {
            System.out.println("This isn't a number or it's a big number. Returning 0.");
            return 0;
        }
    }

    public void timeTranslator(int seconds){
        String answer = "";
        if(seconds / 29030400 > 0){
            answer += seconds / 29030400 + " years ";
            seconds -= seconds / 29030400 * 29030400;
        }
        if(seconds / 2419200 > 0){
            answer += seconds / 2419200 + " month ";
            seconds -= seconds / 2419200 * 2419200;
        }
        if(seconds / 604800 > 0){
            answer += seconds / 604800 + " weeks ";
            seconds -= seconds / 604800 * 604800;
        }
        if(seconds / 86400 > 0){
            answer += seconds / 86400 + " days ";
            seconds -= seconds / 86400 * 86400;
        }
        if(seconds / 3600 > 0){
            answer += seconds / 3600 + " hours ";
            seconds -= seconds / 3600 * 3600;
        }
        if(seconds / 60 > 0){
            answer += seconds / 60 + " minutes ";
            seconds -= seconds / 60 * 60;
        }
        answer += seconds + " seconds";

        System.out.println(answer);
    }

}
