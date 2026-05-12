package org.test.example;
import java.util.Random;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.net.ftp.FTPClient;
import org.test.example.*;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {

  static final String HEADER_SIGNATURE = "X-Hub-Signature";
  public static void main(String[] args) throws Exception{

    FTPClient ftpClient = new FTPClient();

    System.out.println(ftpClient.toString());
    Random random = new Random();
    System.out.println(random.nextInt()); System.out.println(random.nextInt());


    String s;
    System.out.println("Hello world!");
    int i = 0;
    boolean f;

    if (i==0){
      f = true;
    }

    // sfsfsdf
    ///sdfsf
    ///sdfsdf

    String p = HEADER_SIGNATURE;
    String p1;

    getSha();

  }

  private static SecretKeySpec getSha(){
    return new SecretKeySpec("secret".getBytes(UTF_8), "HmacSHA1");
  }
}
