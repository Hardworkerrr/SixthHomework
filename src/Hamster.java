public class Hamster extends Pet implements Voice,IsVaccinated{

    public Hamster(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public void voice() {
        System.out.println("Hello, I am a little Hamster. My name is "+ name);
    }

    @Override
    public void isVaccinated() {
        if(isVaccinated){
            System.out.println("Этот хомяк вакцинирован");
        }
        else
            System.out.println("Ваш хомяк не вакцинирован");
    }
}
