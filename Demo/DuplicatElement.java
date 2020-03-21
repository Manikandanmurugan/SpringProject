package ProjectPackage;

import java.util.HashSet;
import java.util.Set;

public class DuplicatElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String[] string=new String[]{"java","spring","core","java","java"};
    Set nonDuplicate=new HashSet<>();
    Set duplicat=new HashSet<>();
    for(String element:string){
    	if(!nonDuplicate.contains(element)){
    		nonDuplicate.add(element);
    	}else{
    		duplicat.add(element);
    	}
    	
    }
    System.out.println(nonDuplicate);
	}

}
