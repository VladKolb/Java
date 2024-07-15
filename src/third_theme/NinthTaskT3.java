package third_theme;

public class NinthTaskT3 {

    //В городе N проезд в трамвае осуществляется по бумажным
    //отрывным билетам. Каждую неделю трамвайное депо
    //заказывает в местной типографии рулон билетов с номерами от
    //000001 до 999999. «Счастливым» считается билетик у которого
    //сумма первых трёх цифр номера равна сумме последних трёх
    //цифр, как, например, в билетах с номерами 003102 или 567576.
    //Трамвайное депо решило подарить сувенир обладателю
    //каждого счастливого билета и теперь раздумывает, как много
    //сувениров потребуется. С помощью программы подсчитайте
    //сколько счастливых билетов в одном рулоне?

    public void luckyTickets(){ //это тоже задачка на % - искать цифры через остаток от деления
        int amountOfTickets = 0;
        for(int i = 1; i < 1000000; i++){
            StringBuilder numberString = new StringBuilder();
            numberString.append(i);
            while(numberString.length() != 6){
                numberString.insert(0,"0");
            }

            char[] digitArray = numberString.toString().toCharArray();
            int firstHalfSum = 0;
            int secondHalfSum = 0;
            for(int j = 0; j < digitArray.length; j++){
                if(j < 3){
                    firstHalfSum += Integer.parseInt(String.valueOf(digitArray[j]));
                }
                else{
                    secondHalfSum += Integer.parseInt(String.valueOf(digitArray[j]));
                }
            }

            if(firstHalfSum == secondHalfSum){
                amountOfTickets++;
            }
        }

        System.out.println("Number of lucky tickets in one roll: " + amountOfTickets);
    }


}
