package org.example;

public class CountDoku {
    private static int totalCount = 0;
    private int instanceCount = 0;

    public static void incrementCount(){
       totalCount++;
    }

    public void incrementInstanceCount(){
        instanceCount ++;
    }

    @Override
    public String toString() {
        return "CountDoku{" +
                "instanceCount=" + instanceCount +
                "totalCount=" + totalCount +
                '}';
    }
}
