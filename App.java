public class App {
    public static void main(String[] args) throws Exception {
       double cardBalance;
       double cardInterest;
       double firstMonth;
       double secondMonth;
       
       cardBalance = 5000;
       cardInterest = 0.17;
       firstMonth = cardBalance + (cardBalance * cardInterest);
       secondMonth = firstMonth + (firstMonth * cardInterest);
       
        System.out.println("Your initial balance was " + cardBalance + " After 1 month it will be " + firstMonth + " After 2 months it will be " +secondMonth);
    }
}
