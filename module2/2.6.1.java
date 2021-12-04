//Создайте класс Person, хранящий информацию о человеке
class Person
    {
       private int age;
       private String name;

       public Person(String name, int age) {
           this.age = age;
           this.name = name;
       }

       public int getAge() {
           return age;
       }

       public String getName() {
           return name;
       }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String toString(){ // вывод дроби на печать
            return new String("(" + name + ", " + age + ")");
        }
    }

//Дополнительно к классу Person создайте класс Employee, являющийся наследником класса Person.
 class Person
    {
       public int age;
       public String name;

       public Person(String name, int age) {
           this.age = age;
           this.name = name;
       }

       public int getAge() {
           return age;
       }

       public String getName() {
           return name;
       }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String toString(){
            return new String("(" + name + ", " + age + ")");
        }
    }
    class Employee extends Person{
        private String company;

        public Employee(String name, int age, String company) {
            super(name, age);
            this.company = company;
        }


        @Override
        public String toString(){
            return new String("(" + name + ", " + age + ", " + company + ")");
        }

    }


//В классе Person добавьте метод work(), который возвращает строку "None".
class Person
    {
       public int age;
       public String name;

       public Person(String name, int age) {
           this.age = age;
           this.name = name;
       }

       public int getAge() {
           return age;
       }

       public String getName() {
           return name;
       }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String toString(){
            return new String("(" + name + ", " + age + ")");
        }

        public String work() {
            return "None";
        }
        
    }

    class Employee extends Person{
        private String company;

        public Employee(String name, int age, String company) {
            super(name, age);
            this.company = company;
        }


        @Override
        public String toString(){
            return new String("(" + name + ", " + age + ", " + company + ")");
        }

        @Override
        public String work()
        {
            return "Manager";
        }
    }
