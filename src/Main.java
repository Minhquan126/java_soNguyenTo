import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong so nguyen to can in ra :");
      int  numb = scanner.nextInt();
boolean check = true;
int count = 0;
        for (int i = 2; count < numb; i++) {
            for (int j = 2;j < i - 1; j++) {
                if ( i % j == 0){
                    check = false;
                    break;
                } else {
                    check = true;
                }
            }
            if (check) {
                count ++;
                System.out.println(i);
            }
    }
}}