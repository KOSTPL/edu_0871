    /*
    Помогите коту обрести имя с помощью метода setName.
    Требования:
    •	Класс Cat должен содержать только одну переменную name.
    •	Переменная name должна иметь модификатор доступа private и тип String.
    •	Класс Cat должен содержать только два метода setName и main.
    •	Метод setName класса Cat должен устанавливать значение переменной private String name равным переданному параметру String name.
    */
    
    // скорее всего решение не подойдет, но IJ  посоветовала добавить static в класс Cat и программа начала компилировать, 
    //возможно это из курса Язык программирования Java - урок №15 (Ключевое слово static) - готов переделать задачу, мог не до конца понять задачу...
    
    class Cat {
        private String name = "безымянный кот";

        public void setName(String name) {
            //напишите тут ваш код
            this.name = name;
        }

        public static void main(String[] args) {
            Cat cat = new Cat();
            cat.setName("Жужик");
            System.out.println(cat.name);
        }
    }
