package OOP;

import java.util.ArrayList;
import java.util.List;

public class CatCleaner {
    private List<Cat> CatList = new ArrayList<Cat>();
     public void checCat(Cat cat) {
        if(cat.getState() ){
            CatList.add(cat);
        }else{
            System.out.println("Извените но Ваш "+ cat.getName()+" здаров");
        }
        System.out.println(CatList);
    }
}

