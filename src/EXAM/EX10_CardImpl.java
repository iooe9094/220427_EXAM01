package EXAM;

public class EX10_CardImpl implements EX9_Card {

    @Override
    public void getCardId() {
        System.out.println("CardId");
    }

    @Override
    public void getCardName() {
        System.out.println("CardName");
    }

    @Override
    public void getCardDescription() {
        System.out.println("CardDescription");
    }

    @Override
    public void printCard() {
        System.out.println("All Card Info");
    }
    
}
