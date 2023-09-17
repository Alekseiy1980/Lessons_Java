import java.util.HashMap;

public class CatShelder {
     HashMap <Integer,Cat> cats = new HashMap<Integer,Cat>();
     int id;

     void acceptTheCat(Cat cat) {
        id++;
        cats.put(id,cat);
}
void printCats(){
        System.out.println(cats.toString());
    }
}
