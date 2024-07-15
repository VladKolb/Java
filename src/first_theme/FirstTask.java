package first_theme; //знак подчеркивания в java - это не по феншую) только в константах можно будет, когда дойдешь до static final
// если такое имя, то делается две папки first и theme, и package first.theme
// для удобства и упорядочивания папок я бы тебе предложила их называть theme1, theme2 и так далее

import java.util.Scanner;

public class FirstTask {

    // Вывести 3-ю цифру 5-тизначного числа

    public void solution(){ //названия методов начинаюится с глагола, например, printThirdDigitOfFiveDigitsNumber()
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");

        if(scanner.hasNextInt()){
            String stringNumber = String.valueOf(scanner.nextInt());
            if(stringNumber.length() != 5){
                System.out.println("Invalid number input! Try again!");
                return;
            }
            System.out.println(stringNumber.charAt(2));
        }
        else{
            System.out.println("This isn't a number.");
        }
    }
}
