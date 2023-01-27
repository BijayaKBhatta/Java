package graph;

public class NetworkDelayTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=4,K=2;
        int adjMatrix[][] =  new int [N][N];


        //[[2,1,1]
        //[2,3,1]
        		
        //[3,4,1]]
		adjMatrix[0][0]=2;
		adjMatrix[0][1]=1;
		adjMatrix[0][2]=1;
		adjMatrix[1][0]=2;
		adjMatrix[1][1]=3;
		adjMatrix[1][2]=1;
		adjMatrix[2][0]=3;
		adjMatrix[2][1]=4;
		adjMatrix[2][2]=1;
        
        
		NetworkDelayTime nt = new NetworkDelayTime();
		nt.networkDelayTime(adjMatrix, N, K);
	}
	
	

    public int networkDelayTime(int[][] times, int N, int K) {
        int adjMatrix[][] =  new int [N][N];
        
        
        for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                        if(i==j){
                             adjMatrix[i][j]=0;
                        }else
                        adjMatrix[i][j]=10000;
                    
                }
        }
        
        
             
        
        for(int i=0;i<times.length;i++){
            adjMatrix[times[i][0]-1][times[i][1]-1]=times[i][2];
            //adjMatrix[times[i][1]-1][times[i][0]-1]=times[i][2];
            
        }
         
        
        for(int k=0;k<N;k++){ // K=2
            for(int i=0;i<N;i++){ //i=1
                for(int j=0;j<N;j++){ //j=3
                    if(adjMatrix[i][i]>adjMatrix[i][k]+adjMatrix[k][j]){
                        adjMatrix[i][j]=adjMatrix[i][k]+adjMatrix[k][j];
                    }
                }
            }
        }
        for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
          System.out.print( adjMatrix[i][j]+" ");          
                }
             System.out.println("");
         }
             
            int longest=0;
            for(int i=0;i<N;i++){
                longest = Math.min(longest,adjMatrix[K-1][i]);
            }
            return longest;
    
}

}
