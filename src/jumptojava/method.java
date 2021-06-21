package jumptojava;

public class method {
    String NAME;
    int nums;
    public int sum(int a, int b) {
        return a+b;
    }
    public String say() {
        return "Hi";
    }
    public void sayHello() {
        this.nums++;
        System.out.println("Hello");
    }
    public void auto(String NAME) {
        
        System.out.println("Hi"+NAME);
    }
    public int vartest(int a) {
        return ++a;
    }
    public static void main(String[] args) {
        int result;
        method sumNums = new method();
        sumNums.nums = 21;
        result = sumNums.sum(3,5);
        System.out.println(result);
        System.out.println(sumNums.say());
        sumNums.sayHello();
        System.out.println(sumNums.nums);
        sumNums.auto("OWL");
        method zzz = new method();
        zzz.auto("vox");
        method xxx = new method();
        System.out.println(xxx.vartest(3));
    }
}
