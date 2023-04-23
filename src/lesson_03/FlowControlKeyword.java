package lesson_03;

public class FlowControlKeyword {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if(i==2) continue;
            System.out.println(i);
            if(i==3) break;
        }
    }
}
