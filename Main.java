public class Main {

    public static void main(String[] args) {
        Middle_Sq mid = new Middle_Sq(8478);
        LCG lg = new LCG(3, 100, 5,18);
        for(int i=1; i<=10; i++){
            System.out.println(mid.next());
        }
    }
}
