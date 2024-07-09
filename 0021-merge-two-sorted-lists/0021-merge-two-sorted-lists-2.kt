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
        val zero = ListNode(0)
        var n1 = list1
        var n2 = list2
        var cur = zero
        while (n1 != null && n2 != null) {
            if (n1.`val` > n2.`val`) {
                cur.next = n2
                cur = n2
                n2 = n2.next
            } else {
                cur.next = n1
                cur = n1
                n1 = n1.next
            }
        }
        cur.next = if (n1 == null) n2 else n1
        return zero.next
    }
}
