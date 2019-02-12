package com.javaweb.leetcode;

import java.util.*;

public class RandomizedSet {
    //leetcode 380
    //这个题目由于要求O(1)的时间复杂度，所以我们建立map和list，map用来建立映射，list用来增删数据
    //对于插入操作，我们先看这个数字是否已经在哈希表中存在，如果存在的话直接返回false，
    // 不存在的话，我们将其插入到数组的末尾，然后建立数字和其位置的映射。
    // 删除操作是比较麻烦的，我们还是要先判断其是否在哈希表里，如果没有，直接返回false。
    // 由于哈希表的删除是常数时间的，而list并不是，为了使list删除也能常数级，
    // 我们实际上将要删除的数字和list的最后一个数字调换个位置，然后修改对应的哈希表中的值，
    // 这样我们只需要删除list的最后一个元素即可，保证了常数时间内的删除。
    Map<Integer, Integer> map = null;
    List<Integer> list = null;
    int count;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        count = 0;
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.get(val) == null){
            map.put(val, count++);
            list.add(val);
            return true;
        }else{
            return false;
        }
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }else if(count == 0){//如果有这个元素，而且count == 0
            //说明只有一个元素
            map.remove(val);
            return true;
        }else {
            int removeIndex = map.get(val);
            int lastEle = list.get(count - 1);
            map.put(lastEle, removeIndex);
            list.set(removeIndex,lastEle);
            count --;
            map.remove(val);
            list.remove(list.size() - 1);
            return true;
        }
    }

    /** Get a random element from the set. */
    public int getRandom() {
        Random random = new Random();
        return list.get(random.nextInt(count));
    }

    public static void main(String[] args){
        RandomizedSet r = new RandomizedSet();
        r.insert(0);
        r.insert(1);
        r.remove(0);
        r.insert(2);
        r.remove(1);
        System.out.println(r.getRandom());
        System.out.println(r.getRandom());
        System.out.println(r.getRandom());
    }


}
