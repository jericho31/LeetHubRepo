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

    fun reverseList(head: ListNode?): ListNode? {
        val list = mutableListOf<Int>()
        var cur = head
        while (cur != null) {
            list += cur.`val`
            cur = cur.next
        }
        return list.reversed().toListNode()
    }
}