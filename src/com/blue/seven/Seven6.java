package com.blue.seven;

public class Seven6 {
static int count = 0;
	
    static void swap(char array[], int a, int b) {  
        char temp = array[a];  
        array[a] = array[b];  
        array[b] = temp;  
    }  
    
    static boolean check(char [] str) {  
        if(check2(str[0], str[1]) && check2(str[0], str[3]) && check2(str[0], str[4]) && check2(str[0], str[5])   
                 && check2(str[1], str[2]) && check2(str[1], str[4]) && check2(str[1], str[5]) && check2(str[1], str[6])  
                 && check2(str[2], str[5]) && check2(str[2], str[6])  
                 && check2(str[3], str[4]) && check2(str[3], str[7]) && check2(str[3], str[8])  
                 && check2(str[4], str[5]) && check2(str[4], str[7]) && check2(str[4], str[8]) && check2(str[4], str[9])  
                 && check2(str[5], str[6]) && check2(str[5], str[8]) && check2(str[5], str[9])  
                 && check2(str[6], str[9]) && check2(str[7], str[8]) && check2(str[8], str[9]))  
            return true;  
        return false;  
    }
    
    static boolean check2(char c, char d) {  
        // TODO Auto-generated method stub  
        if(c == (d+1) || c == (d-1))  
            return false;  
        return true;  
    }
    
    static void permutation(char[] str, int a, int length){  
    	if(a == length){  
    		if(check(str)){  
                count++;  
                System.out.println(String.valueOf(str));  
            }  
        }else{  
        	for(int i = a; i <= length; ++i){  
                swap(str, i, a);  
                permutation(str, a + 1, length);
                swap(str, i, a);  
            }  
        }  
    }
  
    public static void main(String[] args) {  
        char[] str = "0123456789".toCharArray();  
        permutation(str, 0, 9);  
        System.out.println(count);  
    }  

	
}
	
	
	
	
	
	
	/*static int[][] a = new int[8][8];
	static int count = 0;
	
	public static int check(int i,int j) {
		
		return 0;
		
	} 
	
	public static int nexti(int i,int j) {
		if(j==4) i++;
		return i;
		
	}
	
	public static int nextj(int i,int j) {
		if(j==4) j=1;
		else j++;
		return j;
		
	}
	
	private static void f(int i, int j, int n) {
		
		if(i==3&&j==4) {
			count++;
			return;
		}
		
		for(int x=1;x<=10;x++){
			a[i][j]=x;
			//System.out.println(i+" "+j);
			if(check(i,j)==1){
				if(i==1&&j==2) {
					System.out.println(x);
					System.out.println("--"+count);
				}
				//System.out.println(a[i][j]);
				f(nexti(i,j), nextj(i,j), n+1);
				//System.out.println(count);
				//System.exit(0);
				
				a[i][j]=0;
			}
			
		}
		
	}

	public static void main(String[] args) {
		f(1, 2, 0);
		System.out.println(count);
	}
*/

