package io.scurley.files;

import java.util.Scanner;

/**
 * Created by Sean on 9/24/2017.
 */
public class Truth {

    private Scanner k;

    public Truth(Scanner k){
        this.k = k;
    }

    private void print(String str){
        System.out.print(str);
    }

    public String getFormula(){
        print("Enter your Truth formula:\n");
        String val = k.nextLine();
        return val;
    }

    public void stripFormula(){
        String toStrip = getFormula();

        String first = toStrip.substring(toStrip.indexOf("("),toStrip.indexOf(")"));
        toStrip.replace(first,"");


        if (toStrip.contains("^")){
            toStrip.split("^");
        }
    }

}
