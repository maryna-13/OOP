public class Warrior extends Character {
    public Warrior(String name) {
        super(name, 150);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " замахується мечем на " + target.getName());
        target.takeDamage(20);
    }

    @Override
    public void defend() {
        System.out.println(name + " піднімає щит для захисту.");
        health += 5;
    }

    @Override
    public void specialAbility() {
        System.out.println(name + " використовує `Лють Берсерка` і завдає подвійної шкоди наступного ходу!");
    }
}


