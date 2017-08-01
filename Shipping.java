import java.io.Console;

public class Shipping {

    public static void main(String[] args) {
	// Shipping Cost calculated here
        System.out.println("Shipping Cost Calculator");

        //Create an instance of the console
        Console myConsole = System.console();

        //Prompt A user to enter the shipping Properties
        System.out.println("Enter The name");
        String name = myConsole.readLine();

        System.out.println("Enter The weight");
        String weight = myConsole.readLine();
        int pWeight = Integer.parseInt(weight);

        System.out.println("Enter The distance");
        String distance = myConsole.readLine();
        int pDIstance = Integer.parseInt(distance);


        while (pWeight>=5 && pDIstance>=1){
            if (pDIstance <= 20 && pDIstance>10){
                int pPrice = 200;
                System.out.println("THe price will be "+pPrice);
            }else if(pDIstance>=21 && pDIstance<40){
                int pPrice = 400;
                System.out.println("THe price will be "+pPrice);
            }else if(pDIstance>41){
                int pPrice = 600;
                System.out.println("THe price will be "+pPrice);
            }
        }
    }
}
