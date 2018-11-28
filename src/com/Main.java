package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // word 6 letters and have a "cat"
        //cat\w{3}|\wcat{2}|w{2}cat\w|\w{3}cat
        //1 b\w{6}\b
        //2 \b\w*cat\w*\b
        //(?=\b\w{6}\b)\b\w*cat\w*\b
        //(?=\b\w{6}\b)\w*cat\w*
        //(?=\b\w{6}\b)\w{0,3}cat\w*
        //\(?=\w{6}\b)\w{0,3}cat\w*
        Pattern p= Pattern.compile("(?=\\b\\w{6}\\b)\\w*cat\\w*");
        Matcher m=p.matcher("wecate");
        while (m.find()){
            System.out.println(m.start()+" "+m.group()+" ");
        }
        System.out.println(" ");

        //word 6-12 letters , should have cat or dog or mouse
        Pattern p2= Pattern.compile("\\b(?=\\w{6,12}\\b)\\w{0,9}(cat|dog|mouse)\\w*");
        Matcher m2=p2.matcher("wedogee");
        while (m2.find()){
            System.out.println(m2.start()+" "+m2.group()+" ");
        }
        System.out.println(" ");



    }
}
