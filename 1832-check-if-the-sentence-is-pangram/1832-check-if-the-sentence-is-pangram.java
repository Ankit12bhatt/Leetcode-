class Solution {
    public boolean checkIfPangram(String sentence) {
        int length=sentence.length();
        int count=0;
        int arr[]=new int[26];
        if(length<26)
        {
            return false;
        }
        for(int i=0;i<length;i++)
        {
            int index=sentence.charAt(i)-'a';
            arr[index] +=1;
            
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=0)
            {
                count++;
                
            }
            else
            {
                return false;
            
            }
        }
        if(count==26)
        {
            return true;
        }
        else
        {
            return false;
        }
        
        
    }
}