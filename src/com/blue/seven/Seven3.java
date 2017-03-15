package com.blue.seven;

public class Seven3 {
	

	public static void main(String[] args) {
		
		test();
		//29
		//想不到这么多层的循环也可以！
	}

	private static void test() {
		int count=0;
		int def,ghi;
		double bc,dg;
		for(int a=1;a<=9;a++){
			for(int b=1;b<=9;b++){
				if(b!=a){
					for(int c=1;c<=9;c++){
						if(c!=a&&c!=b){
							bc=(double)b/c;
							
		  for(int d=1;d<=9;d++){
			  if(d!=a&&d!=b&&d!=c){
				  for(int e=1;e<=9;e++){
					  if(e!=a&&e!=b&&e!=c&&e!=d){
						  for(int f=1;f<=9;f++){
							  if(f!=a&&f!=b&&f!=c&&f!=d&&f!=e){
								  def=d*100+e*10+f;
								  
				for(int g=1;g<=9;g++){
					if(g!=a&&g!=b&&g!=c&&g!=d&&g!=e&&g!=f){
						for(int h=1;h<=9;h++){
							if(h!=a&&h!=b&&h!=c&&h!=d&&h!=e&&h!=f&&h!=g){
								for(int i=1;i<=9;i++){
									if(i!=h&&i!=a&&i!=b&&i!=c&&i!=d&&i!=e&&i!=f&&i!=g){
										ghi=g*100+h*10+i;
										dg=(double)def/ghi;
										/*int x=a*ghi*c+b*ghi+def*c;
										int y=10*ghi*c;
										if(x==y){
											count++;
											System.out.println(count);
										}*/
										if((a+bc+dg)==10){
											
											count++;
											System.out.println(count);
										}
										
									}
								}
							}
						}
					}
				}
								  
								  
								  
							  }
						  }
					  }
				  }
			  }
		  }
								
							
							
						}
					}
				}
			}
		}
		
		
	}

	

}
