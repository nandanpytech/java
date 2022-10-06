package Practice;

public class CellsWithOddValues {
    public static void main(String[] args) {
        int[][] indices = {{0,1},{1,1}};
        int m=2,n=3;
        int oddCount=0,totalCount=0;
        int[] rows = new int[m];
        int[] columns = new int[n];
        for(int i=0; i<indices.length;i++){
            rows[indices[i][0]]+=1;
            columns[indices[i][1]]+=1;
        }
        for(int j=0;j<m;j++)
        {
            if(rows[j]%2==1)
                oddCount++;
        }
        totalCount=oddCount*n;
        for(int j=0;j<n;j++)
        {
            if(columns[j]%2==1)
                totalCount=totalCount+m-oddCount*2;
        }
        System.out.println(totalCount);
    }
}
