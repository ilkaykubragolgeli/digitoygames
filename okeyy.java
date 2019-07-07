package digitoy;

import java.util.Random;


public class okeyy {

	public static void main(String[] args) {
		
		int gosterge; int okey;
	
	    int [] kisi0 = new int[15];
		int [] kisi1 = new int[15];
		int [] kisi2 = new int[15];
		int [] kisi3 = new int[15];

	    int [] taslar = new int[106];
		
	    
	    
	    for(int i=0; i<2; i++)
	    {
	    	for(int j=0; j<53; j++)
	    	{
	    		if(i==0)
	    		{
	    			taslar[j] =j;
	    		}
	    		else if(i==1)
	    		{
	    			taslar[j+53]=j;
	    		}
	    		
	    	}
	    	
	    }
	    
	    
	    
	    Random rnd = new Random();
	    gosterge = rnd.nextInt(52);
	    okey = gosterge+1;
	   
	    
	    int rastkisi;
	    Random rndom = new Random();
	    rastkisi = rndom.nextInt(3);
	    
	    
	    if(rastkisi == 0)
	    {
	    	
	        for(int i =0; i<15; i++)
	          {
	        	
	        	Random random = new Random();
	        	int tas = rnd.nextInt(52);
	    	    kisi0[i] = taslar[tas];
	    	    taslar[tas] = -1;  //seçilen taş bidaha seçilmemesi için null yaptım
	    	    
	    	  }
	        
	        
	        for(int i =0; i<14; i++)
	          {
	        	
	        	Random random = new Random();
	        	int tas = rnd.nextInt(52);
	    	    kisi1[i] = taslar[tas];
	    	    taslar[tas] = -1;
	    	    
	    	  }
	        
	        for(int i =0; i<14; i++)
	          {
	        	
	        	Random random = new Random();
	        	int tas = rnd.nextInt(52);
	    	    kisi2[i] = taslar[tas];
	    	    taslar[tas] = -1;
	    	    
	    	  }
	        
	        
	        for(int i =0; i<14; i++)
	          {
	        	
	        	Random random = new Random();
	        	int tas = rnd.nextInt(52);
	    	    kisi3[i] = taslar[tas];
	    	    taslar[tas] = -1;
	    	    
	    	  }
	        
	        
	    }
	    
	    
	   
	     
	   
	    
	    if(rastkisi == 1)
	    {
	    	
	        for(int i =0; i<15; i++)
	          {
	        	
	        	Random random = new Random();
	        	int tas = rnd.nextInt(52);
	    	    kisi1[i] = taslar[tas];
	    	    taslar[tas] = -1;
	    	    
	    	  }
	        
	        
	        for(int i =0; i<14; i++)
	          {
	        	
	        	Random random = new Random();
	        	int tas = rnd.nextInt(52);
	    	    kisi0[i] = taslar[tas];
	    	    taslar[tas] = -1;
	    	    
	    	  }
	        
	        for(int i =0; i<14; i++)
	          {
	        	
	        	Random random = new Random();
	        	int tas = rnd.nextInt(52);
	    	    kisi2[i] = taslar[tas];
	    	    taslar[tas] = -1;
	    	    
	    	  }
	        
	        
	        for(int i =0; i<14; i++)
	          {
	        	
	        	Random random = new Random();
	        	int tas = rnd.nextInt(52);
	    	    kisi3[i] = taslar[tas];
	    	    taslar[tas] = -1;
	    	    
	    	  }
	        
	        
	    }
	    
	    
	    
	    
	    
	    
	    if(rastkisi == 2)
	    {
	    	
	        for(int i =0; i<15; i++)
	          {
	        	
	        	Random random = new Random();
	        	int tas = rnd.nextInt(52);
	    	    kisi2[i] = taslar[tas];
	    	    taslar[tas] = 0;
	    	    
	    	  }
	        
	        
	        for(int i =0; i<14; i++)
	          {
	        	
	        	Random random = new Random();
	        	int tas = rnd.nextInt(52);
	    	    kisi0[i] = taslar[tas];
	    	    taslar[tas] = -1;
	    	    
	    	  }
	        
	        for(int i =0; i<14; i++)
	          {
	        	
	        	Random random = new Random();
	        	int tas = rnd.nextInt(52);
	    	    kisi1[i] = taslar[tas];
	    	    taslar[tas] = 0;
	    	    
	    	  }
	        
	        
	        for(int i =0; i<14; i++)
	          {
	        	
	        	Random random = new Random();
	        	int tas = rnd.nextInt(52);
	    	    kisi3[i] = taslar[tas];
	    	    taslar[tas] = -1;
	    	    
	    	  }
	        
	        
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    if(rastkisi == 3)
	    {
	    	
	        for(int i =0; i<15; i++)
	          {
	        	
	        	Random random = new Random();
	        	int tas = rnd.nextInt(52);
	    	    kisi3[i] = taslar[tas];
	    	    taslar[tas] = -1;
	    	    
	    	  }
	        
	        
	        for(int i =0; i<14; i++)
	          {
	        	
	        	Random random = new Random();
	        	int tas = rnd.nextInt(52);
	    	    kisi0[i] = taslar[tas];
	    	    taslar[tas] = -1;
	    	    
	    	  }
	        
	        for(int i =0; i<14; i++)
	          {
	        	
	        	Random random = new Random();
	        	int tas = rnd.nextInt(52);
	    	    kisi1[i] = taslar[tas];
	    	    taslar[tas] = -1;
	    	    
	    	  }
	        
	        
	        for(int i =0; i<14; i++)
	          {
	        	
	        	Random random = new Random();
	        	int tas = rnd.nextInt(52);
	    	    kisi2[i] = taslar[tas];
	    	    taslar[tas] = -1;
	    	    
	    	  }
	        
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	  
	    
	    
	    
	}   
	}

