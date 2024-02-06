use std::collections::HashMap;


impl Solution {
    pub fn letter_combinations(digits: String) -> Vec<String> {
        let mut result = Vec::new();
        if digits.is_empty() {
            return result;
        }
        let mut map = HashMap::new();
        map.insert('2', "abc");
        map.insert('3', "def");
        map.insert('4', "ghi");
        map.insert('5', "jkl");
        map.insert('6', "mno");
        map.insert('7', "pqrs");
        map.insert('8', "tuv");
        map.insert('9', "wxyz");
        Self::generate_combinations(&digits, 0, &mut String::new(), &mut result, &map);
        result
    }

    fn generate_combinations(
        digits: &str,
        index: usize,
        current: &mut String,
        result: &mut Vec<String>,
        map: &HashMap<char, &str>,
    ) {
        if index == digits.len() {
            result.push(current.clone());
            return;
        }
        if let Some(letters) = map.get(&digits.chars().nth(index).unwrap()) {
            for letter in letters.chars() {
                current.push(letter);
                Self::generate_combinations(digits, index + 1, current, result, map);
                current.pop();
            }
        }
    }
}

