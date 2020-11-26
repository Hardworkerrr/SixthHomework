public class Dog extends Pet implements Voice,IsVaccinated {

    public Dog(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    public void voice() {
        System.out.println("Hello, Woof ");
    }

    @Override
    public void isVaccinated() {
        if(isVaccinated){
            System.out.println("Эта собака вакцинирована");
        }
        else
            System.out.println("Ваша собака не вакцинирована");
    }
}
