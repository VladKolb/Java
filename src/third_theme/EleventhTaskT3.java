package third_theme;

public class EleventhTaskT3 {

    //Электронные часы показывают время в формате от 00:00 до
    //23:59. Подсчитать сколько раз за сутки случается так, что слева
    //от двоеточия показывается симметричная комбинация для той,
    //что справа от двоеточия (например, 02:20, 11:11 или 15:51)

    public void symmetricalAmount(){
        int amount = 0;
        for(int i = 0; i < 24; i++){
            StringBuilder hourString = new StringBuilder();
            hourString.append(i);
            while(hourString.length() != 2){
                hourString.insert(0, 0);
            }



            for(int j = 0; j < 60; j++){
                StringBuilder minuteString = new StringBuilder();
                minuteString.append(j);
                while(minuteString.length() != 2){
                    minuteString.insert(0, 0);
                }

                if(hourString.toString().contentEquals(minuteString.reverse())){
                    amount++;
                }
            }
        }

        System.out.println("Occurrences of symmetrical time: " + amount);
    }

}
