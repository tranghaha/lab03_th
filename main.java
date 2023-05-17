package bt1;

import java.time.LocalDate;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in); 
		        Order currentOrder = null;
		        int menu;
		        do{
		            System.out.println("1. Nhap:");
		            System.out.println("2. In ra man hinh:");
		            System.out.println("0.Thoat:");
		            menu = sc.nextInt();
		            switch(menu){
		                case 1:
		                    sc.nextLine();
		                    System.out.println("Nhap Ma SP:");
		                    String productID = sc.nextLine();
		                    
		                    System.out.println("Nhap mo ta:");
		                    String description = sc.nextLine();
		                    
		                    System.out.println("Nhap don gia:");
		                    double price = sc.nextDouble();
		                    
		                    System.out.println("Nhap so luong:");
		                    int quality = sc.nextInt();
		                    Product p = new Product(description, productID, price);
		                    if (currentOrder == null){
		                        currentOrder = new Order(LocalDate.now());
		                    }
		                    
		                currentOrder.addLineItems(p, quality);
		                System.out.println("Nhap thanh cong:");
		                break;
		                case 2:
		                    if (currentOrder != null){
		                        System.out.println(currentOrder.toString());
		                        currentOrder = null;
		                    } else{
		                        System.out.println("Hien tai khong co hang:");   
		                    }
		                    break;
		                default:
		                    if (menu == 0 ){
		                        System.out.println("Thoat ");
		                    } else {
		                        System.out.println("Vui long nhap lai lan nua");
		                    }
		                if (currentOrder != null){
		                    currentOrder = new Order(LocalDate.now());
		                }
		            }
		        }while(menu != 0);
		   }
	}