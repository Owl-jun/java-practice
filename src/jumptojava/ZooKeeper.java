package jumptojava;

public class ZooKeeper {
    public void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }
    public void wal(Barkable animal) {
        animal.bark();
    }
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
        zooKeeper.wal(lion);
        zooKeeper.wal(tiger);
    }
    
}
