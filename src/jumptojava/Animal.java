package jumptojava;

public class Animal {
    String name;
    String deco;
    public void setName(String name) {
        this.name = name;
    }
    public void decoName(String deco) {
        this.deco = deco+name;
    }
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setName("body");
        cat.decoName("-_-");
        System.out.println(cat.name);
        System.out.println(cat.deco);
        Animal dog = new Animal();
        dog.setName("king");
        dog.decoName("^_^");
        System.out.println(dog.name);
        System.out.println(dog.deco);
    }
}
