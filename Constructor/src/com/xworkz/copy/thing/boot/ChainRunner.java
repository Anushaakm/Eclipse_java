package com.xworkz.copy.thing.boot;

import com.xworkz.copy.thing.task.Chain;

public class ChainRunner {

	public static void main(String[] args) {
	
		Chain chain=new Chain();
		System.out.println(chain.type);
				
				Chain chain0=new Chain("ChainA");
				System.out.println(chain0.type);
				
				Chain chain1=new Chain("ChainB",20000);
				System.out.println(chain1.type);
				System.out.println(chain1.price);
				
				Chain chain2=new Chain("ChainC",20000,14);
				System.out.println(chain2.type);
				System.out.println(chain2.price);
				System.out.println(chain2.length);
				
				Chain chain3=new Chain("ChainD",2000,14,"24 Carrot Gold");
				System.out.println(chain3.type);
				System.out.println(chain3.price);
				System.out.println(chain3.length);
				System.out.println(chain3.material);
				
				Chain chain4=new Chain("ChainE",2000,14,"24 Carrot Gold",20);
				System.out.println(chain4.type);
				System.out.println(chain4.price);
				System.out.println(chain4.length);
				System.out.println(chain4.material);
				System.out.println(chain4.weight);
				
				Chain chain5=new Chain("ChainF",2000,14,"24 Carrot Gold",20, false);
				System.out.println(chain5.type);
				System.out.println(chain5.price);
				System.out.println(chain5.length);
				System.out.println(chain5.material);
				System.out.println(chain5.weight);
				System.out.println(chain5.stolen);
				
				Chain chain6=new Chain("ChainG",2000,14,"24 Carrot Gold",20, false,"Marriage");
				System.out.println(chain6.type);
				System.out.println(chain6.price);
				System.out.println(chain6.length);
				System.out.println(chain6.material);
				System.out.println(chain6.weight);
				System.out.println(chain6.stolen);
				System.out.println(chain6.usedFor);
				
				Chain chain7=new Chain("Gold Chain",100000,14,"24 Carrot Gold",20, false,"Marriage",true);
				System.out.println(chain7.type);
				System.out.println(chain7.price);
				System.out.println(chain7.length);
				System.out.println(chain7.material);
				System.out.println(chain7.weight);
				System.out.println(chain7.stolen);
				System.out.println(chain7.usedFor);
				System.out.println(chain7.fresh);
				
				
				
				
				
				
			}

		}
	


