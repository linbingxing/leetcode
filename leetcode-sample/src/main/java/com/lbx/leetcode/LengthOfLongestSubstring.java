package com.lbx.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *题目：
 *  给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度
 *   示例 1:
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 **/
public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcdefgsfsf"));
    }

    /**
      * 解题思路：
     *  利用hashmap的key
     *  循环遍历每个字符串放入map中，key为值，value为位置
     *
      *
     **/
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int index = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i= 0;i< s.length();i++){
           if(!map.containsKey(s.charAt(i))){
               if((i-index+1) > maxLength){
                   maxLength = i-index+1;
               }
           }else{
               index=Math.max(map.get(s.charAt(i))+1,index);
               if((i-index+1) > maxLength){
                   maxLength=i-index+1;
               }
           }
            map.put(s.charAt(i),i);
        }
        return maxLength;
    }

}
