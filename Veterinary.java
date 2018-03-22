import java.util.LinkedList;
import java.util.Scanner;

public class Veterinary {
    private LinkedList<Pet> petList;

    public Veterinary() {
        petList = new LinkedList<>();
    }

    public void insertPet(Pet pet){
        petList.add(pet);
    }

    public void createPet(){
        Scanner imput = new Scanner(System.in);
        System.out.println("Enter the Id of the pet: ");
        int id = imput.nextInt();
        System.out.println("enter the name of the pet: ");
        String name = imput.next();
        System.out.println("Enter the breed of the pet: ");
        String breed = imput.next();
        System.out.println("Enter the age of the pet:");
        System.out.println("Years: ");
        int years = imput.nextInt();
        System.out.println("Months: ");
        int months = imput.nextInt();
        System.out.println("Enter the weight of the pet: ");
        float weight = imput.nextFloat();
        System.out.println("Enter the Name of the owner: ");
        String owner = imput.next();
        Pet newPet = new Pet(name,years,months,breed,id,owner,weight );
        insertPet(newPet);
    }


    public Boolean removePet(int petId){
        int auxID=0;
        for (Pet pet: petList) {
            auxID= pet.getId();
            if (auxID == petId)
                petList.remove(pet);
                return true;
        }
        return false;
    }

    public void deletePet(){
        System.out.println("Enter the id of the pet that you want to delete");
        Scanner imput = new Scanner(System.in);
        int deleteId = imput.nextInt();
        if (removePet(deleteId) == true)
            System.out.println("Pet deleted");
        else System.out.println("Pet id was not found");
    }


    public void showAllPets(){
        if (petList.isEmpty()) {
            System.out.println("List is empty");
        }
        else{
            for (Pet pet: petList) {
                pet.showPet();
            }
        }

    }

    public void editPet(){
        Scanner imput = new Scanner(System.in);
        int auxID=0;
        System.out.println("Enter the id of the pet you want to edit");
        int id = imput.nextInt();
        for (Pet pet: petList) {
            auxID= pet.getId();
            if (auxID == id){
                pet.editAttribute();
                return;
            }
        }
        System.out.println("The id was not found");
    }

}
