import java.util.Scanner;

public class Pet {

    private int id;
    private String name;
    private int years;
    private int months;
    private float weight;
    private String breed;
    private String owner;


    public Pet(String name, int years, int months, String breed, int id, String owner, float weight) {
        this.name = name;
        this.years = years;
        this.months = months;
        this.breed = breed;
        this.id = id;
        this.owner = owner;
        this.weight = weight;
    }

    public Pet() {
        name = "empty";
        years = 0;
        months = 0;
        breed = "undefined";
        id=0;
        owner="undefined";
        weight = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void showPet(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Breed: "+breed);
        System.out.println("Age: "+years+" years, "+months+" months");
        System.out.println("Weight: "+weight);
        System.out.println("Owner: "+owner);
    }

    public void editAttribute(){
        int attribute = 0;
        Scanner imput = new Scanner(System.in);
        System.out.println("Select the option of the attribute to change: ");
        System.out.println("1: Edit id ");
        System.out.println("2: Edit name ");
        System.out.println("3: Edit years ");
        System.out.println("4: Edit months ");
        System.out.println("5: Edit weight ");
        System.out.println("6: Edit owner ");
        attribute = imput.nextInt();
        switch (attribute){
            case 1:
                System.out.println("Id: "+getId());
                System.out.println("Enter the new Id");
                setId(imput.nextInt());
                break;

            case 2:
                System.out.println("Name: "+getName());
                System.out.println("Enter the new name");
                setName(imput.next());
                break;
            case 3:
                System.out.println("Years: "+getName());
                System.out.println("Enter the new age");
                setYears(imput.nextInt());
                break;
            case 4:
                System.out.println("Motnhs: "+getMonths());
                System.out.println("Enter the new number of months");
                setMonths(imput.nextInt());
                break;
            case 5:
                System.out.println("Weight: "+getWeight());
                System.out.println("Enter the new weight");
                setWeight(imput.nextFloat());
                break;
            case 6:
                System.out.println("Owner: "+getOwner());
                System.out.println("Enter the new Owner");
                setOwner(imput.next());
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

}
