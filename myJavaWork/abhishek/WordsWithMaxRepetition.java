package abhishek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class WordsWithMaxRepetition {

   public static void main(String[] args) {
	   
       //String[] wordsToExcludeArr = {"and", "he", "the", "to", "is", "Jack", "Jill"};
	   String[] wordsToExcludeArr = {"is", "are", "a"};
	   
       //List <String> ls= retrieveMostFrequentlyUsedWords("Jack and Jill went to the market to buy bread and cheese. Cheese is Jack’s and Jill’s favorite food.", Arrays.asList(wordsToExcludeArr));
       List <String> ls= retrieveMostFrequentlyUsedWords("Rose is a flower red rose are flower", Arrays.asList(wordsToExcludeArr));
       
   
       System.out.println("I am done : "+ls);
   }

   private static List<String> retrieveMostFrequentlyUsedWords(String literatureText,
                                                               List<String> wordsToExclude) {
       String[] allWords = literatureText.toLowerCase().split("\\W");
       Map<String, Long> allWordsWithCount = Arrays.stream(allWords).collect(
               Collectors.groupingBy(
                       Function.identity(), Collectors.counting()
               ));
       wordsToExclude.stream().map(String::toLowerCase).forEach(allWordsWithCount::remove);
       
       boolean isThere = allWordsWithCount.values().stream().mapToLong(i -> i).max().isPresent();
       if (!isThere) {
           return new ArrayList<>();
       }
       
       long maxCount = allWordsWithCount.values().stream().mapToLong(i -> i).max().getAsLong();
       
       //int maxCount= maxCountData(allWordsWithCount);
       
       List<String> mostUsedWords = new ArrayList<>();
       allWordsWithCount.forEach((word, count) -> {
           if (count == maxCount) mostUsedWords.add(word);
       });
       return mostUsedWords;
   }
     
   
}