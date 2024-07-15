package third_theme;

public class EighthTaskT3 {

    //В американской армии считается несчастливым число 13, а в
    //японской - 4. Перед международными учениями штаб армии
    //решил исключить номера боевой техники, содержащие числа 4
    //или 13 (например, 40123, 13313, 12345 или 13040), чтобы не
    //смущать иностранных коллег. Если в распоряжении армии
    //имеется 100 тыс. единиц боевой техники и каждая боевая
    //машина имеет номер от 00001 до 99999, то сколько всего
    //номеров придётся исключить?
    //ух, ты какая забавная задачка :)

    public void numbersAmount(){
        int amount = 0;
        for(int i = 1; i < 100000; i++){
            if(String.valueOf(i).contains("4") || String.valueOf(i).contains("13")){
                amount++;
            }
        }

        System.out.println("Total numbers to be excluded: " + amount);
    }

    public void doubleLoop(){
        int amount = 0;
        for(int i = 1; i < 100000; i++){
            char[] digitArray = String.valueOf(i).toCharArray();
            for(int j = 0; j < digitArray.length; j++){
                String number = ""; //удалить - IDEA подсвечивает серым как неиспользуемое
                //если мы работаем с char, используем == для проверки примитивных типов, не нужно приводить к String
                //if(digitArray[j] == '4'){
                if(String.valueOf(digitArray[j]).equals("4")){
                    amount++;
                    break;
                } else if(j != digitArray.length - 1){
                    if(String.valueOf(digitArray[j]).equals("1") && String.valueOf(digitArray[j+1]).equals("3")){
                        amount++;
                        break;
                    }
                }
            }
        }

        System.out.println("Total numbers to be excluded: " + amount);
    }

}
