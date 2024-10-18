package QuestionBank_24;

import java.util.Scanner;

class Pattern{
    int i,j,k=1;

    public void display(int n){
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.print("\n");
        }
    }

}

public class FloydsTriangle {
    public static void main(String[] args) {
        System.out.println("Enter number of rows : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pattern pattern = new Pattern();
        pattern.display(n);

    }
}
