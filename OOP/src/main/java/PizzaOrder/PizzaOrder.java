package PizzaOrder;

enum PizzaSize {
    SMALL("Маленький"),
    MEDIUM("Средний"),
    BIG("Большой");
    private String description;

    PizzaSize(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
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

    public void order() {
        if (!isAccepted) {
            isAccepted = true;
            System.out.println("Заказ принят. \n\t" + getSize(size) + " пицца '" + name + "' " +
                    (isSauce ? "с соусом" : "без соуса") + " на адрес " + adress + ".");
        } else {
            System.out.println("\tЗаказ уже принят.");
        }

    }

    public void cancellation() {
        if (isAccepted) {
            isAccepted = false;
            System.out.println("\tЗаказ по адресу '" + adress + "' был отменен.");
        } else {
            System.out.println("\tЗаказ по адресу '" + adress + "' не был принят.");
        }
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

    public String getSize(PizzaSize size) {
        return size.getDescription();
    }


}

