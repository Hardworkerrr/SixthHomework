public class Wolf extends Wild implements Voice{

    public Wolf(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public void voice() {
        if(isPredator) {
            System.out.println("Hello, i am Wolf, and i am very angry");
        }
        else System.out.println("Hello, i am wild animal");
    }
}
