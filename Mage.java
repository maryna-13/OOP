public class Mage extends Character {
    public Mage(String name) {
        super(name, 100);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " кидає вогняну кулю " + target.getName());
        target.takeDamage(25);
    }

    @Override
    public void defend() {
        System.out.println(name + " кидає магічний щит.");
        health += 3;
    }

    @Override
    public void specialAbility() {
        System.out.println(name + " використовує `Mana Surge` і відновлює здоров'я!");
        health += 20;
    }
}
