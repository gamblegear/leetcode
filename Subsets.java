public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	
		ArrayList<ArrayList<Integer>> alist = new ArrayList<ArrayList<Integer>>();
		
		if(S.length== 0) return alist;
		Arrays.sort(S);
		for(int i=0; i<=S.length; i++){
			ArrayList<Integer> ilist = new ArrayList<Integer>();
			getsubsets(S, ilist, alist, i, 0);
		}
		
		return alist;		    
    }

	public void getsubsets(int[] S, ArrayList<Integer> ilist, ArrayList<ArrayList<Integer>> alist, int len, int level){
		if(ilist.size() == len){
			ArrayList<Integer> temp = new ArrayList<Integer>(ilist);
			alist.add(temp);
			return;
		}
		
		for(int i=level; i<S.length; i++){
			ilist.add(S[i]);
			getsubsets(S,ilist,alist,len,i+1);
			ilist.remove(ilist.size()-1);
		}
	}
}