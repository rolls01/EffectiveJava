package pl.michalrola._2_CreatingAndDestroyingObjects.Item9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

  private static final int BUFFER_SIZE = 100;

  public static void main(String[] args) {

  }

  //try-finally - No longer the best way to close resources!
  static String firstLineOfFileOldWay(String path) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
    try {
      return bufferedReader.readLine();
    } finally {
      bufferedReader.close();
    }
  }

  //try-finally is ugly when used with more than one resource!
  static void copyOldWay(String source, String destination) throws IOException {
    InputStream inputStream = new FileInputStream(source);
    try {
      OutputStream outputStream = new FileOutputStream(destination);
      try {
        byte[] buffer = new byte[BUFFER_SIZE];
        int n;
        while ((n = inputStream.read(buffer)) >= 0) {
          outputStream.write(buffer, 0, n);
        }
      } finally {
        outputStream.close();
      }
    } finally {
      inputStream.close();
    }
  }

  //must implement or extend AutoClosable

  //try-with-resources - the best way to close resources!
  static String firstLineOfFile(String path) throws IOException {
    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
      return bufferedReader.readLine();
    }
  }

  //try-with-resources on multiple resources - short ans sweet!
  static void copy(String source, String destination) throws IOException {
    try (InputStream inputStream = new FileInputStream(source);
        OutputStream outputStream = new FileOutputStream(destination)) {
      byte[] buffer = new byte[BUFFER_SIZE];
      int n;
      while ((n = inputStream.read()) >= 0) {
        outputStream.write(buffer, 0, n);
      }
    }
  }

  //try-with-resources with catch clause
  static String firstLineOffFile(String path, String defaultValue) {
    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
      return bufferedReader.readLine();
    } catch (IOException e) {
      return defaultValue;
    }
  }

}
