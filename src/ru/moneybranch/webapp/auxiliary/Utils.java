package ru.moneybranch.webapp.auxiliary;

import java.util.List;

/**
 * stanley
 * 04.01.18.
 */
public  class Utils {

    public static String[] makeTabulation(String build) {

        String[] srtTabArray = new String[build.length()];
        if (build.length() <= 71) {
            return new String[]{build};
        } else if (build.length() >= 71) {
            srtTabArray = build.split("\\.");
        }
        return srtTabArray;
    }

    public static String printArrItem(String[] sourceArr) {
        StringBuilder build = new StringBuilder();

        for (int i = 0; i < sourceArr.length; i++) {
            build.append(sourceArr[i]).append(".\n\t\t\t\t\t\t\t");


        }
        return build.toString();
    }

    public static char[] getOverLine(){
        char[] overline = new char[100];
        for (int i = 0; i < overline.length; i++) {
            overline[i] = '\u203e';

        }
        return  overline;
    }



        public static String passOnCollection(List<String> list){
            String resultStr = "";
            for (String iter: list) {
                resultStr += iter+"\n";
            }
            return  resultStr;
        }


}