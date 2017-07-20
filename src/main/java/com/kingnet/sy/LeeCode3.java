package com.kingnet.sy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sunyue on 2017/7/20.
 */




//Given a string, find the length of the longest substring without repeating characters.
//
//        Examples:
//
//        Given "abcabcbb", the answer is "abc", which the length is 3.
//
//        Given "bbbbb", the answer is "b", with the length of 1.
//

//        Given "pwwkew", the answer is "wke", with the length of 3.
//        Note that the answer must be a substring, "pwke" is a subsequence and not a substring.



public class LeeCode3 {
    public int lengthOfLongestSubstring(String s) {
        char[] ch = s.toCharArray();
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int sum = 0;
        int j = 0;
        for(int i = 0;i < ch.length;i++){
            if(!map.keySet().contains(ch[i])){
                map.put(ch[i],i);
                j++;
                if(j>sum) sum = j;
            }else{
                i= map.get(ch[i]);
                map.clear();
                j=0;
            }
        }
        return sum;
    }
    public int lengthOfLongestSubstring2(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}
