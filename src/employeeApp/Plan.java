package employeeApp;

public enum Plan {
    CHECKUP("Check Up",1500),
    SURGERY("Operation",2200),
    CARDIO("Regular Spor",500);
    String name ;
    int price ;
    Plan(String name,int price){
        this.name = name ;
        this.price = price ;



    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
