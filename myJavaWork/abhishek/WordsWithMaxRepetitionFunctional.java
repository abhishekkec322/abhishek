package abhishek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// WordsWithMaxRepetition 2 to get Most Used Word Count in a String
class WordsWithMaxRepetitionFunctional {

   public static void main(String[] args) {
	   
       //String[] wordsToExcludeArr = {"and", "he", "the", "to", "is", "Jack", "Jill"};
	   String[] wordsToExcludeArr = {"is", "are", "a"};
	   
       //List <String> ls= retrieveMostFrequentlyUsedWords("Jack and Jill went to the market to buy bread and cheese. Cheese is Jack’s and Jill’s favorite food.", Arrays.asList(wordsToExcludeArr));
       List <String> ls= retrieveMostFrequentlyUsedWords("Rose is a flower red rose are flower", Arrays.asList(wordsToExcludeArr));
          
       System.out.println("I am done : "+ls);
   }

   private static List<String> retrieveMostFrequentlyUsedWords(String literatureText,
                                                               List<String> wordsToExclude) {	   
	   //A non-word character [^\w]
       String[] allWords = literatureText.toLowerCase().split("\\W");
       
       //we can also write below as "\s" , it matches single whitespace character
       // String[] allWords = literatureText.toLowerCase().split("\\s");
       
       allWords = removeSpecificWords(allWords,wordsToExclude);
       Map<String, Integer> allWordsWithCount= getAllWordsCount(allWords);
       int maxCount = mostUsedWordsCount(allWordsWithCount);
       List<String> mostUsedWords = new ArrayList<>();
      
       allWordsWithCount.forEach((word, count) -> {
           if (count == maxCount) 
        	   mostUsedWords.add(word);
       });
       return mostUsedWords;
   }
   
   //Map of words with count
   public static Map<String, Integer> getAllWordsCount(String [] text) {
		int count;
	Map <String, Integer> wordAndCount= new HashMap<>();   
		for(String st : text){  	
		if(wordAndCount.containsKey(st)) {
			count = wordAndCount.get(st);
			wordAndCount.put(st, count+1);
		}
		else {
		wordAndCount.put(st, 1);
		}
	}
	return wordAndCount;	   
   }
   
   // Remove Specific Words
   public static String[] removeSpecificWords(String [] text, List<String> wordsToExclude) {	
	 List<String> list = new ArrayList<String>(Arrays.asList(text));
	   
	for(String st : text) {		
		if(wordsToExclude.contains(st)) {
			list.remove(st);
		}
	}
	return list.toArray(new String[0]);	   
  }
   
// Remove Specific Words
   public static Integer mostUsedWordsCount( Map<String, Integer>  mapWithWordsAndCount) {	
	 	   Map.Entry<String, Integer> maxEntry = null;
	   
	   for (Map.Entry<String, Integer> entry : mapWithWordsAndCount.entrySet())
	   {
	       if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
	       {
	           maxEntry = entry;
	       }
	   }	   
	   return maxEntry.getValue();
  }
}