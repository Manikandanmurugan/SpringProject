package ProjectPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String a="manikandan";
	     Map<Character,Integer>obj=new HashMap<Character,Integer>();
	     char[]b=a.toCharArray();
	     for(Character o:b){
	    	 if(obj.containsKey(o)){
	    		 obj.put(o,obj.get(o)+1);
	    	 }
	    	 else{
	    		 obj.put(o,1);
	    	 }
	     }
	     Set<Character>obj1=obj.keySet();
	     for(Character w:obj1){
	    	 if(obj.get(w)>1){
	    		 System.out.println(w+"="+obj.get(w));
	    	 }
	    	 
	     }
}
}