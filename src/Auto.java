public class Auto {

    public String marka;
    public String model;
    public Integer rokProdukcji;
    public Integer przebieg;

    public void jedz() {
        System.out.println("Jade!");
    }

    public void hamuj() {
        System.out.println("Hamuje!");
    }

    public void info() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok prodkukcji: " + rokProdukcji);
        System.out.println("Przebieg: " + przebieg);
    }
}
