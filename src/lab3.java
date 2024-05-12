public class lab3 {
    //Створити програму виводу у консоль усіх додатних дільників числа
    //10 (дільники – цілі числа, які ділять число 10 без залишку)
    public static void main(String[] args) {
        int number=10;
        for(int a = 10;a<=number;a++){
            if(number%a==0){ //перевірка чи число а є дільником 10 без залишку
                System.out.println(a+" ");
            }
        }
    }

}
