[source](https://leetcode.com/problems/detect-capital/?tab=Description)
### 0x00 Description
Given a word, you need to judge whether the usage of capitals in it is right or not.
We define the usage of capitals in a word to be right when one of the following cases holds:
- All letters in this word are capitals, like "USA".
- All letters in this word are not capitals, like "leetcode".
- Only the first letter in this word is capital if it has more than one letter, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.

**Example 1**
```
Input: "USA"
Output: True
```

**Example 2**
```
Input: "FlaG"
Output: False
```
**Note:** The input will be a non-empty word consisting of uppercase and lowercase latin letters.

---

### 0x01 My Solution
> 一道判断字符串大小写格式的问题，读完问题后首先想到的是用正则表达式解决。

#### 具体实现
```
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        String testString = "leetcode";
        boolean result = detectCapital(testString);
        System.out.println("Input: " + testString);
        System.out.println("Output: " + result);
    }

    private static boolean detectCapital(String input) {
        String regex = "\\b[A-Z]+\\b|\\b[a-z]+\\b|\\b[A-Z][a-z]+\\b";
        final Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }
}
```
            
#### 编码过程中发现的知识短板:
- 对Java的正则表达式语法不熟悉

### 0x02 Simplest Solution
利用`Stirng.matches(regex)`方法实现的1-Liner方案。
```
public boolean detectCapital(String word) {
    return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
}
```

### 0x03 Funniest Solution
```
public boolean detectCapitalUse(String word) {
        return word.equals(word.toUpperCase()) || 
               word.equals(word.toLowerCase()) ||
               Character.isUpperCase(word.charAt(0)) && 
               word.substring(1).equals(word.substring(1).toLowerCase());
    }
```


