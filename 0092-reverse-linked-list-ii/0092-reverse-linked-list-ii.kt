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
    private fun List<Int>.toListNode(): ListNode? {
        if (this.isEmpty()) return null
        var cur = ListNode(0)
        val zero = cur
        for (n in this) {
            cur.next = ListNode(n)
            cur = cur.next
        }
        return zero.next
    }

    private fun reverseList(head: ListNode?): ListNode? {
        val list = mutableListOf<Int>()
        var cur = head
        while (cur != null) {
            list += cur.`val`
            cur = cur.next
        }
        return list.reversed().toListNode()
    }

    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        if (left >= right) return head
        val zero = ListNode(0)
        zero.next = head

        var before = zero
        for (i in 1 until left) before = before!!.next
        var last = before.next
        for (i in left until right) last = last!!.next
        var after = last!!.next

        last.next = null
        before!!.next = reverseList(before.next)
        while (before!!.next != null) before = before.next
        before.next = after
        return zero.next
    }
}
