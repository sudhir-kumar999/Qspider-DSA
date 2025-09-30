✅ 1. Find Missing Numbers in a Range
🧠 Scenario: A student marks attendance for roll numbers. Some are missing.
🧩 Task: Print all roll numbers from 1 to n that are not present in the given array.

🔸 Input:

arr = {2, 3, 7, 4, 9}, n = 10
🔸 Output:

Missing: 1 5 6 8 10
🔸 Hint:
Add all elements to a HashSet
Loop from 1 to n and check which are missing


✅ 2. Detect Duplicates in Login IDs
🧠 Scenario: You’re verifying user login IDs.
🧩 Task: Print true if there are any duplicate IDs, else false.

🔸 Input:
java
Copy
Edit
ids = {"ram", "shyam", "meera", "ram"}
🔸 Output:
arduino
Copy
Edit
true
🔸 Hint:
Use a HashSet<String> and check if add() returns false

✅ 3. Are All Characters Unique?
🧠 Scenario: You’re checking if a password is secure (no repeated characters).
🧩 Task: Return true if all characters in string are unique.

🔸 Input:
java
Copy
Edit
password = "secure"
🔸 Output:
arduino
Copy
Edit
true
✅ 4. Intersection of Emails
🧠 Scenario: Marketing wants to know which emails are in both “buyers” and “subscribers” lists.
🧩 Task: Return common email addresses.

🔸 Input:
java
Copy
Edit
buyers = {"a@gmail.com", "b@gmail.com", "c@gmail.com"}
subs = {"c@gmail.com", "d@gmail.com", "a@gmail.com"}
🔸 Output:
css
Copy
Edit
a@gmail.com
c@gmail.com
✅ 5. Check if Sentence is Pangram (Easy Version)
🧠 Scenario: Verify if a sentence contains all English lowercase letters at least once.
🧩 Task: Return true if yes.

🔸 Input:
java
Copy
Edit
"The quick brown fox jumps over the lazy dog"
🔸 Output:
arduino
Copy
Edit
true
✅ 6. Count Unique File Extensions
🧠 Scenario: You're scanning files and want to know how many different extensions exist.
🧩 Task: Count unique extensions like .pdf, .txt, .jpg.

🔸 Input:
java
Copy
Edit
files = {"a.pdf", "b.txt", "c.pdf", "d.jpg"}
🔸 Output:
Copy
Edit
3
🔸 Hint:
Use split(".") or substring() to extract extension and store in HashSet

✅ 7. Count Unique Words in Paragraph
🧠 Scenario: Detect vocabulary variety in a student's answer.
🧩 Task: Count how many unique words used.

🔸 Input:
java
Copy
Edit
"The sun shines and the sun sets"
🔸 Output:
cpp
Copy
Edit
5  // the, sun, shines, and, sets
✅ 8. Find Extra Element in Two Arrays
🧠 Scenario: Two arrays — one is missing a single value.
🧩 Task: Find the extra element.

🔸 Input:
java
Copy
Edit
arr1 = {1, 2, 3, 4, 5}
arr2 = {2, 3, 1, 5}
🔸 Output:
Copy
Edit
4
✅ 9. Group Students by Unique Hobbies
🧠 Scenario: Every student has a hobby. How many unique hobbies exist in the class?

🔸 Input:
java
Copy
Edit
hobbies = {"cricket", "coding", "music", "coding", "cricket", "reading"}
🔸 Output:
cpp
Copy
Edit
4  // cricket, coding, music, reading
✅ 10. First Repeating Character
🧠 Scenario: From a stream of characters, return the first character that repeats.

🔸 Input:
java
Copy
Edit
str = "abcdcb"
🔸 Output:
r
Copy
Edit
c
🔸 Hint:
Use HashSet and break on first repeat

✅ 11. Is Subset?
🧠 Scenario: Check if all ingredients are available in stock.

🔸 Input:
java
Copy
Edit
available = {"rice", "wheat", "salt", "oil"}
needed = {"salt", "oil"}
🔸 Output:
arduino
Copy
Edit
true
🔸 Hint:
Use set1.containsAll(set2)

✅ 12. Print Duplicate Characters Only Once
🧠 Scenario: Print each character that appears more than once, only once.

🔸 Input:
java
Copy
Edit
"banana"
🔸 Output:
css
Copy
Edit
a
n
🔸 Hint:
Use two sets: seen, duplicate

✅ 13. Compare Two Sentences for Same Words
🧠 Scenario: Are two sentences made of exactly same words (ignoring order)?

🔸 Input:
java
Copy
Edit
s1 = "the cat sat"
s2 = "sat the cat"
🔸 Output:
arduino
Copy
Edit
true
✅ 14. Is Anagram Using HashSet
🧠 Scenario: Check if two strings are anagrams.

🔸 Input:
java
Copy
Edit
"listen", "silent"
🔸 Output:
arduino
Copy
Edit
true
✅ 15. Words Appearing Only Once
🧠 Scenario: Find all words from a sentence that appear only once.

🔸 Input:
java
Copy
Edit
"I love java and I love coding"
🔸 Output:
nginx
Copy
Edit
java
and
coding
