public class App {
    public static void main(String[] args) throws Exception {
        int winterCost;
        int springCost;
        int summerCost;
        int fallCost; 
        int yearlyCost;

        winterCost = 250;
        springCost = 450;
        summerCost = 345;
        fallCost = 125;
        yearlyCost = winterCost + springCost + summerCost + fallCost;

        System.out.println("Your winter costs were " + winterCost + " Your spring costs were" +  springCost + " Your summer costs were " + summerCost + " Your fall costs were " + fallCost);
        System.out.println("Your yearly total was " + yearlyCost);
    }
}
