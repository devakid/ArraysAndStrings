
public class OneEdit {
	    public boolean isOneEditAway(String s1,String s2){
	        if(s1 == null || s2 == null){
	            throw new IllegalArgumentException("String is null. ");
	        }
	        if (s1.length() - s2.length() > 1 || s1.length() - s2.length() < -1 ){
	            return false;
	        }
	        boolean isOne = false;
	        for(int i = 0;i<s1.length();i++){
	             if (i == s2.length()) {
	                 return true;
	             }
	             if (isOne && (s1.charAt(i) != s2.charAt(i))){
	                 return false;
	             }
	             if (s1.charAt(i) != s2.charAt(i)){
	                 isOne = true;
	                 i++;
	             }
	        }
	        return true;
	    }
	    
	    public static void main(String[] args) {
	    	    OneEdit e = new OneEdit();
	    	    boolean isOneEdit = e.isOneEditAway("pale", "bae");
	    	    System.out.println(isOneEdit);
			
		}
}

