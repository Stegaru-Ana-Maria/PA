
public class Lab1{
    public static void main(String[] args){
        Lab1 lab1 = new Lab1();
        lab1.homework(args);
    }

    void homework(String[] args){
        if(args.length != 3){
            System.out.println("Comanda: java Lab1 <numar1> <numar2> <k>");
        }

        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int k = Integer.parseInt(args[2]);

            long startTime = System.nanoTime();

            StringBuilder sb =  new StringBuilder();

            for(int i = a; i<= b; i++){
                if(isKReductible(i,k)){
                    sb.append(i).append(" ");
                }
            }

            long endTime = System.nanoTime();
            long executionTime = endTime - startTime;
            System.out.println("Numerele K-Reductibile sunt: " + sb.toString().trim());
            System.out.println("Timp executie: " + executionTime + " nanosecunde");
        }
        catch (NumberFormatException e) {
            System.out.println("Input invalid.");
        }


    }

    public static boolean isKReductible(int n, int k){
        int number = n;
        int aux = 0;
        while(number >= 10){
            int s = 0;
            aux = number;
            while(aux != 0){
                s += (aux%10) * (aux%10);
                aux /= 10;
            }
            number = s;
        }
        return number == k;
    }

}
