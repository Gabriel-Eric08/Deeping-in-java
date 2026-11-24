
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode atual =res;
        int resto =0, valor = 0, sum=0;

        while (l1 != null || l2 != null || resto != 0) {
            int atual_l1= 0, atual_l2 =0;

            if(l1 != null){
                atual_l1 = l1.val;  
            }
            if(l2 != null){
                atual_l2 = l2.val;
            }
            sum = atual_l1 + atual_l2 + resto;
            if(sum >= 10){
                resto =1;
                valor = sum % 10;
            }else{
                valor = sum;
                resto =0;
            }
            atual.next = new ListNode(valor);
            atual = atual.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
         }
        
        return res.next;
    }   
}
