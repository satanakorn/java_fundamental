public class evennumber {

    public static void main(String[] args) {
        for (int i =10; i > 0; i--){
            if(i % 2 == 1){
                continue;
            }
            System.out.println(i+" is even number");
        }
    }
    
}
