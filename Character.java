public abstract class Character {
    protected String name;  // ім'я персонажа
    protected int health;  // рівень здоров'я


    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract void attack(Character target);
    public abstract void defend();
    public abstract void specialAbility();

    public String getName() {
        return name;
    }  // повертає ім'я

    public int getHealth() {
        return health;
    }  // повертає здоров'я

    public void takeDamage(int amount) {  //метод отримання шкоди
        health -= amount;
        if (health < 0) health = 0;
    }

    public boolean isAlive() {
        return health > 0;
    }  // перевірка чи персонаж живий
}
