package gof.designpatterns.creational._2_factory.after;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship", "abcde@naver.com");

        Ship whiteship = new WhiteShipFactory().orderShip("Whiteship", "abc@naver.com");
        System.out.println(whiteship);

        Ship blackship = new BlackShipFactory().orderShip("BlackShip", "defg@naver.com");
        System.out.println(blackship);
    }

    private void print (ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
