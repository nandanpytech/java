package Recursion2;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,5};
        int target=2;
        int index=0;
//       findindex(arr,target,index);
//       System.out.println(ans);

        System.out.println(findallindex(arr,target,index,new ArrayList<>()));
    }
    //Single occurance
//    static int findindex(int[] arr, int target,int index){
//        if(index== arr.length-1){
//            return -1;
//        }
//        if(arr[index]==target){
//            return index;
//        }else{
//            return findindex(arr,target,index+1);
//        }
//    }

    //Multiple occurance
   static ArrayList<Integer> ans= new ArrayList<>();           //why we can't include this arrylist inside function becoz of every call it alters the arraylist:
    static void findindex(int[] arr, int target, int index){
        if(index== arr.length-1){
            return ;
        }
        if(arr[index]==target){
            ans.add( index);
        }
        findindex(arr,target,index+1);
    }

    //Return arrylist
    static ArrayList<Integer> findallindex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index== arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findallindex(arr,target,index+1,list);
    }



    //4th type
    static ArrayList<Integer> findallIndex(int[]arr,int target, int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index== arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ans=findallIndex(arr,target,index+1);     //after comeout from the stack it executes the below one also..
        list.addAll(ans);
        return list;
    }
}
