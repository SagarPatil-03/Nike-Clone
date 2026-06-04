package product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Program1 {

	
	public static void main(String args[])
	{

		
	

		ArrayList<Product> al = new ArrayList();
		
		List<Integer> li = Arrays.asList(2,1,10);
		

		try {
		  FileWriter fw = new FileWriter("output.txt");
		  
		  BufferedWriter bw = new BufferedWriter(fw);
		  for(Integer i:li)
		  {
			  bw.write("medicine bill "+LocalDate.now());
			  bw.newLine();
			  
			  bw.write("============================"); 
			  
			  bw.newLine();
			  double total=0;
			  for(Product p:al)
			  {
				  double ant =p.getPrice() *p.getQuantity();
				  total +=ant;
				  
				  bw.write(p.getName()+" |" +p.getPrice()+" "+p.getQuantity()+"="+ant);
				  bw.newLine();
			  }
			  bw.write("========================");
			  bw.newLine();
		   bw.write("total amt"+total);
		   bw.newLine();
		   bw.write("===========================");
		  
			  }
		  bw.close();
		  
		  
	}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	}

