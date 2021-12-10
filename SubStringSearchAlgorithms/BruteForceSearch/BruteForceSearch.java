package SubStringSearchAlgorithms.BruteForceSearch;

public class BruteForceSearch {

  /**
   * Implementation of search method when provided text and pattern
   * @param text: string where we need to check
   * @param pattern: string which is need to checked for its presence
   * @return index: of the text where the pattern starts(considering text as 0-based array)
   *              : -1 when pattern is not found
   */
  public int search(String text, String pattern) {

    int lengthOfText = text.length();
    int lengthOfPattern = pattern.length();

    for(int i=0; i<=lengthOfText-lengthOfPattern;++i) {

      int j;
      for(j=0; j<lengthOfPattern; ++j) {
        if(text.charAt(i+j) != pattern.charAt(j))
          break;
      }
      if(j== lengthOfPattern)
        return i;
    }
    return -1;
  }

  public boolean isPresent(String text, String pattern) {
    return search(text, pattern) != -1;
  }
}
