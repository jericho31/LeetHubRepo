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
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var n1 = list1
        var n2 = list2
        var cur = ListNode(0)
        val zero = cur
        while (n1 != null && n2 != null) {
            if (n1.`val` < n2.`val`) {
                cur.next = ListNode(n1.`val`)
                cur = cur.next
                n1 = n1.next
            } else {
                cur.next = ListNode(n2.`val`)
                cur = cur.next
                n2 = n2.next
            }
        }
        if (n1 == null) while (n2 != null) {
            cur.next = ListNode(n2.`val`)
            cur = cur.next
            n2 = n2.next
        } else while (n1 != null) {
            cur.next = ListNode(n1.`val`)
            cur = cur.next
            n1 = n1.next
        }
        return zero.next
    }
}
