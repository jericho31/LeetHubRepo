/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun isPalindrome(head: ListNode?): Boolean {
        val list = mutableListOf<Int>()
        var cur = head
        while (cur != null) {
            list += cur.`val`
            cur = cur.next
        }
        return list == list.reversed()
    }
}
