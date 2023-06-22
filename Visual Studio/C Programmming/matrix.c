void array_to_matrix(int **matrix, int *arr, int row, int col)
{
     int i,j,k=0;     
     for(i=0;i<row;i++)
     {
         for(j=0;j<col;j++)
         {
             matrix[i][j] = arr[k];
         }
     }
}