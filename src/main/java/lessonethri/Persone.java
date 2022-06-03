package lessonethri;

public class Persone {

    private Pet pet;

    public void setPet(Pet pet) {
        System.out.println("Class person : set cat");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Привет, Ирина Алексеевна!");
        pet.say();
    }
}
