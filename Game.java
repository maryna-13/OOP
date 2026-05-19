public class Game {
    private Character[] characters;

    public Game() {
        // створюємо персонажів
        characters = new Character[]{
                new Warrior("Дракон"),
                new Mage("Гендальф"),
                new Archer("Ельф")
        };
    }

    public void startBattle() {
        try {
            for (Character attacker : characters) {
                for (Character target : characters) {
                    if (attacker != target && target.isAlive()) {
                        attacker.attack(target); // атака
                        attacker.specialAbility(); // спецздібність
                        target.defend(); // захист
                    }
                }
            }

            printStatus(); // виводомо рівень життя усіх персонажів


        } catch (Exception e) {
            System.out.println("Помилка під час бою: " + e.getMessage());
        }
    }

    private void printStatus() {
        System.out.println("\nСтан персонажів:");
        for (Character c : characters) {
            System.out.println(c.getName() + ": " + c.getHealth() + " HP");
        }
    }
}
