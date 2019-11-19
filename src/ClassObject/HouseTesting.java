package ClassObject;

import java.util.Scanner;

public class HouseTesting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        HouseObj detail=new HouseObj();

        System.out.println("Enter type: ");
        detail.type=input.nextLine();
        System.out.println("Enter address: ");
        detail.address=input.nextLine();
        System.out.println("Enter number of rooms: ");
        detail.numRooms=input.nextInt();
        detail.info();
    }
}
