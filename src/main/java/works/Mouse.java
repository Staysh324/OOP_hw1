package works;

import works.Animals;
class Mouse extends Animals {
    public Mouse(String name, String claws, String wool, int age) {
        super(name, claws, wool, age);
    }

    @Override
    public void voice() {
        System.out.println("мышь " + getName() + " пищит");
    }
    @Override
    public void eat(int anyFood) {
        System.out.println("мышь" + getName() + " хомячит " + anyFood + " корма");
    }
    @Override
    public void givePaw(){
        System.out.println(getName() + " убегает от вас");
    }
    @Override
    public void coup(){
        System.out.println(getName() + " пищит в ответ");
    }
}
