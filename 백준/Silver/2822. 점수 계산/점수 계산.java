import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int temp = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();

        for(int i = 0; i < 8; i++){
            
            int point = sc.nextInt();
            arr.add(point);
            arr2.add(point);

        }


        arr.sort(Comparator.naturalOrder());
        arr.remove(0);
        arr.remove(0);
        arr.remove(0);

        for (int i = 0; i < arr2.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if(arr2.get(i).equals(arr.get(j))){
                    arr2.set(i, i+1);
                    arr3.add(0, i+1);
                }
            }
        }

        for(int i =0; i < arr.size(); i++){
            temp += arr.get(i); 
        }
        System.out.println(temp);

        Collections.reverse(arr3);
        for(Integer str:arr3){
            System.out.print(str+" ");

        }
        

    }

}