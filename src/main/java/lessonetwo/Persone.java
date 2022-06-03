package lessonetwo;

public class Persone {
    private Pet pet;

    public Persone(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Привет, Ирина Алексеевна!");
        pet.say();
    }
}
