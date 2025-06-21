import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String Dept = in.next();

        switch (empId) {
            case 1:
                System.out.println("Aashi Goel");
                break;
            case 2:
                System.out.println("Sangya Ojha");
                break;
            case 3:
                System.out.println("Emp number 3 ");
                switch (Dept) {
                    case "IT" :
                        System.out.println("IT department");
                        break;
                    case "CSE" :
                        System.out.println("CSE department");
                        break;
                    case "EEE" :
                        System.out.println("EEE department");
                        break;
                    default :
                        System.out.println("No department entered");
                }
                break;
            default :
                System.out.println("enter correct employee id!");
        }
    }
}
