package Phone;

public class Phone {

    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public static void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public String GetNamber() {
        return number;
    }


    public static void receiveCall(String name, String numberPhone) {
        System.out.println("Звонит " + name + " , номер " + numberPhone);
    }

    public void sendMessage(String[] numbers) {
        for (String number : numbers) {
            System.out.println(number);
        }
    }

    @Override
    public String toString() {
        return "Номер: " + number + ", Модель: " + model + ", Вес: " + weight;
    }
}
