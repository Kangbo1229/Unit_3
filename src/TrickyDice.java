public class TrickyDice {
    public static int regularRoll() {
        int normal = (int)(Math.random()*6)+1;
        return normal;

    }

    public static int trickyRoll() {
        int normal = 0;
        int tricky = (int)(Math.random()*100)+1;
        if (tricky <= 15) {
            normal = 1;
        }
        else if (tricky <= 40) {
            normal = 2;
        }
        else if (tricky <= 60) {
            normal = 3;
        }
        else if (tricky <= 75){
            normal = 4;
        }
        else if (tricky <= 85){
            normal = 5;
        }
        else {
            normal = 6;
        }
        return normal;

    }

    public static void main(String[] args) {
        System.out.println(regularRoll());
        System.out.println(trickyRoll());



    }
}
