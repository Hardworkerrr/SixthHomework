public class Giraffe extends Wild implements Voice{

    public Giraffe(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public void voice() {
        if(isPredator) {
            System.out.println("Hello, i am Giraffe, and i am very angry");
        }
        else System.out.println("Hello, I am Giraffe");
    }
}
