//Which IntelliJ-supported refactorings from the blog in step 1 were you able to use?
// I was able to use the Deleting and renaming described in the blog. I didn't use the Extracting described.

public class Main {
    public static void main(String[] args) {
        ResidentialSite residentialSite = new ResidentialSite(100, 5.5);
        System.out.println("Printing billable amount for a new Residential Site with units = 100 and rate = 5.5:");
        System.out.println(residentialSite.getBillableAmount());
        LifelineSite lifelineSite = new LifelineSite(100, 5.5);
        System.out.println("Printing billable amount for a new Lifeline Site with units = 100 and rate = 5.5:");
        System.out.println(lifelineSite.getBillableAmount());
    }
}