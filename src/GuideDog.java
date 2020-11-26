public class GuideDog extends Pet implements Voice, GetHome,IsVaccinated {
    private boolean isTrained;

    public GuideDog(int id, int age, double weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(id, age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    @Override
    public void voice() {
        System.out.println("Hello, I can take you home.");
    }

    @Override
    public void getHome() {
        System.out.println("I am your guide dog, let's come home together");
    }

    @Override
    public void isVaccinated() {
        if(super.isVaccinated){
            System.out.println("Эта собака вакцинирована");
        }
        else
            System.out.println("Ваша собака не вакцинирована");
    }
}
