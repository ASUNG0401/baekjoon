import java.util.Scanner;
 
    public class Main {
     
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int money = sc.nextInt();
            int n = 1000 - money;
            int count =0;

            int[] list = {500, 100, 50, 10, 5, 1}; // 사용할 돈
            int i=0;

            while(n!=0){ // 잔돈이 0원이 되기 전까지 
                if(n - list[i] >= 0){ // 만약에 잔돈 빼기 리스트 0번 즉 500원을 한게 0보다 크거나 작다면 
                    n -= list[i]; // 잔돈에서 500원 빼기 
                    count++;    //그리고 500원 줬으니 동전 하나 줌으로서 카운트 ++
                }else{
                i++;    //만약 줘야할 잔돈이 500보다 적다면 다음 수를 넣기 위해 ㅑ ++
                }
            }
            System.out.println(count);

        }
    }
    