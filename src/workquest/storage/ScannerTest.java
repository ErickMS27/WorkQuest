package workquest.storage;

import java.util.Scanner;

public class ScannerTest {
	
	    public static void main(String[] args) {
	        Scanner enter_1 = new Scanner(System.in);
	        Scanner enter_2 = new Scanner(System.in);
	        Scanner enter_3 = new Scanner(System.in);
	        
	        System.out.println("Seu nome:");
	        String nome = enter_1.nextLine();
	        
	        System.out.println("Sua idade:");
	        int idade = enter_2.nextInt();
	        
	        System.out.println("Sua profissão é:");
	        String profissao = enter_3.nextLine();
	        
	        enter_1.close(); 
	        enter_2.close();
	        enter_3.close();
	    }
	    
}
