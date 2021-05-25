import java.util.Scanner;

public class HinhTamGiac {
    void tamGiacCalucator(){
        int height;
        Scanner sn=new Scanner(System.in);
        do {
            System.out.println("Nhập vào chiều cao của tam giác là:");
            height= sn.nextInt();
        }while (height<=0);
        for (int i=1; i<=height;i++){
            for (int j=1; j<=height-i;j++){
                System.out.print(" ");
            }
            for (int h=1; h<=(2*i-1);h++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
