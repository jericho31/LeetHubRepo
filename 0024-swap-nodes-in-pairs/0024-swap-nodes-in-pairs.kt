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
    fun swapPairs(head: ListNode?): ListNode? {
        var cur = head
        while (cur != null && cur.next != null) {
            val temp = cur.`val`
            cur.`val` = cur.next.`val`
            cur.next.`val` = temp
            cur = cur.next.next
        }
        return head
    }
}
