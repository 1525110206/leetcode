package com.javaweb.algorithm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args){
        /*File file = new File("C:\\Users\\zhang\\Desktop\\note.txt");
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(file);
            byte[] b = new byte[10];
            int len;
            while((len = fis.read(b)) != -1){
                for(int i = 0; i < b.length; i ++){
                    System.out.print((char)b[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fis != null){
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } */

        String src = "C:\\Users\\zhang\\Desktop\\note.txt";
        String dest = "C:\\Users\\zhang\\Desktop\\n.txt";
        FileTest file = new FileTest();
        file.copyFile(src, dest);
    }


public void copyFile(String src, String dest) {
    File s = new File(src);
    File d = new File(dest);

    FileInputStream fis = null;
    FileOutputStream fos = null;

    try {
        fis = new FileInputStream(s);
        fos = new FileOutputStream(d);
        byte[] b = new byte[10];
        int len;
        while ((len = fis.read(b)) != -1) {
            fos.write(b, 0, len);
        }
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (fis != null) {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (fos != null) {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

}
