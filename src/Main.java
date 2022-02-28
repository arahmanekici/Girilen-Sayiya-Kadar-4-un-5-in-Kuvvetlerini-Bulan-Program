import java.util.Scanner;
public class Main {
    static public void main(String[] args){
        Scanner input = new Scanner (System.in);
        String appInformation= ("Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.");

        System.out.println(appInformation);
        System.out.println("Please enter your number: ");
        int number1 = input.nextInt();
        int total=0;
        int number2= 1;
        System.out.println("4 ve 5 e bölünen kuvvetleri: ");

        for (int a=1 ; a<number1; a++) {

            if (a%4== 0 && a%5==0) {
                System.out.print(number2+ " : ");
                System.out.println(a);
                number2++; }
        }


    }
}
