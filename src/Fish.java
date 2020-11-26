public class Fish extends Wild implements Voice {

    public Fish(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    public void voice() {
        System.out.println("......");
    }
}
