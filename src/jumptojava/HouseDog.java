package jumptojava;

public class HouseDog extends Dog {
    public HouseDog(String name) {
        this.setName(name);
    }
    public HouseDog(int type) {
        if (type == 1) {
            this.setName("york");
        } else {
            this.setName("bulldog");
        }
    }
    public void sleep() {
        System.out.println(this.name+" zzz in house");
    }
    public void sleep(int hour) {
        System.out.println(this.name+" zzz in house for"+hour+"hours");
    }
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog("happy");
        HouseDog york = new HouseDog(1);
        System.out.println(houseDog.name);
        System.out.println(york.name);
    }
}
