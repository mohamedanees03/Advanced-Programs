public class XPattern {
    public static void main(String[] args) {
        String word="numbers";
        PrintXPattern(word);
    }
    public static void PrintXPattern(String str){
        int len=str.length();
        char[][] arr=new char[len][len];
        
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(i==j) 
                    arr[i][j]=str.charAt(i);
                else if(i+j==len-1)
                    arr[i][j]=str.charAt(i);
                else 
                    arr[i][j]=' ';
            }
        }
        
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
