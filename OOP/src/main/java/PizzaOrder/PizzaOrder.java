package PizzaOrder;

class Main {
    public static void main(String[] args) {
        PizzaOrder pizza = new PizzaOrder("Сырная", PizzaSize.BIG, true, "Пушкинская 6");
        PizzaOrder pizza1 = new PizzaOrder("Аль-Капчоне", PizzaSize.SMALL, true, "Ярославская 101");
        PizzaOrder pizza2 = new PizzaOrder("Острячок", PizzaSize.MEDIUM, false, "Презедентская 5");

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
        pizza.cansel();
        pizza1.cansel();
        pizza2.cansel();


    }
}

enum PizzaSize {
    SMALL,
    MEDIUM,
    BIG
}
public class PizzaOrder {
    private String name;
    private PizzaSize size;
    private boolean isSauce;
    private String adress;
    private boolean isAccepted;

    public PizzaOrder(String name, PizzaSize size, boolean isSauce, String adress) {
        this.name = name;
        this.size = size;
        this.isSauce = isSauce;
        this.adress = adress;
    }

    public void order() {
        if (!isAccepted) {
            isAccepted = true;
            System.out.println("Заказ принят. \n\t" + getSize() + " пицца '" + name + "' " +
                    (isSauce ? "с соусом" : "без соуса") + " на адрес " + adress + ".");
        } else {
            System.out.println("\tЗаказ уже принят.");
        }

    }

    public void cansel() {
        if (isAccepted) {
            isAccepted = false;
            System.out.println("\tЗаказ по адресу '" + adress + "' был отменен.");
        } else {
            System.out.println("\tЗаказ по адресу '" + adress + "' не был принят.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSauce() {
        return isSauce;
    }

    public void setSauce(boolean sauce) {
        isSauce = sauce;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Заказ:" +
                "\n\tНазвание - '" + name + "'" +
                "\n\tразмер - " + size +
                "\n\tсоус - " + isSauce +
                "\n\tадрес - '" + adress +
                "\n\tвыполнеие - " + isAccepted;
    }

    private String getSize() {
        switch (size) {
            case SMALL -> {
                return "Маленькая";
            }
            case MEDIUM -> {
                return "Средняя";
            }
            case BIG -> {
                return "Большая";
            }
            default -> {
                return "";
            }
        }
    }
}

