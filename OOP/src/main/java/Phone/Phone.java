package Phone;

class Main{
    public static void main(String[] args) {
        Phone phone1 = new Phone("89351689321", "iPhone 8", 200);
        Phone phone2 = new Phone("89454568921", "Samsung Galaxy S22");
        Phone phone3 = new Phone();

        Phone.receiveCall("Mark");
        Phone.receiveCall("Gleb");

        System.out.println(phone1.GetNamber());
        System.out.println(phone3.GetNamber());

        Phone.receiveCall("Gleb", "89454568921");

        String[] phoneNumbers = {"111-222-3333", "444-555-6666", "777-888-9999"};
        phone1.sendMessage(phoneNumbers);

        System.out.println(phone1.toString());
    }
}

public class Phone {

    private String number;
    private String model;
    private double weight;

    protected static void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    protected String GetNamber(){
        return number;
    }

    protected Phone(String number, String model, double weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    protected Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    protected Phone(){
    }

    protected static void receiveCall(String name, String number_phone){
        //System.out.println("Звонит " + name + " , номер " + number_phone);
    }

    protected void sendMessage(String[] numbers){
        for (String number : numbers) {
            System.out.println(number);
        }
    }

    @Override
    public String toString(){
        return "Номер: " + number + ", Модель: " + model + ", Вес: " + weight;
    }
}
