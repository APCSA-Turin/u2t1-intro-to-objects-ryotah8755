public class CatRunner{
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bob", 6, 12.5);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Carlsen", 9, 18);
        cat2.printCatInfo();
        cat2.introduce();


    
    }
}