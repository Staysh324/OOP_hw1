package works;

public class Task {
    public static void main(String[] args) {
        Animals[] animals = new Animals[6];
        animals[0] = new Dog("Барбос", "когдти есть", "коричневый",5);
        animals[1] = new Cat("Боббикотик", "загребучие", "вылизанная",60);
        animals[2] = new Mouse("Брейн", "маленькие", "серая",1);
        animals[3] = new Dog("Палкан", "огромные", "ободранная",14);
        animals[4] = new Cat("Мурка", "подстриженные", "мытая",5);
        animals[5] = new Mouse("Пинки", "редкие", "светится",2);

        int anyFood = 2;
        for (Animals animal : animals) {
            animal.eat(anyFood);
            animal.voice();
            animal.givePaw();
            animal.coup();
            animal.move();
            System.out.println();
        }
    }

}
