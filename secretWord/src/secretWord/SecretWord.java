package secretWord;
/**
 * Auto Generated Java Class.
 * By Mikhail Kozhevnikov and Dylan Desai
 */
public class SecretWord {
 //attributes
 private String secretWord;
 private String  hintWord;
 private int numberOfTurns;
 
 //constructor
 public SecretWord()
 {
  this.secretWord = "";
  this.hintWord = "";
  this.numberOfTurns = 0;
 }
 
 //accessors
 public String getSecretWord()
 {
  return this.secretWord;
 }
 public String getHintWord()
 {
  return this.hintWord;
 }
 public int getNumberOfTurns()
 {
  return this.numberOfTurns;
 }
 //mutators
 public void setSecretWord(String aSecretWord)
 {
  this.secretWord = aSecretWord;
 }
 public void setHintWord(String aHintWord)
 {
  //check if they match length and contain stars
//  if (this.secretWord.length() == aHintWord.length())
//  {
//   for (int i = 0; i < aHintWord.length(); i++)
//   {
//    if (aHintWord.charAt(i) == '*' && match != false)
//    {
//    match = true; 
//    }
//    else
//    {
//    match = false;
//    }
//   }
//  }
//  if (match)
//  {
   this.hintWord = aHintWord;
   
//  }
//  else
//  {
//   System.out.println("Invalid hint word.");
//  }
 }
 
 public void setNumberOfTurns(int aNumberOfTurns)
 {
  //should only be between 0 and 5
  if (aNumberOfTurns < 0 || aNumberOfTurns > 5)
  {
   System.out.println("Invalid number of turns.");
  }
  else
  {
   this.numberOfTurns = aNumberOfTurns;
  }
 }
 public void guessLetter(char aGuess)
 {
  char [] hintCopy = this.hintWord.toCharArray();
  char [] wordCopy = this.secretWord.toCharArray();
    
    for (int i=0; i<hintCopy.length; ++i)
    {
      if (wordCopy[i] == aGuess)
      {
        hintCopy[i] = aGuess; 
      }
    }
 //secretWord = new String(hintCopy);
    hintWord = "";
    for (int i = 0; i<hintCopy.length; ++i)
    {
      hintWord += hintCopy[i]; 
    }  
   
 }
 
}
