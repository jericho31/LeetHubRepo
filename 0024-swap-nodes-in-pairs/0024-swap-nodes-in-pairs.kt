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
        if (head?.next == null) return head
        val zero = ListNode(0)
        zero.next = head

        var cur = zero
        while (cur.next?.next != null) {
            val n1 = cur.next
            val n2 = n1.next
            val n3 = n2.next
            cur.next = n2
            n2.next = n1
            n1.next = n3
            cur = n1
        }
        return zero.next
    }
}
