public class Club {
    public void openTheDoor(CoolGuy cg) {
        cg.tellJoke();
        if (cg instanceof Person) {
            Person p = (Person) cg;
            p.tellBadJoke();
        }
    }
}
