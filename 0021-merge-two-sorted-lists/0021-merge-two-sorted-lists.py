class Solution:
    def mergeTwoLists(self, list1, list2):
        # Base cases
        if not list1:
            return list2
        if not list2:
            return list1

        # Initialize the result as a dummy node
        dummy = ListNode()
        current = dummy

        # Iterate over both lists
        while list1 and list2:
            # Compare values and append the smaller node to the result
            if list1.val <= list2.val:
                current.next = list1
                list1 = list1.next
            else:
                current.next = list2
                list2 = list2.next
            current = current.next

        # If one list is longer than the other, append the remaining nodes
        if list1:
            current.next = list1
        else:
            current.next = list2

        return dummy.next