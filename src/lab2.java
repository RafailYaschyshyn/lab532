public class lab2 {
    public static void main(String[] args) {
        // Створити програму виводу у консоль усіх значень менше 5000
        // послідовності 2а-1, за умови що перше значення а=2
        for(int a=2;a<=5000;a=(2*a-1)){
            System.out.println(a);
        }
    }
}
