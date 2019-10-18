package chap4;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleCommissionArray {

    public static void main(String[] args) {
        int menu = 0;
        double sumsale = 0;
        double sumcom = 0;
        ArrayList<Saleman> saleList = new ArrayList();

        do {
            System.out.println("----------Menu----------");
            System.out.println("0 : Exit");
            System.out.println("1 : Sale Information Entry");
            System.out.println("2 : Commission Summary");
            System.out.println("------------------------");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Menu : ");
            menu = sc.nextInt();
            int count = 0;
            switch (menu) {
                case 1:
                    System.out.print("Enter ID : ");
                    String id = sc.next();
                    System.out.print("Enter Name : ");
                    String name = sc.next();
                    System.out.print("Enter Surname : ");
                    String surname = sc.next();
                    System.out.print("Enter Class : ");
                    int saleclass = sc.nextInt();
                    System.out.print("Enter Sale Total : ");
                    double saletotal = sc.nextDouble();
                    count++;

                    Saleman scc = new Saleman();
                    scc.setId(id);
                    scc.setName(name);
                    scc.setSurname(surname);
                    scc.setSaleClass(saleclass);
                    scc.setSaleTotal(saletotal);
                    saleList.add(scc);
                    break;
                case 2:
                    for (int i = 0; i < saleList.size(); i++) {
                        Saleman sale = saleList.get(i);
                        System.out.println("ID " + sale.getId());
                        System.out.println("name" + sale.getName());
                        System.out.println("Surname" + sale.getSurname());
                        System.out.println("SaleClass" + sale.getSaleClass());
                        System.out.println("SaleTotal" + sale.getSaleTotal());
                    }
                    sumsale = sumsale + sale.getSaleTotal();
                    if (sale.getSaleTotal() < 10000) {
                        switch (sale.getSaleClass()) {
                            case 1:
                                System.out.println("\tCommission : " + sale.getSaleTotal() * 0.05);
                                sumcom = sumcom + sale.getSaleTotal() * 0.05;
                                break;
                            case 2:
                                System.out.println("\tCommission : " + sale.getSaleTotal() * 0.15);
                                sumcom = sumcom + sale.getSaleTotal() * 0.15;
                                break;
                            case 3:
                                System.out.println("\tCommission : " + sale.getSaleTotal() * 0.25);
                                sumcom = sumcom + sale.getSaleTotal() * 0.25;
                                break;
                            default:
                                break;
                        }
                    } else {
                        switch (sale.getSaleClass()) {
                            case 1:
                                System.out.println("\tCommission : " + sale.getSaleTotal() * 0.10);
                                sumcom = sumcom + sale.getSaleTotal() * 0.10;
                                break;
                            case 2:
                                System.out.println("\tCommission : " + sale.getSaleTotal() * 0.20);
                                sumcom = sumcom + sale.getSaleTotal() * 0.20;
                                break;
                            case 3:
                                System.out.println("\tCommission : " + sale.getSaleTotal() * 0.30);
                                sumcom = sumcom + sale.getSaleTotal() * 0.30;
                                break;
                            default:
                                break;
                        }
                    }
            }
            System.out.println("\n***Summary***");
            System.out.println("Sale Count : " + count);
            System.out.println("Sale Total :" + sumsale + " baht");
            System.out.println("Commission Total : " + sumcom + " baht");
            break;

        } while (menu != 0);
    }
}
