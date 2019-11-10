package DataStructure.MyLinkList;

import DataStructure.Obj.ListNode;

/**
 * @Author Voidmian
 * @Date 2019/11/4 17:49
 */
public class MergeTwoLists21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        ListNode ans=null;
        if(l1.val<l2.val) {
             ans = l1;
            l1=l1.next;
        }else {
             ans=l2;
            l2=l2.next;
        }
        ListNode cur=ans;
        while (l1!=null || l2!=null) {
            if(l1 == null){
                cur.next =l2;
                break;
            }
            if(l2 == null){
                cur.next=l1;
                break;
            }
            if(l1.val<l2.val) {
                cur.next= l1;
                l1=l1.next;
            }else {
                cur.next=l2;
                l2=l2.next;
            }
            cur=cur.next;
        }
        return ans;
    }
}
