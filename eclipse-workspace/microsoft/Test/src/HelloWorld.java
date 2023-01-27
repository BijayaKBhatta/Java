
public class HelloWorld {
// 1000
//1100
//0010
//1110
	
	
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int pathMatrx [][] = {{1,0,0,0},{1,1,0,0},{0,0,1,0},{1,1,1,0}};//new int[4][4];
		System.out.println(getValidPath(pathMatrx,0,0,0));
	}

private static boolean getValidPath(int[][] pathMatrx, int i, int j, int count) {
	System.out.println("matrix index i="+i +"j="+j+"-"+pathMatrx.length+" value- "+pathMatrx[0].length);
	// TODO Auto-generated method stub
	if(i>=pathMatrx.length || i<0 || j>=pathMatrx[0].length || j<0 || pathMatrx[i][j]==0) {
		return false;
	}
	if(j == pathMatrx[0].length-1) {
		count++;
		System.out.println("pathhhhhhhhhhhhhhhhhhh = "+count);
		count++;
		return true;
	}
	
	//System.out.println("matrix index "+i +"j="+j+pathMatrx.length+pathMatrx[0].length);
	
	//(0, 0), (1,0),(2,0) 
	
	return getValidPath(pathMatrx,i+1,j, count) || 
			getValidPath(pathMatrx,i,j+1, count) || 
			getValidPath(pathMatrx,i-1,j, count) ||
			getValidPath(pathMatrx,i,j-1, count );
	
	//return false;
	
}

}
