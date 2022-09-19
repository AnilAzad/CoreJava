package maccess;

import java.util.*;

public class DeQueue {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        Deque<Integer> ob = null;
        String type = null;
        while (true) {
            System.out.println("=====Choice=====");
            System.out.println("1.ArrayDeque\n2.LinkedList\n3.exit");
            System.out.println("Enter the Choice : ");
            switch (s.nextInt()) {
                case 1:
                    type = "ArrayQeque";
                    ob = new ArrayDeque<Integer>();
                    break;
                case 2:
                    type = "LinkedList";
                    ob = new LinkedList<Integer>();
                    break;
                case 3:
                    System.out.println("Deque operation stopped..");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice...");
            }
            System.out.println("====Operations on " + type + "=====");
            x: while (true) {
                System.out.println("1.Add\n2.addFirst\n3.addLast\n4.removeFirst\n5.removeLast\n6.Exit");
                System.out.println("Enter the Chioce");
                switch (s.nextInt()) {
                    case 1:
                        System.out.println("Enter the element :");
                        ob.add(new Integer(s.nextInt()));
                        System.out.println(ob);
                        break;
                    case 2:
                        System.out.println("Enter the ele to addFirst : ");
                        ob.addFirst(new Integer(s.nextInt()));
                        System.out.println(ob);
                        break;
                    case 3:
                        System.out.println("Enter the ele to addLast : ");
                        ob.addLast(new Integer(s.nextInt()));
                        System.out.println(ob);
                        break;
                    case 4:
                        if (ob.isEmpty()) {
                            System.out.println(type + " is empty..");
                        } else {
                            ob.removeFirst();
                            System.out.println(ob);
                        }
                        break;
                    case 5:
                        if (ob.isEmpty()) {
                            System.out.println(type + " is empty..");
                        } else {
                            ob.removeLast();
                            System.out.println(ob);
                        }
                        break;
                    case 6:
                        System.out.println(type + " operation stoped...");
                        break x;

                    default:
                        System.out.println("Invalid Choice...");
                }
            }

        }
    }
}
