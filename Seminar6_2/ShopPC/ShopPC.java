package ShopPC;

import java.util.*;

public class ShopPC {
    private List<PC>shopPC = new ArrayList<PC>();

    public void Load(PC pc){
        shopPC.add(pc);
    }

    @Override
    public String toString() {
        return "ShopPC{" +
                "shopPC=" + shopPC +
                '}';
    }

    public static Map<String, Object> filterParams = new HashMap<>();
    public  void filterPC() {


        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filterParams = new HashMap<>();
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Размер экрана");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Введите минимальный объем ОЗУ:");
                int ram = scanner.nextInt();
                filterParams.put("ram", ram);
                break;
            case 2:
                System.out.println("Введите минимальный объем ЖД:");
                int hdd = scanner.nextInt();
                filterParams.put("hdd", hdd);
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                String os = scanner.next();
                filterParams.put("os", os);
                break;
            case 4:
                System.out.println("Введите минимальный размер экрана:");
                int displaySize = scanner.nextInt();
                filterParams.put("displaySize", displaySize);
                break;
            default:
                System.out.println("Некорректный выбор.");
                return;
        }

        List<PC> filteredPCs = new ArrayList<>();
        for (PC pc : shopPC) {
            boolean isMatched = true;
            for (Map.Entry<String, Object> entry : filterParams.entrySet()) {
                switch (entry.getKey()) {
                    case "ram":
                        if (pc.getOsy() < (int) entry.getValue()) {
                            isMatched = false;
                        }
                        break;
                    case "hdd":
                        if (pc.getHd() < (int) entry.getValue()) {
                            isMatched = false;
                        }
                        break;
                    case "os":
                        if (!pc.getOs().equalsIgnoreCase((String) entry.getValue())) {
                            isMatched =false;
                        }
                        break;
                    case "displaySize":
                        if (pc.getDisplay() < (int) entry.getValue()) {
                            isMatched = false;
                        }
                        break;
                }
            }
            if (isMatched) {
                filteredPCs.add(pc);
            }
        }

        System.out.println("Найденные ПК:");
        for (PC pc : filteredPCs) {
            System.out.println(pc);
        }
    }

}
