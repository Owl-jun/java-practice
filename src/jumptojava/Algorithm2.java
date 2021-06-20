package jumptojava;

import java.util.Scanner;

public class Algorithm2 {
    public static void main(String[] args){
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("2자리 양수를 입력하세요.");
        while (true) {
            System.out.println("값을 입력하세요");
            input = sc.nextInt();
            if (!(input > 9) || !(input < 100)) { // if (input >9 && input < 100) 과 같음.
                continue;
            } else {
                break;
            }
        }
        System.out.print("입력 받은 값은" + input + "입니다.");
    }
}
