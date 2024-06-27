import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");
        System.out.println(" (+)-(-)-(/)-(*)");
        String islem = scanner.nextLine();
        int A,B,C;
        System.out.print("İlk sayı : ");
        A = scanner.nextInt();
        System.out.print("İkinci sayı : ");
        B = scanner.nextInt();
        switch (islem){
            case ("+"):
                C = A + B;
                System.out.println(C);
                break;
            case ("-"):
                C = A - B;
                System.out.println(C);
                break;
            case ("/"):
                C = A / B;
                System.out.println(C);
                break;
            case ("*"):
                C = A * B;
                System.out.println(C);
                break;
        }
    }
}