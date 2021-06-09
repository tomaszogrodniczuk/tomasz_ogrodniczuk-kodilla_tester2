public class FirstClass {
    public static void main(String[] args) {

        Notebook heavyNotebook = new Notebook(4000, 1000);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        int heavyNotebookWeight = heavyNotebook.getWeight();

        System.out.println("Waga: " + heavyNotebookWeight);

        Notebook oldNotebook = new Notebook(1200, 599);

        //String napis = "Hello from FirstClass!";
        //System.out.println(heavyNotebook.weight);
        //System.out.println(heavyNotebook.price);
        //System.out.println(oldNotebook.weight);
        //System.out.println(oldNotebook.price);

        LeapYear leapYear = new LeapYear(2024);
        boolean leap = leapYear.getLeapYear();
        System.out.println("Przestepny?" + leap);
    }
}
