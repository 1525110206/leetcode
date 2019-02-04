package com.javaweb.algorithm;

class Interview {
    static{
        System.out.println("1");
    }
    public Interview(){
        System.out.println("2");
    }

}
class B extends Interview{
    static {
        System.out.println("a");
    }
    public B(){
        System.out.println("b");
    }
}

class Hello{
    public static void main(String[] args){
        Interview ab = new B();
        ab = new B();
    }
}