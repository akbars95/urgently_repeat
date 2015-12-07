package com.mtsmda.jUnit;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by c-DMITMINZ on 07.12.2015.
 */
public class CLM7XHotFixInstaller {

    public static void main(String[] args) {
        patch7143();
    }

    public static void patch7143() {
        String source = "e:\\work\\18052015\\12\\07122015\\RRM\\EM7xplatform\\EdifecsSetupFull\\patches\\CLM_7_1_5_3\\EUO\\CLM\\";
        String destination = "C:\\Edifecs\\EUO\\CLM\\";
        List<File> files = new ArrayList<>();
        getFileRecursively(new File(source), files);
        System.out.println(files.size());
        for (File file : files) {
            String currentFilePath = file.getAbsolutePath();
            System.out.println(currentFilePath);
            newPath(currentFilePath);
//            File destinationSetupFile = new File(destination + File.separator);
        }

    }

    private static String newPath(String absolutePath) {
        StringBuilder newPath = new StringBuilder();
        String s[] = absolutePath.split("\\\\");
        boolean flag = false;
        for (String cur : s) {
            if (cur.equals("CLM")) {
                flag = true;
            }
            if (flag) {
                newPath.append(File.separator).append(cur);
            }
        }
        return newPath.toString();
    }

    private static void getFileRecursively(File file, List<File> files) {
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                File[] fileFolder = file.listFiles();
                for (File fileCurrent : fileFolder) {
                    getFileRecursively(fileCurrent, files);
                }
            } else {
                files.add(file);
            }
        }
    }

}