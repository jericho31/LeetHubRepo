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
    fun oddEvenList(head: ListNode?): ListNode? {
        var last = ListNode(0)
        val zero = last
        var cur = head
        while (cur != null) {
            last.next = ListNode(cur.`val`)
            last = last.next
            cur = cur.next?.next
        }
        cur = head?.next
        while (cur != null) {
            last.next = ListNode(cur.`val`)
            last = last.next
            cur = cur.next?.next
        }
        return zero.next
    }
}
