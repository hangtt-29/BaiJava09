import java.util.Scanner;

public class HinhChuNhat {
    void hinhChuNhatCalculator(){
        int height, width;
        Scanner sn= new Scanner(System.in);
        do {
            System.out.println("Nhập kích thước của hình chữ nhật là: ");
            System.out.println("Height là:");
            height= sn.nextInt();
            System.out.println("Nhập width là: ");
            width=sn.nextInt();
        }while (height<=0 && width<=0 );
        for (int i=0; i<height;i++){

            for (int j=0; j<width; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
