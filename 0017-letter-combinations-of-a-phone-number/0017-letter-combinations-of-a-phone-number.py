class Solution:
    def letterCombinations(self, digits):
        result = []
        if digits is None or len(digits) == 0:
            return result
        self.generateCombinations(digits, 0, "", result)
        return result

    def generateCombinations(self, digits, index, current, result):
        if index == len(digits):
            result.append(current)
            return
        letters = self.getLetters(digits[index])
        for letter in letters:
            self.generateCombinations(digits, index + 1, current + letter, result)

    def getLetters(self, digit):
        digit_to_letters = {
            '2': "abc",
            '3': "def",
            '4': "ghi",
            '5': "jkl",
            '6': "mno",
            '7': "pqrs",
            '8': "tuv",
            '9': "wxyz"
        }
        return digit_to_letters.get(digit, "")

