package maccess;

import test.*;
import java.util.*;

public class DemoMap1 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        Map<String, BookDetails> ob = null;
        String type = null;
        while (true) {
            System.out.println("=======Choice====");
            System.out.println("1.HashMap\n2.LinkedHashMap\n3.TreeMap\n4.Hashtable\n5.exit");
            System.out.print("Enter the choice : ");
            switch (Integer.parseInt(s.nextLine())) {
                case 1:
                    type = "HashMap";
                    ob = new HashMap<String, BookDetails>();
                    break;
                case 2:
                    type = "LinkedHashMap";
                    ob = new LinkedHashMap<String, BookDetails>();
                    break;
                case 3:
                    type = "TreeMap";
                    ob = new TreeMap<String, BookDetails>();
                    break;
                case 4:
                    type = "Hashtable";
                    ob = new Hashtable<String, BookDetails>();
                    break;
                case 5:
                    System.out.println("Map operation stoped..");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice...");
            }
            x: while (true) {
                System.out.println("*****Operation on " + type + "***********");
                System.out.println("====Choice====");
                System.out.println("1.put(K,V)\n2.remove(obj)\n3.get(obj)\n4.keySet()\n5.values()\n6.exit");
                System.out.print("Enter the choice : ");
                switch (Integer.parseInt(s.nextLine())) {
                    case 1:
                        System.out.print("Enter the Code : ");
                        String code = s.nextLine();
                        System.out.print("Enter the Name : ");
                        String name = s.nextLine();
                        System.out.print("Enter the author : ");
                        String author = s.nextLine();
                        System.out.print("Enter the Price : ");
                        Float price = Float.parseFloat(s.nextLine());
                        System.out.print("Enter the Qty : ");
                        int qty = Integer.parseInt(s.nextLine());
                        ob.put(new String(code), new BookDetails(name, author, price, qty));
                        System.out.println("=====Details(Java-8)======");
                        ob.forEach((p, q) -> {
                            System.out.println(p + "\t" + q);
                        });
                        break;
                    case 2:
                        if (ob.isEmpty()) {
                            System.out.println("Map is Empty...");
                        } else {
                            System.out.print("Enter the Key to remove the record : ");
                            String ele = new String(s.nextLine());
                            ob.remove(ele);
                            System.out.println("=====Details(Java-8)======");
                            ob.forEach((p, q) -> {
                                System.out.println(p + "\t" + q);
                            });
                        }
                        break;
                    case 3:
                        if (ob.isEmpty()) {
                            System.out.println("Map is Empty...");
                        } else {
                            System.out.print("Enter the Key to get the record : ");
                            String ele = new String(s.nextLine());
                            BookDetails v = ob.get(ele);
                            System.out.println("=====Details based on key (Java-8)======");
                            System.out.println(v.toString());
                        }
                        break;
                    case 4:
                        if (ob.isEmpty()) {
                            System.out.println("Map is Empty...");
                        } else {
                            Set<String> st = ob.keySet();
                            System.out.println("=====Display Keys (Java-8)======");
                            st.forEach((k) -> {
                                System.out.println(k);
                            });
                        }
                        break;
                    case 5:
                        if (ob.isEmpty()) {
                            System.out.println("Map is Empty...");
                        } else {
                            Collection<BookDetails> c = ob.values();
                            System.out.println("=====Display Keys (Java-8)======");
                            c.forEach((z) -> {
                                System.out.println(z);
                            });
                        }
                        break;
                    case 6:
                        System.out.println(type + " Operations Stopped..");
                        break x;

                    default:
                        System.out.println("Invalid Choice...");
                }
            }
        }
    }
}
