package HeadFirstJava.Glava5;

public class MultiFor {

        public static void main(String[] args) {

            for( int x = 0; x<4; x++) { // x++  в КОНЦЕ каждой итерации!! добавляет единицу

                for( int y = 4;  y>2; y--) {
                    System.out.println(x + " " + y);
                }
                if(x ==1) {
                    x++;
                }
            }

        }
}
/*
0 4
0 3
1 4
1 3
3 4
3 3
 */