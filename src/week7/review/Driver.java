package week7.review;

public class Driver {

    public static void main(String[] args) {
        Meat meat = new Meat("Ham");
        meat.setCalories(120);
        meat.setPricePerPound(3.99);
        // Display some stuff
        System.out.println("Is that a " + meat.getType() + " sandwich?");
        System.out.println("Don’t you find " + meat.getPricePerPound() +
            "rather expensive?");
        System.out.println("At least its only " + meat.getCalories() +
            " calories!");
    }

}
