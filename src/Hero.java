class Hero {
    private int health;
    private int damage;
    private String superPower;

    public int getHealth() {
        return this.health;
    }
    public int getDamage() {
        return this.damage;
    }
    public String getSuperPower() {
        return this.superPower;
    }

    public Hero(int health, int damage, String superPower) {
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }
}