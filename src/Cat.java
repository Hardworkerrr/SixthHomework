public class Cat extends Pet implements Voice,IsVaccinated {
    public Cat(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    public void voice() {
        System.out.println("Hello, Meow");
    }

    @Override
    public void isVaccinated() {
        if(isVaccinated){
            System.out.println("Этот кот вакцинирован");
        }
        else
            System.out.println("Ваш кот не вакцинирован");
    }
}
