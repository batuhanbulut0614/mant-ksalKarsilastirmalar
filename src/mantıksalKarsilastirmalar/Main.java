package mantıksalKarsilastirmalar;

public class Main {

	public static void main(String[] args) {
		double product1=12.99;
		double product2=12.99;
		if(product1==product2) {
            System.out.println("eşit");
	    }
        if(product1<product2) {
    	    System.out.println("1. ürün daha ucuz");
        }   
        if(product2<product1) {
        	System.out.println("2. ürün daha ucuz");
        }
        
        //yüz ifadeleri başlangıç
        String yuzIfadesi1="ÜZGÜN";
        String yuzIfadesi2="mutlu";
        if(yuzIfadesi1=="mutlu"||yuzIfadesi1=="Mutlu"||yuzIfadesi1=="MUTLU") {
        	System.out.println("(:");
        } 
        if(yuzIfadesi2=="üzgün"||yuzIfadesi2=="Uzgün"||yuzIfadesi2=="ÜZGÜN") {
        	System.out.println("):");
        }	
        // yüz ifadeleri bitiş  
     	
     }
        
}
