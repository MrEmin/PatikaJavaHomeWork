public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    double chance;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.chance = 0.5;
    }

    public void run() {

        if (checkWeight()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("======== YENİ ROUND ===========");
                if (isRun()) {
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    this.f1.health = this.f2.hit(f1);
                } else {
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    this.f2.health = this.f1.hit(f2);
                }
                if (isWin()) {
                    break;
                }
                printScore();
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }


    }

    public boolean checkWeight() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println("Maçı Kazanan : " + this.f2.name);
            return true;
        } else if (this.f2.health == 0){
            System.out.println("Maçı Kazanan : " + this.f1.name);
            return true;
        }

        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(this.f1.name + " Kalan Can \t:" + this.f1.health);
        System.out.println(this.f2.name + " Kalan Can \t:" + this.f2.health);
    }

    boolean isRun() {
        double randomNumber = Math.random();
        return randomNumber <= this.chance;
    }
}
