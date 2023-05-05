public class Main {
    public static void main(String[] args){
        Boss villain = new Boss();
        villain.setHealth(800);
        villain.setDamage(60);
        villain.setProtectionType("Physical");
        System.out.println("Boss health: " + villain.getHealth() + ", damage: " + villain.getDamage() + ", protection type: " + villain.getProtectionType());
        System.out.println();

        createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("Hero health: " + createHeroes()[i].getHealth() + ", damage: " + createHeroes()[i].getDamage()
                    + ", SuperPower: "  + createHeroes()[i].getSuperPower());
        }
    }

    public static Hero heroWithUltimate(int health, int damage, String superPower) {
        Hero hero = new Hero(health, damage, superPower);
        return hero;
    }
    public static Hero withoutUltimate(int health,int damage) {
        Hero hero = new Hero(health, damage);
        return hero;
    }
    public static Hero[] createHeroes() {
        Hero hero3 = withoutUltimate(240,40);
        Hero hero4 = heroWithUltimate(250,50,"Time Travel");
        Hero hero5 = heroWithUltimate(260,60,"Invisibility");

        Hero[] heroesOfWorld = {hero3, hero4, hero5};
        return heroesOfWorld;
    }
}