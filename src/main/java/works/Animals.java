package works;

public class Animals {
        private String name;
        private String claws;
        private String wool;
        private int age;

        public Animals(String name, String claws, String wool, int age) {
            this.name = name;
            this.claws = claws;
            this.wool = wool;
            this.age = age;
        }

    public String getName() {
        return name;
    }
    public String getClaws() {
        return claws;
    }
    public String getWool() {
        return wool;
    }
    public int getAge() {
        return age;
    }

        public void voice() {
            System.out.println("команда голос");
        }

        public void eat(int anyFood) {
            System.out.println(name + " ест " + anyFood + " корма");
        }

        public void move() {
            System.out.println(name + " двигается");
        }

        public void givePaw(){
            System.out.println(name + " даёт лапу");
    }

    public void coup(){
        System.out.println(name + " переворачивается");
    }
}
