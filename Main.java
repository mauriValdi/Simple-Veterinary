import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner imput = new Scanner(System.in);
        System.out.println("Wellcome to the Veterinary System");
        System.out.println("");
        Veterinary vet = new Veterinary();
        vet.showAllPets();
        int option=3;
        do {
            System.out.println("");
            System.out.println("Enter the number of option: ");
            System.out.println("1: Show all pets");
            System.out.println("2: Enter a new pet");
            System.out.println("3: Edit a pet");
            System.out.println("4: Delete a pet");
            System.out.println("5: Exit");
            System.out.println("");
            option = imput.nextInt();
            switch (option){
                case 1:
                    vet.showAllPets();
                    break;
                case 2:
                    vet.createPet();
                    break;
                case 3:
                    vet.editPet();
                    break;
                case 4:
                    vet.deletePet();
                    break;
                default:
                    option =0;
                    break;
            }
        }while (option != 0);



    }
}
