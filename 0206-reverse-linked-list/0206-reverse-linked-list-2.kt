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
    fun reverseList(head: ListNode?): ListNode? {
        if (head == null) return null
        var prev = head
        var cur = head.next
        head.next = null
        while (cur != null) {
            val next = cur.next
            cur.next = prev
            prev = cur
            cur = next
        }
        return prev
    }
}
