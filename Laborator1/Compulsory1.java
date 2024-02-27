
public class Lab1{
    public static void main(String[] args){
        Lab1 lab1 = new Lab1();
        lab1.compulsory();
    }

    void compulsory(){
        System.out.println("Hello World!");

        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};

        int n = (int) (Math.random() * 1_000_000);

        int result = n * 3;
        result += Integer.parseInt("10101",2);
        result += Integer.parseInt("FF",16);
        result += 6;

        result = SumOfDigits(result);
        while(result >= 10){
            result = SumOfDigits(result);
        }

        System.out.println("Willy-nilly, this semester I will learn " + languages[result]);

    }
    private static int SumOfDigits(int x){
        int s = 0;
        while(x != 0){
            s += x%10;
            x /= 10;
        }
        return s;
    }

}
