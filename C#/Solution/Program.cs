using System.Text;

namespace Program
{
    class Program
    {
        static void Main(string[] args)
        {            
          ListNode head = new ListNode(1);
          ListNode x = head.next = new ListNode(2);
        //   ListNode second = head.next = new ListNode(2);
        //   ListNode third = second.next = new ListNode(3);
        //   ListNode four = third.next = new ListNode(4);
        //   ListNode five = four.next = new ListNode(5);


           var res = RemoveNthFromEnd(head, 2);
           while (res != null){
            System.Console.WriteLine($"{res.val}");
                res = res.next;
           }
        }
       
        public static ListNode RemoveNthFromEnd(ListNode head, int n)
        {
            //not the best solution but oh well
            var x = head;
            int counter = 0;
            while (x != null)
            {

                x = x.next;
                counter++;
            }
            if (n == 1 && counter == 1)
            {
                head = null;
                return head;
            }
            if (n == 1 && counter == 2)
            {
                head.next = null;
                return head;
            }
            if (n == counter)
            {
                head = head.next;
                return head;
            }
            int whenToStop = counter - n - 1;
            counter = 0; //reset counter
            ListNode replica = head;
            while (replica.next != null)
            {
                if (counter == whenToStop)
                {
                    replica.next = replica.next.next;
                    break;
                }
                replica = replica.next;
                counter++;
            }
            return head;
        }

        public class ListNode {
            public int val;
            public ListNode next;
            public ListNode(int val = 0, ListNode next= null){
                this.val = val;
                this.next = next;
            }
        }
        public int FindShortestSubArray(int[] nums)
        {
            int degree = 0; //find max frequency of any element (ex.  1,2,2,3,1) degree is 2 because 2 appears twice           
            Dictionary<int, int[]> dict = new Dictionary<int, int[]>();
            
            for (int i = 0; i < nums.Length; i++)
            {
                if (!dict.ContainsKey(nums[i]))
                {
                    dict.Add(nums[i], new int[]{1, i, i});
                } else
                {
                    int[] temp = dict[nums[i]];
                    temp[0]++;
                    temp[2] = i;
                }
            }            

            int lenOfSubArray = int.MaxValue;
            foreach (int[] arr in dict.Values)
            {
                if (arr[0] > degree)
                {
                    degree = arr[0];
                    lenOfSubArray = arr[2] - arr[1] + 1;
                } else if (arr[0] == degree)
                {
                    lenOfSubArray = Math.Min(arr[2] - arr[1] + 1, lenOfSubArray);
                }
            }          
            return lenOfSubArray;
        }

        public static string GcdOfStrings(string str1, string str2)
        {
            if (str1 == "" || str2 == "") return "";
            if (str1[0] != str2[0]) return "";

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < str1.Length - 1; i++)
            {
                if (str1.ElementAt(i) == str2.ElementAt(i))
                {
                    sb.Append(str2.ElementAt(i));
                }
            }

            return sb.ToString();
        }

        public static int RemoveElement(int[] nums, int val)
        {
            int counter = 0;

            for (int i = 0; i < nums.Length; i++)
            {
                if (!Equals(nums[i], val))
                {
                    nums[counter] = nums[i];
                    counter++;
                }
            }
            return counter;
        }

        public static int RemoveDuplicates(int[] nums)
        {
            Console.WriteLine(string.Join(", ", nums));
            int[] unique = nums.Distinct().ToArray();
            Console.WriteLine(string.Join(", ", unique));
            int k = unique.Length;

            for (int i = 0; i < k; i++)
            {
                System.Console.WriteLine("Placing " + unique[i] + " at index " + i);
                nums[i] = unique[i];
            }
            return k;
        }

    }
}