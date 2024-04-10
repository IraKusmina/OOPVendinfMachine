// Сделать класс Товар абстрактным, создать нескольких наследников (к примеру: БутылкаВоды), 
// сделать интерфейсом ТорговыйАвтомат и реализовать класс какого-то одного типа ТорговогоАвтомата 
// (пример: ПродающийБутылкиВодыАвтомат

// 11:03
// Реализовать конструкторы, get/set методы, построить логику ТорговогоАвтомата на основе кода
// сделанного в задании 1.2


public abstract class Product {
    protected String name;
    protected String category;
    protected int amount;
    protected double price;

    Product(String name, double price, String category, int amount, int i){
        this.name = name;
        this.price = price;
        this.category = category;
        this.amount = amount; 
    }

    public Product(String name2, double price2, String category2, int amount2) {
        //TODO Auto-generated constructor stub
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String getCategory(){
        return category;
    }

    public int getAmount(){
        return amount;
    }

    public void setAmout(int amount){
        this.amount = amount;
    }
}