/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
import java.math.BigInteger

class Solution {
    private fun ListNode?.toAllString(): String {
        if (this == null) return ""
        val sb = StringBuilder()
        var cur = this
        while (cur != null) {
            sb.append(cur.`val`.toString())
            cur = cur.next
        }
        return sb.toString()
    }

    private fun String.toListNode(): ListNode? {
        if (this.any { !it.isDigit() }) return null
        var cur = ListNode(0)
        val zero = cur
        for (c in this) {
            cur.next = ListNode(c - '0')
            cur = cur.next
        }
        return zero.next
    }

    private fun ListNode?.toReversedBigInteger(): BigInteger =
        BigInteger(this.toAllString().reversed())
    
    private fun BigInteger.toReversedListNode(): ListNode {
        return this.toString().reversed().toListNode()!!
    }

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        return (l1.toReversedBigInteger() + l2.toReversedBigInteger()).toReversedListNode()
    }
}
