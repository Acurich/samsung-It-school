package com.company;

public class zad1 {
    public static void main(String[] args) {
        Phone myPhone1 = new Phone("8-900-000-22-22", "Sumsung", 172);
        Phone myPhone2 = new Phone("8-987-654-32-12", "iPhone", 194);
        Phone myPhone3 = new Phone("8-900-000-00-00", "Asus", 181);
        myPhone1.display();
        myPhone1.receiveCall("Alice");
        System.out.println(myPhone1.getNumber());
        myPhone1.sendMessage("8-987-654-32-12", "8-900-000-00-00", "8-494-939-95-95");

        myPhone2.display();
        myPhone2.receiveCall("Nick");
        System.out.println(myPhone2.getNumber());

        myPhone3.display();
        myPhone3.receiveCall("Tom", "8-494-939-95-95");
        System.out.println(myPhone3.getNumber());

    }

    static class Phone {
        private String number;
        private String model;
        private int weight;

        public Phone() {
            this.number = "Неопределён";
            this.model = "Неопределена";
        }

        public Phone(String number, String model) {
            this.number = number;
            this.model = model;
        }

        public Phone(String number, String model, int weight) {
            this(number, model);
            this.weight = weight;
        }

        public void sendMessage(String... numbers) {
            System.out.println("Сообщение будет отправлено следующим номерам: ");
            for (String n : numbers) {
                System.out.println(n);
            }
        }

        public void receiveCall(String name) {
            System.out.println("Звонит " + name);
        }

        public void receiveCall(String name, String number) {
            System.out.println("Звонит " + name + " с номера " + number);
        }

        public String getNumber() {
            return number;
        }

        public String getModel() {
            return model;
        }

        public int getWeight() {
            return weight;
        }

        public void display() {
            System.out.println("=============");
            System.out.printf("Номер: %s\nМодель: %s\nВес(г): %d\n", getNumber(), getModel(), getWeight());
        }
    }
}




