public class App {
    public static void main(String[] args) {

        // Creates a new object named "Knight" from Character class
        Character knight = new Character(10, 5, 0, "Chen");
        // Calls the sayMyName method
        knight.sayMyName();
        knight.sayMyAgility();

        // Creates a new object named "mage" from Character class
        Character mage = new Character(0, 5, 10, "Akasha");
        // Calls the sayMyName method
        mage.sayMyName();
        mage.sayMyAgility();

        // Creates a new object named "mage" from Character class
        Character thief = new Character(5, 10, 0, "Gondar");
        // Calls the sayMyName method
        thief.sayMyName();
        thief.sayMyAgility();

        // Creates a new object named "healer" from Character class
        Character healer = new Character(4, 9, 9, "Zoro");
        // Calls the sayMyName method
        healer.sayMyName();
        healer.sayMyAgility();
    }
}
