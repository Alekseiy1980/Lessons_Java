package ShopPC;

import java.text.MessageFormat;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        enum Brend {
            HP , Acer, Lenovo, Asus, LG , GIGABYTE,Dell;


        }
        enum Os{
            Null,Windows, Linux
        }
        Random random = new Random();
        int count = 5;

//        int pic = random.nextInt(Brend.values().length);
//        String brend = String.valueOf(Brend.values()[pic]);
//        pic = random.nextInt(Os.values().length);
//        String OS = String.valueOf(Os.values()[pic]);
//
//        int display = random.nextInt(17 -13)+13;
//
//        int osy = random.nextInt(5);
//        switch (osy) {
//            case 0 : osy = 4; break;
//            case 1 : osy = 8; break;
//            case 2 : osy = 16; break;
//            case 3 : osy = 32; break;
//        }
//
//        int vCard = random.nextInt((5-1)+1)*2;
//        int hd = random.nextInt(8);
//        switch(hd){
//            case 0 : hd = 128; break;
//            case 1 : hd = 256; break;
//            case 2 : hd = 512; break;
//            case 3 : hd = 1; break;
//            case 4 : hd = 2; break;
//            case 5 : hd = 3; break;
//        }
            for(int i = 0; i <count; i++)
            {
                int pic = random.nextInt(Brend.values().length);
                String brend = String.valueOf(Brend.values()[pic]);
                pic = random.nextInt(Os.values().length);
                String os = String.valueOf(Os.values()[pic]);

                int display = random.nextInt(17 - 13)+13;

                int osy = random.nextInt(5);
                switch (osy) {
                    case 0 : osy = 4; break;
                    case 1 : osy = 8; break;
                    case 2 : osy = 16; break;
                    case 3 : osy = 32; break;
                }

                int vCard = random.nextInt((5 - 1) + 1) * 2;
                int hd = random.nextInt(8);
                switch(hd) {
                    case 0: hd = 128;break;
                    case 1: hd = 256;break;
                    case 2: hd = 512;break;
                    case 3: hd = 1;break;
                    case 4: hd = 2;break;
                    case 5: hd = 3;break;
                }
                PC pc = new PC(brend,os,display,osy,vCard,hd);

                System.out.println(pc.toString());}


//           System.out.println(brend + " " + OS + " " + display + " " + osy + " " + vCard + " " + hd );
    }

}
