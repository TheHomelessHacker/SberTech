package Phone;

public class Main {
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
