import java.util.ArrayList;
import java.util.Scanner;

////3/13第二周作業
public class YT2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Hero> herolist = new ArrayList<Hero>();
        String str = "";

        while (true) {
            System.out.println(
                    "menu:\nA: Add new hero\nB: Search hero\nC: Update hero\nD: Show hero list\nE: Exit.\noperations: ");
            String tmp = sc.nextLine();
            if (tmp.equals("A") || tmp.equals("a")) {// 建立新英雄
                System.out.println("Hero name:");
                herolist.add(new Hero(sc.nextLine()));
                System.out.println("Q Skill:");
                herolist.get(herolist.size() - 1).setQskill(sc.nextLine());
                System.out.println("W Skill:");
                herolist.get(herolist.size() - 1).setWskill(sc.nextLine());
                System.out.println("E Skill:");
                herolist.get(herolist.size() - 1).setEskill(sc.nextLine());
                System.out.println("R Skill:");
                herolist.get(herolist.size() - 1).setRskill(sc.nextLine());
            }
            if (tmp.equals("B") || tmp.equals("b")) {// 尋找英雄
                System.out.println("Search hero:");
                Boolean flag = true;
                String tmp_name = sc.nextLine();
                for (int i = 0; i < herolist.size(); i++) {
                    String get = herolist.get(i).getName();
                    if (tmp_name.equals(get) && i < herolist.size()) {
                        System.out.println(herolist.get(i).getAll());
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("can not find hero");
                }
            }
            if (tmp.equals("C") || tmp.equals("c")) {// 修改英雄資料
                System.out.println(" Update Hero:\nselect hero :");
                String tmp_name = sc.nextLine(), change;
                int num = 0;
                for (int i = 0; i < herolist.size(); i++) {
                    String get = herolist.get(i).getName();
                    if (tmp_name.equals(get) && i < herolist.size()) {
                        num = i;
                        break;
                    }
                }
                System.out.println(
                        "which one want to change?\nN -> Name\nQ -> Q skill\nW -> W skill\nE -> E skill\nR -> R skill");
                change = sc.nextLine();
                if (change.equals("N") || change.equals("n")) {
                    String ttmp = herolist.get(num).getName();
                    herolist.get(num).setName(sc.nextLine());
                    System.out.println("Name changed " + ttmp + " to " + herolist.get(num).getName());
                }
                if (change.equals("Q") || change.equals("q")) {
                    String ttmp = herolist.get(num).getQskill();
                    herolist.get(num).setQskill(sc.nextLine());
                    System.out.println("Q changed " + ttmp + " to " + herolist.get(num).getQskill());
                }
                if (change.equals("W") || change.equals("w")) {
                    String ttmp = herolist.get(num).getWskill();
                    herolist.get(num).setWskill(sc.nextLine());
                    System.out.println("W changed " + ttmp + " to " + herolist.get(num).getWskill());
                }
                if (change.equals("E") || change.equals("e")) {
                    String ttmp = herolist.get(num).getEskill();
                    herolist.get(num).setEskill(sc.nextLine());
                    System.out.println("E changed " + ttmp + " to " + herolist.get(num).getEskill());
                }
                if (change.equals("R") || change.equals("r")) {
                    String ttmp = herolist.get(num).getRskill();
                    herolist.get(num).setRskill(sc.nextLine());
                    System.out.println("R changed " + ttmp + " to " + herolist.get(num).getRskill());
                }
            }
            if (tmp.equals("D") || tmp.equals("d")) {// 列出所有英雄
                for (int i = 0; i < herolist.size(); i++) {
                    System.out.println(i + 1 + "->" + herolist.get(i).getName());
                }

            }
            if (tmp.equals("E") || tmp.equals("e")) {// exra 離開
                break;
            }
        }

        // item arry
        // int n = Integer.parseInt(sc.nextLine());
        // Hero[] heros = new Hero[n];
        // for (int i = 0; i < n; i++) {
        // heros[i] = new Hero(sc.nextLine());
        // }
        // for (int i = 0; i < n; i++) {
        // System.out.println(heros[i].getName());
        // System.out.println(Hero.getCount());
        // }
    }
}