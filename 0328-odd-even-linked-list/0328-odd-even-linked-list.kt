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
        if (head?.next?.next == null) return head
        val evenHead = head.next
        var cur = head
        while (true) {
            if (cur!!.next?.next == null) {
                cur.next?.next = null
                cur.next = evenHead
                break
            }
            val n2 = cur.next
            val n3 = n2.next
            cur.next = n3
            n2.next = n3.next
            cur = n3
        }
        return head
    }
}
