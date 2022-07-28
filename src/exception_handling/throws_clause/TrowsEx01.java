package exception_handling.throws_clause;

import java.io.BufferedReader;
// import java.io.FileNotFoundException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class B {
    void run() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("out.text")); // Unhandled exception: java.io.FileNotFoundException
        String input = br.readLine();   // Unhandled exception: java.io.IOException
        System.out.println(input);
    }
}

class C {
    void run() throws IOException {
        B b = new B();
        b.run();    // Unhandled exception: java.io.IOException
    }
}

public class TrowsEx01 {

    public static void main(String[] args) {
        C c = new C();
        try {
            c.run();
        } catch (FileNotFoundException fne) {
            System.out.println("out.txt 파일은 설정 파일 입니다. 이 파일이 프로잭트 루트 디렉토리에 존재해야 합니다.");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
