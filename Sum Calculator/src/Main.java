public class Main {

    public static void main(String[] args) {

        SimpleCalculator chatGpt = new SimpleCalculator();

        chatGpt.setFirstNumber(36);
        chatGpt.setSecondNumber(4);

        System.out.println(chatGpt.getDivisionResult());
    }
}
