package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        Book[] listBook = new Book[5];
        listBook[0] = new Book("DragonBall", "Tác giả 1", 15000, 10, 0.2);
        listBook[1] = new Book("Doraemon", "Tác giả 2", 20000, 50, 0.3);
        listBook[2] = new Book("DemonSlayer", "Tác giả 3", 25000, 20, 0.4);
        listBook[3] = new Book("JujutsuKaisen", "Tác giả 4", 18000, 13, 0.2);
        listBook[4] = new Book("Onepiece", "Tác giả 5", 20000, 50, 0.5);
        double sumofprice = 0, sumofweight = 0;
        for (int i = 0; i < listBook.length; i++) {
            sumofprice += listBook[i].getTotalPrice();
            sumofweight += listBook[i].getTotalWeight();
        }
        System.out.println("Tổng giá của 5 tựa sách là : " + sumofprice);
        System.out.println("Tổng khối lượng của 5 tựa sách là : " + sumofweight);
        System.out.print("Nhập tên sách mà bạn muốn tìm : ");
        String book = scanner.nextLine();
        findBook(listBook,book);
    }
        public static void findBook(Book[] arr,String name){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].getName().equals(name)){
                    System.out.println("Cuốn sách "+arr[i].getName() +" của "+ arr[i].getAuthor()+" có giá là "+arr[i].getPrice()+" và chúng tôi còn " +arr[i].getQuantity()+" quyển");
                    break;
                }if (i==arr.length-1){
                    System.out.println("Không có cuốn sách bạn muốn tìm");
                }
            }
        }

}
