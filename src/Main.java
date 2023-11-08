public class Main {
    public static void main(String[] args) {
        LifelineSite site = new LifelineSite(100, 5.5);
        System.out.println("Printing billable amount for a new Lifeline Site with units = 100 and rate = 5.5:");
        System.out.println(site.getBaseAmount() + site.getTaxAmount());
    }
}
