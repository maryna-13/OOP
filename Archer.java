public class Archer extends Character {
    public Archer(String name) {
        super(name, 120);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " пускає стрілу в " + target.getName());
        target.takeDamage(15);
    }

    @Override
    public void defend() {
        System.out.println(name + " швидко ухиляється.");
        health += 2;
    }

    @Override
    public void specialAbility() {
        System.out.println(name + " використовує `дощ стріл` і атакує всіх ворогів!");
    }
}
