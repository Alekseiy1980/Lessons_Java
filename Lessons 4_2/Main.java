import java.util.*;


public class Main {
    public static void main(String[] args) {
//     String line = "Lorem ipsum dolor sit amet, consectetur adipiscing elit." +
//                " Sed eget libero auctor, varius felis in, faucibus tortor. " +
//                "Integer eget leo vitae justo auctor facilisis. Pellentesque ac" +
//                " urna in libero cursus bibendum. Maecenas auctor est nec arcu " +
//                "tincidunt, eget hendrerit metus bibendum. Ut vestibulum ligula" +
//                " a nulla pellentesque, sit amet tristique neque aliquet. " +
//                "Curabitur euismod aliquet lorem, in lacinia nunc viverra a. " +
//                "Sed vitae tincidunt ipsum. Nullam eget aliquam libero. Donec " +
//                "fringilla a lorem vel feugiat. Sed eu nisl nec justo laoreet " +
//                "euismod. Morbi non massa id turpis posuere placerat.";

//        line =line.toLowerCase();
//        line= line.replace("\"","").replace(",","").replace(".","");
//        ArrayList<String> arrayList= new ArrayList<>(Arrays.asList(line.split(" ")));
////        System.out.println(arrayList);
//        Map<String,Integer> map= new HashMap<String,Integer>();
//        for(int i=0; i<arrayList.size(); i++){
////            map.putIfAbsent(arrayList.get(i),1);
//            if(map.containsKey(arrayList.get(i)))
//            {
//               int tmp = map.get(arrayList.get(i)) + 1;
//               map.put(arrayList.get(i),tmp);
//            }else{
//                map.put(arrayList.get(i),1);
//            }
//        }
//        System.out.println(map.toString());


// Задача 2

        String line = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.";
        counterByLength(line);
    }
    public static void counterByLength(String line){
        TreeMap<Integer, ArrayList<String>> treeMap = new TreeMap<>();
        line = line.replace("\"","").replace(".","").toLowerCase();
        String[] array = line.split(" ");
// ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
// int maxLength = array[0].length();
// for (int i = 1; i < array.length-1; i++) {
// if (array[i].length() > maxLength){
// maxLength = array[i].length();
// }
// }
        for (int i = 0; i < array.length; i++) {
            int length = array[i].length();
            if (treeMap.containsKey(length)){
                var temp = treeMap.get(length);
                temp.add(array[i]);
                treeMap.put(length,temp);
            }else {
                treeMap.put(length,new ArrayList<>(Collections.singletonList(array[i])));
            }

        }

        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
    }
}

