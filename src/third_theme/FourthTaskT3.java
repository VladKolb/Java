package third_theme;

public class FourthTaskT3 {

    //Необходимо написать программу, которая бы вывела в консоль
    //звездочки вот таким образом:
    //*
    //* *
    //* * *
    //* * * *
    //* * * * *

    public void printStars(){
        for(int i = 1; i < 6; i++){
            System.out.println("* ".repeat(i));
        }
    }

}
