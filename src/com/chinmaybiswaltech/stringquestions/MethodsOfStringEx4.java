package com.chinmaybiswaltech.stringquestions;

public class MethodsOfStringEx4 {

    public static void main(String[] args) {
        String s1 ="Rahul Dravid is epitome of elegance and consistency ";
        String rep1 = s1.replace('a','0');
        System.out.println(rep1);
        //0hul Dr0vid is epitome of eleg0nce 0nd consistency
        String rep2 = s1.replace("nc","NC");
        System.out.println(rep2);
        //Rahul Dravid is epitome of elegaNCe and consisteNCy
        String rep3 = s1.replaceAll("an","AN");
        System.out.println(rep3);
        //Rahul Dravid is epitome of elegANce ANd consistency
        String rep4 = s1.replaceFirst("an","AN");
        System.out.println(rep4);
        //Rahul Dravid is epitome of elegANce and consistency
    }
}
