package works;
import works.Animals;
class Cat extends Animals {
    public Cat(String name, String claws, String wool, int age) {
        super(name, claws, wool, age);
    }

    @Override
    public void voice() {
        System.out.println("кошка " + getName() + " мяукает");
    }
    @Override
    public void eat(int anyFood) {
        System.out.println("кошка " + getName() + " ест и облизывается " + anyFood + " корма");
    }
    @Override
    public void givePaw(){
        System.out.println(getName() + " цапает вас за руку");
    }
    @Override
    public void coup(){
        System.out.println(getName() + " высокомерно смотрит на вас и не шевелится");
    }
}
