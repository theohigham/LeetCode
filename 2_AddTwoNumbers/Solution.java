//Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;

	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        String s1 = listToString(l1);
        s1 = reverse(s1);

        String s2 = listToString(l2); 
        s2 = reverse(s2);

        String sum = String.valueOf(Integer.parseInt(s1) + Integer.parseInt(s2));
        ListNode output = stringToList(sum);

        return output;

    }

    public static String listToString(ListNode head) {

    	String output = "";
    	ListNode node = head;

    	while(true) { // 😅
    		output += node.val;
    		if (node.next != null) {
    			node = node.next;
    		}
    		else {
    			break;
    		}
    	}

    	return output;

    }

    public static String reverse(String s) {
    	String output = "";
    	char[] cs = s.toCharArray();

    	for (int i = s.length() - 1; i >= 0; i-- ) {
    		output += cs[i];
    	}
    	return output;
    }
 
    public static ListNode stringToList(String s) {

    	ListNode head = new ListNode(Character.getNumericValue(s.charAt(s.length()-1)));
    	ListNode node = head;

    	for (int i = s.length()-2; i >=0; i --) {

    		node.next = new ListNode(Character.getNumericValue(s.charAt(i)));
    	
    		if (node.next != null) {
    			node = node.next;
    		}
    	}

    	return head;
    }

    public static void main(String[] args) {
    	
    	ListNode l1 = new ListNode(2);
    	l1.next = new ListNode(4);
    	l1.next.next = new ListNode(3);

    	ListNode l2 = new ListNode(5);
    	l2.next = new ListNode(6);
    	l2.next.next = new ListNode(4);

    	Solution s = new Solution();

    	// System.out.println(s.addTwoNumbers(l1,l2));

    }

}