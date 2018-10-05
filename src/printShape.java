public class printShape {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 7; j++){
                if( i == 0 || i == 3)
                    System.out.print("*");
                else if(j == 0 || j == 3)
                    System.out.print("*");
                else System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i <=6;++i){
            for(int j = 1; j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 5; i >=1;--i){
            for(int j = 1; j <=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}