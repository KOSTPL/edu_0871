//Task_4.3.
/*
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse реализовать метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/

class task_4_3{
        public static void main(String[] args) {
            //Ваш код
            Horse horse = new Horse("Kony",9);
            Pegasus pegasus = new Pegasus("Pegas",20);
            horse.run();
            pegasus.fly();
        }
    }
    abstract class Animal{
        protected String nickname;
        protected int age;

        public Animal(String nickname, int age) {
            this.nickname = nickname;
            this.age = age;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
    class Horse extends Animal {
        public Horse(String nickname, int age) {
            super(nickname, age);
        }
        public void run(){
            System.out.println("Игого, я поскакал(а)");
        }
    }
    class Pegasus extends Horse {
        public Pegasus(String nickname, int age) {
            super(nickname, age);
        }
        public void fly(){
            System.out.println("Игого, я полетел(а)");
        }
    }
