import java.util.ArrayList;
import java.util.Arrays;

public class BNPRS {
    public static void main(String[] args) {
        BNPRS p = new BNPRS();
        p.Myseries();
        // p.pattern();
        // p.last();
    }

    void last(){
    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 1, 1, 6, 5, 2));
    ArrayList<Integer> ar = new ArrayList<>();
    BNPRS p = new BNPRS();
    for(int i=0; i< arr.size();i++){
        if(p.check(arr.get(i), arr, i+1)){
            ar.add(arr.get(i));
        }else{ar.add(0);}
    }
    
    for (Integer a : ar) {
        System.out.print(a+" ");        
    }


}
boolean check(int a, ArrayList<Integer> arr, int n){
    for(int i=n; i<arr.size();i++){
        if(arr.get(i)==a){
            return true;
        }

    }
    return false;
}
    void pattern(){
        // Scanner sc = new Scanner(System.in);
        int number = 5;
        
        if(number%2==0){
            int n = number/2;
            int m = n-1;
            for(int i=0;i<6;i++){
                for (int j=0;j<number;j++){
                    if((i==0 || i==5 )&&( j!=m && j!=n)){
                        System.out.print("0");
                    }
                    else if((i>0 || i<5 )&&( j==m || j== n)){
                        System.out.print("X");
                    }
                    else if((i>0 && i<5 )&&( j==0 || j==number-1)){
                        System.out.print("0");
                    }
                    else{
                        System.out.print(" ");
                    }
                }System.out.println();
            }

        }
        else{
            int m = number/2;
            for(int i=0;i<6;i++){
                for (int j=0;j<number;j++){
                    if((i==0 || i==5 )&&( j!=m )){
                        System.out.print("0");
                    }
                    else if((i>0 || i<5 )&&( j==m)){
                        System.out.print("X");
                    }
                    else if((i>0 && i<5 )&&( j==0 || j==number-1)){
                        System.out.print("0");
                    }
                    else{
                        System.out.print(" ");
                    }
                }System.out.println();
            }
        }

    }


    void Myseries(){
    ArrayList<Integer> array = new ArrayList<>();
    array.add(0);
    array.add(1);
    for(int i=3;i<100;i++){
        if(i%2==0){
            array.add(array.get(i-4)+array.get(i-2)+array.get(i-3));
        }
        else{
            array.add(array.get(i-2)+array.get(i-3));
        }
    }
    System.out.println(array);
}
}
