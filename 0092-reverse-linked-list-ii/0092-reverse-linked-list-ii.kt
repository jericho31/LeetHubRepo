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
    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        if (left >= right) return head
        val zero = ListNode(0)
        zero.next = head

        var before = zero
        for (i in 1 until left) before = before.next
        val betweenLast = before.next
        
        var prev = before.next
        var cur = prev.next
        for (i in left until right) {
            val next = cur.next
            cur.next = prev
            prev = cur
            cur = next
        }
        before.next = prev
        betweenLast.next = cur
        return zero.next
    }
}
