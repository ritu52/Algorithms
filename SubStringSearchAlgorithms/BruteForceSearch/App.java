package SubStringSearchAlgorithms.BruteForceSearch;

public class App {

  /**
   * Brute Force Substring search implementation
     *    ---Brute Force SubString Search-----
     * What is index of 'test' in 'This is a test'? : 10
     * What is index of 'EMA' in 'Seema'? : -1
     * What is index of 'ema' in 'Seema'? : 2
     * What is index of 'Brute Force' in 'Naive Approach- Brute Force'? : 16
     * Is 'test' present in 'This is a test'? : true
     * Is 'EMA' present in 'Seema'? : false
     * Is 'ema' present in 'Seema'? : true
     * Is 'Brute Force' present in 'Naive Approach- Brute Force'? : true
   */
  public static void main(String[] args) {
    BruteForceSearch bruteForceSearch = new BruteForceSearch();
    System.out.println("---Brute Force SubString Search-----");
    System.out.println("What is index of 'test' in 'This is a test'? : "+bruteForceSearch.search("This is a test", "test"));
    System.out.println("What is index of 'EMA' in 'Seema'? : "+bruteForceSearch.search("Seema", "EMA"));
    System.out.println("What is index of 'ema' in 'Seema'? : "+bruteForceSearch.search("Seema", "ema"));
    System.out.println("What is index of 'Brute Force' in 'Naive Approach- Brute Force'? : "
        +bruteForceSearch.search("Naive Approach- Brute Force", "Brute Force"));

    System.out.println("Is 'test' present in 'This is a test'? : "+bruteForceSearch.isPresent("This is a test", "test"));
    System.out.println("Is 'EMA' present in 'Seema'? : "+bruteForceSearch.isPresent("Seema", "EMA"));
    System.out.println("Is 'ema' present in 'Seema'? : "+bruteForceSearch.isPresent("Seema", "ema"));
    System.out.println("Is 'Brute Force' present in 'Naive Approach- Brute Force'? : "
        +bruteForceSearch.isPresent("Naive Approach- Brute Force", "Brute Force"));
  }
}
