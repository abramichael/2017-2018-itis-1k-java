public class Human {
    private String name = "Kolya";
    private Hand hand = new Hand();
    private Nose nose = new Nose();
    private class Hand {
        public void move() {
            System.out.println("hand is moving");
        }
        public void scratchNose() {
            System.out.println("scratching the " + nose);
        }
    }
    public class Nose {
        private String name = "Nose";
        public String toString(){
            return this.name + " of " + Human.this.name;
        }
    }
    public void act() {
        moveHand();
        hand.scratchNose();
    }
    public void moveHand() {
        hand.move();
    }
    public static void main(String [] args) {
        Human h = new Human();
        h.act();
        Human.TestClass ht = new Human.TestClass();
        //Human.Hand hand = h.new Hand();
    }
    public static class TestClass {

    }

}
