import java.util.Scanner;
public class Patterns {

    public static void Num_Triangle(int n){
        // 1. print tringle with num = column number
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        System.out.println("Num Tringle");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" "+j+" ");
                
            }
            System.out.println();
        }
    }
    public static void Char_Pyramid(int n){
        // 2. half pyramid with characters

        char a = 'A';
        System.out.println("Char Pyramid");
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                if (a != 'Z') {
                   System.out.print(a);
                    a++; 
                }
                else{
                    System.out.println(a);
                    a = 'A';
                    
                }
                
                
            
            }
            System.out.println();
        }
    }
    public static void Solid_Rectangle(int n){
         // 3.  rectangle
        System.out.println("Solid Rectangle");
            for (int i = 1; i <=n; i++) {
                for (int j = 1; j <=4; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
    }
    public static void Hollow_Rectangle(int n){
        // 3. hollow rectangle
        int rows = 6;
        int col = 5;
        System.out.println("Hollow Rectangle");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= col; j++) {
                if (i==1||i==rows||j==1||j==col) {
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();   

        }
    }
    public static void Inverted_Half_Pyramid(int n){
         // 4.inverted half pyramid
         System.out.println("Inverted Half Pyramid");
        for (int i = 4; i >=1; i--) {
            for (int j = 1; j <=4; j++) {
                if (j==i||j>=i) {
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void Num_Inverted_Half_Pyramid(int n){
        // / 5. Inverted half pyramid with numbers
        System.out.println("Num_Inverted_Half_Pyramid");
        for (int i = 5; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    }
    public static void Floyd_Triangle(int n){
        // 6. Floyd's Triangle
        System.out.println("Floyd_Triangle");
        int count = 1;

        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" "+count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void Binary_Triangle(int n){
        // 7. 0-1 triangle
        System.out.println("Binary_Triangle");
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i; j++) {
                if ((i+j)%2 == 0 ) {
                    System.out.print(" "+1+" ");
                }
                else{
                    System.out.print(" "+0+" ");
                }
            }
            System.out.println();
        }
    }

    public static void Butterfly(int n){
        // 8. Butterfly pattern
        System.out.println("Butterfly");
        
        // Upper part
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=2*n; j++) {
                if ((j>=(2*n+1)-i)||j<=i) {
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        // // Lower part
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <=2*n; j++) {
                if ((j<=i)||(((2*n+1)-j)<=i)) {
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void Solid_Rhombus(int n){
        // 9. Solid Rhombus
        System.out.println("Solid_Rhombus");
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <=(2*n-1); j++) {
                if ((j>=i)&&(j<=(i+(n-1)))) {
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void Hollow_Rhombus(int n){
        // 10. Hollow rhombus

        System.out.println("Hollow_Rhombus");
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <=(2*n-1); j++) {
                if ((j>=i)&&(j<=(i+(n-1)))) {

                    if (i==1||i==n||j==i || j == i+(n-1)) 
                    {
                        System.out.print(" * ");
                    }
                    else{
                        System.out.print("   ");
                    }
                    
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter num : ");
        num = sc.nextInt();

        Hollow_Rhombus(num);
        Solid_Rhombus(num);
        Butterfly(num);
        Binary_Triangle(num);
        Floyd_Triangle(num);
        Num_Triangle(num);
        Char_Pyramid(num);
        Solid_Rectangle(num);
        Hollow_Rectangle(num);
        Inverted_Half_Pyramid(num);
        Num_Inverted_Half_Pyramid(num);


        

       
}}
        

       

        
        
        

        

        


        

        
        
        
        



    
