public class Main {
    public static void main(String[] args) {
        Animal shark = new Shark();
        Animal turtle = new Turtle();
        Animal eagle = new Eagle();
        shark.continent();
        turtle.continent();
        eagle.continent();


        Animal[] animals = {shark, turtle, eagle};


        Shark[] sharks = new Shark[2];
        Turtle[] turtles = new Turtle[3];
        Eagle[] eagles = new Eagle[4];

        for (Animal animal : animals) {
            for (int i = 0; i < sharks.length; i++) {
                if (animal instanceof Shark) {
                    sharks[i] = (Shark) animal;
                    sharks[i].attack();
                }
            }
                for (int i = 0; i < turtles.length; i++) {
                    if (animal instanceof Turtle) {
                        turtles[i] = (Turtle) animal;
                        turtles[i].swim();
                    }
                }
                    for (int j = 0; j < eagles.length; j++) {
                        if (animal instanceof Eagle) {
                            eagles[j] = (Eagle) animal;
                            eagles[j].fly();
                        }

                    }
                }
            }
        }







