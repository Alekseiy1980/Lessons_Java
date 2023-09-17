public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.age = 5;
        cat.name = "Барсик";
        Cat cat2 = new Cat();
        cat2.age = 2;
        cat2.name = "Felix";
        CatShelder catShelder = new SiberanCat();

        System.out.println(cat.toString());
        catShelder.acceptTheCat(cat2);
        catShelder.acceptTheCat(cat);
        catShelder.printCats();


    }
}
