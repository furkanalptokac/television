package Main;

import java.io.IOException;
import java.net.URI;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scn = new Scanner(System.in);
        int choice = 0;

        System.out.println("What is the channel you want to watch?");
        System.out.println("1- Youtube      11- DMAX");
        System.out.println("2- Kanal D      12- Fox TV");
        System.out.println("3- Show TV      13- Haberturk");
        System.out.println("4- TRT Channels 14- A Haber");
        System.out.println("5- Star TV      15- CNN Turk");
        System.out.println("6- Kanal 24     16- NTV");
        System.out.println("7- ATV          17- Tv8");
        System.out.println("8- Dream TV     18- Bloomberg HT");
        System.out.println("9- TLC          19- TBMM TV");
        System.out.println("10- Kanal 32.   20- Beyaz TV");

        System.out.print("Select a TV Channel what you want to watch: ");
        choice = scn.nextInt();

        switch(choice){
            case 1:
                System.out.println("Opening...");
                TimeUnit.SECONDS.sleep(1);
                java.awt.Desktop.getDesktop().browse(URI.create("https://www.youtube.com"));
                break;
            case 2:
                System.out.println("Opening...");
                TimeUnit.SECONDS.sleep(1);
                java.awt.Desktop.getDesktop().browse(URI.create("https://www.kanald.com.tr/canli-yayin"));
                break;
            case 3:
                System.out.println("Opening...");
                TimeUnit.SECONDS.sleep(1);
                java.awt.Desktop.getDesktop().browse(URI.create("https://www.showtv.com.tr/canli-yayin"));
                break;
            case 4:
                System.out.println("Opening...");
                TimeUnit.SECONDS.sleep(1);
                java.awt.Desktop.getDesktop().browse(URI.create("https://www.trt.net.tr/anasayfa/canli.aspx?y=tv&k=trt1"));
                break;
            case 5:
                System.out.println("Opening...");
                TimeUnit.SECONDS.sleep(1);
                java.awt.Desktop.getDesktop().browse(URI.create("https://www.startv.com.tr/canli-yayin"));
                break;
            case 6:
                System.out.println("Opening...");
                TimeUnit.SECONDS.sleep(1);
                java.awt.Desktop.getDesktop().browse(URI.create("https://www.yirmidort.tv/canli-yayin/"));
                break;
            case 7:
                System.out.println("Opening...");
                TimeUnit.SECONDS.sleep(1);
                java.awt.Desktop.getDesktop().browse(URI.create("https://www.atv.com.tr/webtv/canli-yayin"));
                break;
            case 8:
                System.out.println("Opening...");
                TimeUnit.SECONDS.sleep(1);
                java.awt.Desktop.getDesktop().browse(URI.create("https://www.dreamtv.com.tr/canli-yayin"));
                break;
            case 9:
                System.out.println("Opening...");
                TimeUnit.SECONDS.sleep(1);
                java.awt.Desktop.getDesktop().browse(URI.create("https://www.tlctv.com.tr/canli-izle"));
                break;
            case 10:
                System.out.println("Opening...");
                TimeUnit.SECONDS.sleep(1);
                java.awt.Desktop.getDesktop().browse(URI.create("https://www.kanal32.com.tr/mobil.php?islem=canli"));
                break;
            case 11:
                System.out.println("Opening...");
                TimeUnit.SECONDS.sleep(1);
                java.awt.Desktop.getDesktop().browse(URI.create("https://www.dmax.com.tr/canli-izle"));
                break;
            case 12:
                System.out.println("Opening...");
                TimeUnit.SECONDS.sleep(1);
                java.awt.Desktop.getDesktop().browse(URI.create("https://www.fox.com.tr/canli-yayin"));
                break;
            case 13:
                System.out.println("Opening...");
                TimeUnit.SECONDS.sleep(1);
                java.awt.Desktop.getDesktop().browse(URI.create("https://www.haberturk.com/canliyayin"));
                break;
            case 14:
                System.out.println("Opening...");
                TimeUnit.SECONDS.sleep(1);
                java.awt.Desktop.getDesktop().browse(URI.create("https://www.ahaber.com.tr/video/canli-yayin"));
                break;
            case 15:
                System.out.println("Opening...");
                TimeUnit.SECONDS.sleep(1);
                java.awt.Desktop.getDesktop().browse(URI.create("https://www.cnnturk.com/canli-yayin"));
                break;
            case 16:
                System.out.println("Opening...");
                TimeUnit.SECONDS.sleep(1);
                java.awt.Desktop.getDesktop().browse(URI.create("https://www.ntv.com.tr/canli-yayin/ntv"));
                break;
            case 17:
                System.out.println("Opening...");
                TimeUnit.SECONDS.sleep(1);
                java.awt.Desktop.getDesktop().browse(URI.create("https://www.tv8.com.tr/canli-yayin"));
                break;
            case 18:
                System.out.println("Opening...");
                TimeUnit.SECONDS.sleep(1);
                java.awt.Desktop.getDesktop().browse(URI.create("https://www.bloomberght.com/tv"));
                break;
            case 19:
                System.out.println("Opening...");
                TimeUnit.SECONDS.sleep(1);
                java.awt.Desktop.getDesktop().browse(URI.create("http://tv.tbmm.gov.tr"));
                break;
            case 20:
                System.out.println("Opening...");
                TimeUnit.SECONDS.sleep(1);
                java.awt.Desktop.getDesktop().browse(URI.create("http://www.beyaztv.com.tr/canli-yayin/"));
                break;

        }
    }
}

