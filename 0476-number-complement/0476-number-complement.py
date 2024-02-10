class Solution:
    def findComplement(self, num: int) -> int:
        # Calculate the length of the binary representation of num
        mask_len = len(bin(num)) - 2

        # Create a mask with all 1s of the same length as num
        mask = int("1" * mask_len, 2)

        # XOR the mask with num to get the complement
        return mask ^ num
