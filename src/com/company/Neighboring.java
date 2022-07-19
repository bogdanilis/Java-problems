package com.company;


public class Neighboring {
    public static final int smallestDistance(final int[] pArray) {
        int minDistance = Integer.MAX_VALUE;
        int index=0;
        for (int i = 1; i < pArray.length; i++) {
            int difference = pArray[i] - pArray[i - 1];
            if (difference < minDistance&&difference>=0) {
                minDistance = difference;
                index = i-1;
            }
        }
        return index;
    }

        public static void main (String[]args){
            {
                int [] numArr=new int[]{4, 8, 6, 1, 2, 9, 4};

                System.out.println(smallestDistance(numArr));
            }
        }
    }

