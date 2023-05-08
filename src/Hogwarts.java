class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void describe() {
        System.out.println("Имя ученика - " + name +
                ", мощность магии = " + magicPower + ", " +
                "расстояние трансгрессии = " + transgressionDistance);
    }
    public void compare(Hogwarts student2) {
        int sum1 = this.magicPower+ this.transgressionDistance;
        int sum2 = student2.magicPower+ student2.transgressionDistance;
        if (sum1 > sum2) {
            System.out.println(this.name +" обладает большей мощностью магии, чем "+student2.name);
        } else if (sum1 < sum2) {
            System.out.println(student2.name +" обладает большей мощностью магии, чем "+this.name);
        } else {
            System.out.println("Оба студента равны");
        }
    }

}
