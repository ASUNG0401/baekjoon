import java.util.Scanner;
 
    public class Main {
     
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
     
            int month = in.nextInt();
            int day = in.nextInt();
            int count = 0;

            switch (month) {
                case 1:
                    count += 0;
                    break;
                
                case 2:
                    count += 31;
                    break;
                    
                case 3:
                    count += 31;
                    count += 28;
                    break;
                    
                case 4:
                count += 31;
                    count += 28;
                    count += 31;
                    break;
                    
                case 5:
                count += 31;
                    count += 28;
                    count += 31;
                    count += 30;
                    break;
                    
                case 6:
                count += 31;
                    count += 28;
                    count += 31;
                    count += 30;
                    count += 31;
                    break;
                    
                case 7:
                count += 31;
                    count += 28;
                    count += 31;
                    count += 30;
                    count += 31;
                    count += 30;
                    break;
                    
                case 8:
                count += 31;
                    count += 28;
                    count += 31;
                    count += 30;
                    count += 31;
                    count += 30;
                    count += 31;
                    break;
                    
                case 9:
                count += 31;
                    count += 28;
                    count += 31;
                    count += 30;
                    count += 31;
                    count += 30;
                    count += 31;
                    count += 31;
                    break;
                    
                case 10:
                count += 31;
                count += 28;
                count += 31;
                count += 30;
                count += 31;
                count += 30;
                count += 31;
                count += 31;
                    count += 30;
                    break;
                    
                case 11:
                count += 31;
                count += 28;
                count += 31;
                count += 30;
                count += 31;
                count += 30;
                count += 31;
                count += 31;
                    count += 30;
                    count += 31;
                    break;
                    
                case 12:
                count += 31;
                count += 28;
                count += 31;
                count += 30;
                count += 31;
                count += 30;
                count += 31;
                count += 31;
                    count += 30;
                    count += 31;
                    count += 30;
                    break;
            }

        count += day;

        if(count % 7 ==0){
            System.out.println("SUN");
        }else if(count % 7 ==1){
            System.out.println("MON");
        }else if(count % 7 ==2){
            System.out.println("TUE");
        }else if(count % 7 ==3){
            System.out.println("WED");
        }else if(count % 7 ==4){
            System.out.println("THU");
        }else if(count % 7 ==5){
            System.out.println("FRI");
        }else if(count % 7 ==6){
            System.out.println("SAT");
        }

            
    }
}
    