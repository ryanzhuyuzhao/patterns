package org.mine.patterns.wrapper;

import java.io.*;

/**
 * @ClassName InputTest
 * @Description
 * @Author Administrator
 * @Date 2021/3/24 0024 7:43
 * @Version 1.0
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream((new FileInputStream("d://test.txt"))));
            while ((c = in.read()) >= 0) {
                System.out.println((char)c);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
