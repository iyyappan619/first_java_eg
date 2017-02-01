package interfaceexample;

import java.util.*;
public class Captcha {
 public String generateCaptcha() {
  Random random = new Random();
  int length = 5;
  StringBuffer captchaStringBuffer = new StringBuffer();
  for (int i = 0; i < length; i++) {
   int captchaNumber = Math.abs(random.nextInt()) % 60;
   int charNumber = 0;
   if (captchaNumber < 26) {
    charNumber = 65 + captchaNumber;
   }
   else if (captchaNumber < 52){
    charNumber = 97 + (captchaNumber - 26);
   }
   else {
    charNumber = 48 + (captchaNumber - 52);
   }
   captchaStringBuffer.append((char)charNumber);
  }

  return captchaStringBuffer.toString();
 } 
}
class Main{
 public static void main(String[] args){
  Captcha captcha = new Captcha();
  String str = captcha.generateCaptcha();
  System.out.println(str);
 }
}
