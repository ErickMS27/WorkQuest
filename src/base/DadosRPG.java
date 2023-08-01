package workquest;

public class DadosRPG {

public void exibirResultado() {	
	
	for(
	int x1 = 0;x1<1;x1++)
	{
		System.out.println("Seu número no D04 é: " + new workquest.storage.DadosRPG().rolarD04());
	}

	for(
	int x2 = 0;x2<1;x2++)
	{
		System.out.println("\nSeu número no D06 é: " + new workquest.storage.DadosRPG().rolarD06());
	}

	for(
	int x3 = 0;x3<1;x3++)
	{
		System.out.println("\nSeu número no D08 é: " + new workquest.storage.DadosRPG().rolarD08());
	}

	for(
	int x4 = 0;x4<1;x4++)
	{
		System.out.println("\nSeu número no D10 é: " + new workquest.storage.DadosRPG().rolarD10());
	}

	for(
	int x5 = 0;x5<1;x5++)
	{
		System.out.println("\nSeu número no D12 é: " + new workquest.storage.DadosRPG().rolarD12());
	}

	for(
	int x6 = 0;x6<1;x6++)
	{
		System.out.println("\nSeu número no D20 é: " + new workquest.storage.DadosRPG().rolarD20());
	}
}

public int rolarD04() {

	// D04 de RPG

			double d04 = (int)((Math.random()*4));
								
	// Método de Jogar o D04
								
								if(d04>0 && d04 <= 4/4*1) {
										return 1;
								
								}else if(d04> 4/4*1 && d04 <= 4/4*2) {
										return 2;
								
								}else if(d04> 4/4*2 && d04 <= 4/4*3) {
										return 3;
								}else {
										return 4;
								}
}

public int rolarD06() {
	
	// D06 de RPG

				double d06 = (int)((Math.random()*6));									
	
	// Método de Jogar o D06
						
						if(d06>0 && d06 <= 6/6*1) {
								return 1;
						
						}else if(d06> 6/6*1 && d06 <= 6/6*2) {
								return 2;
						
						}else if(d06> 6/6*2 && d06 <= 6/6*3) {
								return 3;
								
						}else if(d06> 6/6*3 && d06 <= 6/6*4) {
								return 4;
								
						}else if(d06> 6/6*4 && d06 <= 6/6*5) {
								return 5;
							
						}else{
								return 6;
						}

}

public int rolarD08() {
	
	// D08 de RPG

				double d08 = (int)((Math.random()*8));									
	
	// Método de Jogar o D08
						
						if(d08>0 && d08 <= 8/8*1) {
								return 1;
						
						}else if(d08> 8/8*1 && d08 <= 8/8*2) {
								return 2;
						
						}else if(d08> 8/8*2 && d08 <= 8/8*3) {
								return 3;
								
						}else if(d08> 8/8*3 && d08 <= 8/8*4) {
								return 4;
								
						}else if(d08> 8/8*4 && d08 <= 8/8*5) {
								return 5;
							
						}else if(d08> 8/8*5 && d08 <= 8/8*6) {
								return 6;
						
						}else if(d08> 8/8*6 && d08 <= 8/8*7) {
								return 7;			
						
						}else{
								return 8;
						}

}

public int rolarD10() {
	
	// D10 de RPG

				double d10 = (int)((Math.random()*10));									
	
	// Método de Jogar o D08
						
						if(d10>0 && d10 <= 10/10*1) {
								return 1;
						
						}else if(d10> 10/10*1 && d10 <= 10/10*2) {
								return 2;
						
						}else if(d10> 10/10*2 && d10 <= 10/10*3) {
								return 3;
								
						}else if(d10> 10/10*3 && d10 <= 10/10*4) {
								return 4;
								
						}else if(d10> 10/10*4 && d10 <= 10/10*5) {
								return 5;
							
						}else if(d10> 10/10*5 && d10 <= 10/10*6) {
								return 6;
						
						}else if(d10> 10/10*6 && d10 <= 10/10*7) {
								return 7;			
						
						}else if(d10> 10/10*7 && d10 <= 10/10*8) {
								return 8;
								
						}else if(d10> 10/10*8 && d10 <= 10/10*9) {
								return 9;
								
						}else{
								return 10;
										
}
}

public int rolarD12() {
							
	// D12 de RPG

				double d12 = (int)((Math.random()*12));									
							
	// Método de Jogar o D08
												
						if(d12>0 && d12<= 12/12*1) {
								return 1;
												
						}else if(d12> 12/12*1 && d12 <= 12/12*2) {
								return 2;
												
						}else if(d12> 12/12*2 && d12 <= 12/12*3) {
								return 3;
														
						}else if(d12> 12/12*3 && d12 <= 12/12*4) {
								return 4;
														
						}else if(d12> 12/12*4 && d12 <= 12/12*5) {
								return 5;
													
						}else if(d12> 12/12*5 && d12 <= 12/12*6) {
								return 6;
												
						}else if(d12> 12/12*6 && d12 <= 12/12*7) {
								return 7;			
												
						}else if(d12> 12/12*7 && d12 <= 12/12*8) {
								return 8;
														
						}else if(d12> 12/12*8 && d12 <= 12/12*9) {
								return 9;
														
						}else if(d12> 12/12*9 && d12 <= 12/12*10) {
								return 10;
								
						}else if(d12> 12/12*10 && d12 <= 12/12*11) {
								return 11;
						}else{
								return 12;		
						}
}					

public int rolarD20() {
									
	// D20 de RPG

				double d20 = (int)((Math.random()*20));									
									
	// Método de Jogar o D08
														
						if(d20>0 && d20 <= 20/20*1) {
								return 1;
														
						}else if(d20> 20/20*1 && d20 <= 10/10*2) {
								return 2;
														
						}else if(d20> 20/20*2 && d20 <= 20/20*3) {
								return 3;
																
						}else if(d20> 20/20*3 && d20 <= 20/20*4) {
								return 4;
																
						}else if(d20> 20/20*4 && d20 <= 20/20*5) {
								return 5;
															
						}else if(d20> 20/20*5 && d20 <= 20/20*6) {
								return 6;
														
						}else if(d20> 20/20*6 && d20 <= 20/20*7) {
								return 7;			
														
						}else if(d20> 20/20*7 && d20 <= 20/20*8) {
								return 8;
																
						}else if(d20> 20/20*8 && d20 <= 20/20*9) {
								return 9;
										
						}else if(d20> 20/20*9 && d20 <= 20/20*10) {
								return 10;
													
						}else if(d20> 20/20*10 && d20 <= 20/20*11) {
								return 11;
															
						}else if(d20> 20/20*11 && d20 <= 20/20*12) {
								return 12;
															
						}else if(d20> 20/20*12 && d20 <= 20/20*13) {
								return 13;
														
						}else if(d20> 20/20*13 && d20 <= 20/20*14) {
								return 14;
													
						}else if(d20> 20/20*14 && d20 <= 20/20*15) {
								return 15;			
													
						}else if(d20> 20/20*15 && d20 <= 20/20*16) {
								return 16;
															
						}else if(d20> 20/20*16 && d20 <= 20/20*17) {
								return 17;
								
						}else if(d20> 20/20*17 && d20 <= 20/20*18) {
								return 18;			
												
						}else if(d20> 20/20*18 && d20 <= 20/20*19) {
								return 19;														
						}else{
								return 20;
																		
								}
								
}

}