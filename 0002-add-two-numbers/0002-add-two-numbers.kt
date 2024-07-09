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
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null) return l2
        else if (l2 == null) return l1
        val zero = ListNode(0)
        var cur = zero
        var n1 = l1
        var n2 = l2
        var carry = 0
        while (n1 != null && n2 != null) {
            val add = n1.`val` + n2.`val` + carry
            if (add > 9) {
                cur.next = ListNode(add - 10)
                carry = 1
            } else {
                cur.next = ListNode(add)
                carry = 0
            }
            cur = cur.next
            n1 = n1.next
            n2 = n2.next
        }
        var n3 = if (n1 == null) n2 else n1
        while (n3 != null) {
            val add = n3.`val` + carry
            if (add != 10) {
                cur.next = ListNode(add)
                cur.next.next = n3.next
                carry = 0
                break
            }
            cur.next = ListNode(0)
            cur = cur.next
            n3 = n3.next
        }
        if (carry == 1) cur.next = ListNode(1)
        return zero.next
    }
}
