/*
Задача вывести на экран такое сообщение (для объекта gosha):
Меня зовут "имя объекта"
Имя моей мамы: "имя мамы"
Имя моего папы: "имя папы"
У меня две бабушки, бабушка "имя бабушки" и "имя бабушки"
У меня два деда, деда "имя деда" и "имя деда"
*/

public class task_3_1 {
    public static void main(String[] args) {
        Person valera = new Person("Валера", "Иванов", 69, null, null);
        Person olga = new Person("Ольга", "Иванова", 67, null, null);
        Person oleg = new Person("Олег", "Петров", 65, null, null);
        Person jula = new Person("Юля", "Петрова", 67, null, null);
        Person alex = new Person("Алексей", "Иванов", 37, olga, valera);
        Person eva = new Person("Ева", "Иванова", 37, jula, oleg);
        Person gosha = new Person("Гоша", "Иванов", 10, eva, alex);
        //System.out.println("Мама Алексея: " + alex.getMother().getName());
        //System.out.println("Бабушка Гоши: " + gosha.getMother().getMother().getName());
        System.out.println("Меня зовут " + gosha.getName());
        System.out.println("Имя моей мамы: " + gosha.mother.getName());
        System.out.println("Имя моего папы: " + gosha.father.getName());
        System.out.println("У меня две бабушки, бабушка " + gosha.mother.mother.getName() + " и " + gosha.father.mother.getName());
        System.out.println("У меня два деда, деда " + gosha.father.father.getName() + " и " + gosha.mother.father.getName());
    }
}

    class Person {
        protected String name;
        protected String lastname;
        protected int age;
        protected int hp = 100;
        protected Person mother;
        protected Person father;

        public Person(String name, String lastname, int age, Person mother, Person father) {
            this.name = name;
            this.lastname = lastname;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public String getName() {
            return this.name;
        }

        public int getHp() {
            return this.hp;
        }
    }
