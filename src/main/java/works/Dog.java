package works;


import works.Animals;

class Dog extends Animals {
    public Dog(String name, String claws, String wool, int age) {
        super(name, claws, wool, age);
    }

    @Override
    public void voice() {
        System.out.println("собака " + getName() + "гавкает");
    }
    @Override
    public void eat(int anyFood) {
        System.out.println("собака " + getName() + " с удовольствием ест " + anyFood + " корма");
    }
}




