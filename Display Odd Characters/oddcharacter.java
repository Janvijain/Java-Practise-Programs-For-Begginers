import java.util.Scanner;

class MyClass {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String input = s.nextLine();
        s.close();
        char[] result = input.toCharArray();
        for(int i=0;i<result.length;i=i+2){
            System.out.print(result[i]);
        }
    }
}      