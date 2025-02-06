public class Pet {
    private final String name;

    public Pet(String petName){
        name = petName;
    }//end of Pet

    public String toString(){
        return "Name:" + name;
    }//end of toString

    public static void main(String[] args){
        Pet pet1 = new Pet("Pet Name");
        Pet pet2 = new Pet("Buster");

        System.out.println("Pet Information:");
        System.out.println(pet1);

        System.out.println("Pet information:");
        System.out.println(pet2);
    }//end of main

}//end of pet class

