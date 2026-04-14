import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[]={1,3,2,2,1,3,4,1,2,3};
		HashMap<Integer,Integer>map=new HashMap();
		for(int i=0;i<arr.length;i++){
		    if(map.containsKey(arr[i])){
		        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		    }
		    else{
		        map.put(arr[i],1);
		    }
		    }
		    System.out.print(map);
}
}
