//Опишите его подкласс Employee таким образом, чтобы в объекте этого типа были доступны следующие публичные элементы
class Employee extends Person{
        public String company;

        public Employee(String name, int age, String company) {
            this.name = name;
            this.age = age;
            this.company = company;
        }
        
        public void work(){}
        
        public void relax(){}
    }


//Создайте класс Dog, наследник Animal, и реализуйте в нем полиморфный метод eat(), возвращающий строку "Bone".
class Dog extends Animal {
        @Override
        public String eat()
        {
            return "Bone";
        }
    }


//Опишите класс MyClass, реализующий этот интерфейс и также имеющий
class MyClass implements Drawable {
        public boolean drawing;

        @Override
        public void draw() {

        }
        
        public void start(){}
        
        public void stop(){}
    }


4) final
