package PizzaOrder;

public class Main {
    private static final String adress1 = "Пушкинская 6";
    private static final String adress2 = "Ярославская 101";
    private static final String adress3 = "Презедентская 5";
    private static final String type1 = "Сырная";
    private static final String type2 = "Аль-Капчоне";
    private static final String type3 = "Острячок";

    public static void main(String[] args) {
        PizzaOrder pizza = new PizzaOrder(type1, PizzaSize.BIG, true, adress1);
        PizzaOrder pizza1 = new PizzaOrder(type2, PizzaSize.SMALL, true, adress2);
        PizzaOrder pizza2 = new PizzaOrder(type3, PizzaSize.MEDIUM, false, adress3);

        System.out.println("Информация о заказе:");
        System.out.println(pizza);
        System.out.println(pizza1);
        System.out.println("-------------------------------------------------");

        System.out.println("Размещаем заказ:");
        pizza.order();
        pizza.order();
        pizza1.order();
        System.out.println("-------------------------------------------------");

        System.out.println("Отменяем заказ:");
        pizza.cancellation();
        pizza1.cancellation();
        pizza2.cancellation();


    }
}
