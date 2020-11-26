public class Crocodile extends Wild implements Voice{

    public Crocodile(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public void voice() {
        if(isPredator) {
            System.out.println("Hello, i am Crocodile, and i am very angry");
        }
        else System.out.println("Hello, i am wild animal");
    }
}
