package Graphs.WebCrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The implementation of Web Crawler using BFS. This code runs for indefinite time in search of the next website.
 * So, the output of program is not full! Pasted few lines
     * Crawling the website: https://www.bbc.com
     * Website found:: https://gn
     * Website found:: https://static.files.bbci.co.uk
     * Website found:: https://github.com
     * Website found:: https://stackoverflow.com
     * Website found:: https://developer.mozilla.org
     * Website found:: https://www.bbc.co.uk
     * Website found:: https://www.bbc
     * Website found:: https://idcta.api.bbc.co.uk
     * Website found:: https://cdn.optimizely.com
     * Website found:: https://nav.files.bbci.co.uk
     * Website found:: https://mybbc
     * Website found:: https://bbc.gscontxt.net
     * Website found:: https://securepubads.g.doubleclick.net
     * Website found:: https://cdn.adsafeprotected.com
     * Website found:: https://cdn.permutive.com
     * Website found:: https://emp.bbci.co.uk
     * Website found:: https://a1.api.bbc.co.uk
     * Website found:: https://account.bbc.com
     * Website found:: https://search.bbc.co.uk
     * Website found:: https://ichef.bbc.co.uk
     * Website found:: https://static.bbci.co.uk
     * Website found:: https://ychef.files.bbci.co.uk
     * Website found:: https://ichef.bbci.co.uk
     * Website found:: https://www.bbcselect.com
     * Website found:: https://www.bbcglobalnews.com
     * Website found:: https://navpromo.api.bbci.co.uk
     * Website found:: https://sb.scorecardresearch.com
     * Problem while crawling website... Please wait...
     * Problem while crawling website... Please wait...
     * Website found:: https://github.githubassets.com
     * Website found:: https://avatars.githubusercontent.com
 */
public class WebCrawlerUsingBFS {

  private final Queue<String> queue;
  private final List<String> discoveredWebsiteList;

  public WebCrawlerUsingBFS() {
    this.queue = new LinkedList<>();
    this.discoveredWebsiteList = new ArrayList<>();
  }

  public static void main(String[] args) {
    WebCrawlerUsingBFS webCrawlerUsingBFS = new WebCrawlerUsingBFS();
    String website = "https://www.bbc.com";
    System.out.println("Crawling the website: "+ website);
    webCrawlerUsingBFS.discoverWeb(website);
  }
  public void discoverWeb(String root) {
    this.queue.add(root);
    this.discoveredWebsiteList.add(root);
    
    while(!queue.isEmpty()) {
      String website = queue.remove();
      String rawHTML = readURL(website);

      String regexp = "https://(\\w+\\.)*(\\w+)";
      Pattern pattern = Pattern.compile(regexp);
      Matcher matcher = pattern.matcher(rawHTML);

      while(matcher.find()) {
        String nextWebsite = matcher.group();

        if(!discoveredWebsiteList.contains(nextWebsite)) {
          discoveredWebsiteList.add(nextWebsite);
          System.out.println("Website found:: "+ nextWebsite);
          queue.add(nextWebsite);
        }
      }
    }
  }

  private String readURL(String website) {

    StringBuilder stringBuilder = new StringBuilder();
    try {
      URL url = new URL(website);
      BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
      String line;
      while((line=reader.readLine()) != null) {
        stringBuilder.append(line);
      }
      reader.close();
    } catch (Exception e) {
      System.out.println("Problem while crawling website... Please wait...");
    }
    return  stringBuilder.toString();
  }
}
