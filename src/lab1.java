public class lab1 {
    public static void main(String[] args) {
        //Створити програму виводу у консоль усіх значень від 500 до 650 з
        //кроком 10 використовуючи усі оператори циклів for, while та do-while.
        System.out.println("Оператор for:");
        for(int a=500;a<=650;a=a+10){
            System.out.println(a+"");
        }
        int n =500;
        System.out.println("Оператор while:");
        while (n<=650){
            System.out.println(n+"");
            n+=10;
        }
        System.out.println("Оператор do-while:");
        int i=500;
        do {
            System.out.print(i + " ");
            i += 10;
        } while (i <= 650);
    }
}
