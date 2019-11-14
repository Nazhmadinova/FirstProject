package CodingBat.String3;

public class MaxBlock {
    //Given a string, return the length of the largest "block" in the string.
    // A block is a run of adjacent chars that are the same.
    //
    //maxBlock("hoopla") → 2
    //maxBlock("abbCCCddBBBxx") → 3
    //maxBlock("") → 0

    public int maxBlock(String str)
    {
        int stLen = str.length();
        int maxBlock = 0;
        int block = 1;
        char ch;
        if(stLen == 0)
            return 0;
        ch = str.charAt(0);
        for(int i = 1; i < stLen; i++)
        {
            if(str.charAt(i) == ch)
                block++;
            else
            {
                if(block > maxBlock)
                    maxBlock = block;
                block = 1;
                ch = str.charAt(i);
            }
        }
        if(block > maxBlock)
            maxBlock = block;
        return maxBlock;
    }
}
