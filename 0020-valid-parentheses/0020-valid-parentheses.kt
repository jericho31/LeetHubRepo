class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        for (c in s) {
            when (c) {
                '(', '{', '[' -> stack += c
                ')' -> if (stack.empty() || stack.pop() != '(') return false
                '}' -> if (stack.empty() || stack.pop() != '{') return false
                ']' -> if (stack.empty() || stack.pop() != '[') return false
            }
        }
        return stack.isEmpty()
    }
}
